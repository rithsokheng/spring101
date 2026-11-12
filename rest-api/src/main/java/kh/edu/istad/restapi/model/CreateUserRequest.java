package kh.edu.istad.restapi.model;

public record CreateUserRequest(
        String name,
        String username,
        String password
) {
}
