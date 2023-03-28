package org.oleg.demo.service;

import org.oleg.demo.database.entity.User;
import org.oleg.demo.service.model.PageResponse;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getById(Long id);
    PageResponse<User> getAllSpecified(int pageNumber, int pageSize);

}
