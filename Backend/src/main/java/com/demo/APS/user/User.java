package com.demo.APS.user;

public record User(
        Integer id,
        String nickname,
        String username,
        String email,
        String userPassword
) {

        public int getId() {
                return id;
        }

        public String getNickname() {
                return nickname;
        }

        public String getUsername() {
                return username;
        }

        public String getEmail() {
                return email;
        }

        
}
