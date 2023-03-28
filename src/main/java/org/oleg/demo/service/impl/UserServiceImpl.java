package org.oleg.demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.oleg.demo.database.entity.User;
import org.oleg.demo.database.entity.repository.UserRepository;
import org.oleg.demo.service.UserService;
import org.oleg.demo.service.model.PageResponse;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public PageResponse<User> getAllSpecified(int pageNumber, int pageSize) {
        return new PageResponse<>(userRepository.findAllSpecified(PageRequest.of(pageNumber,pageSize)));
    }
}
