package com.example.libaryBook.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginStep1Request {
    @NotBlank(message = "Tên đăng nhập không được để trống!")
    @Size(min = 5, max = 30, message = "Tên đăng nhập phải từ 5-30 ký tự!")
    private String username;
    @NotBlank(message = "Mật khẩu không được để trống!")
    @Size(min = 6, max = 30, message = "Mật khẩu phải từ 6-30 ký tự!")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
