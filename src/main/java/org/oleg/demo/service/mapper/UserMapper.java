package org.oleg.demo.service.mapper;

import org.oleg.demo.database.entity.User;
import org.oleg.demo.service.model.UserDto;

public class UserMapper {


    public UserDto mapToService(User source) {
        return UserDto.builder()
                .id(source.getId())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .email(source.getEmail())
                .build();
    }
}
