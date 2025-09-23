package com.example.identity_service.mapper;

import com.example.identity_service.dto.request.UserCreationRequest;
import com.example.identity_service.dto.request.UserUpdateRequest;
import com.example.identity_service.dto.request.response.UserResponse;
import com.example.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
     User toUser(UserCreationRequest request);
    //o day du lieu nhan ve 1 parameter la request theo kieu UserCreationRequest va se tra ve 1 class la User
    UserResponse toUserResponse(User user);
    //Map tu User ve UserResponse
    @Mapping(target = "roles", ignore = true)
     void updateUser(@MappingTarget User user, UserUpdateRequest request);
     //map cac data tu UserUpdateRequest vao User
}
