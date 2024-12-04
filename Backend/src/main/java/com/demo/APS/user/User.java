package com.demo.APS.user;

public record User(
        Integer id,
        String name,
        String username,
        String email,
        String password
) {
}
