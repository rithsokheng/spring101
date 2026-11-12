package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.model.CreateUserRequest;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // LOGIC
    List<User> getAll();

    User getById(UUID id);

    User create(CreateUserRequest request);

    void delete(UUID id);

}
