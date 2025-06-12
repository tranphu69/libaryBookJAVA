package com.example.libaryBook.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class LoginStep2Request {
    @NotBlank(message = "Token tạm thời không được để trống!")
    private String tempToken;
    @NotBlank(message = "Mã OTP không được để trống!")
    @Pattern(regexp = "^\\d{6}", message = "Mã OTP phải là 6 chữ số!")
    private String otpCode;

    public String getTempToken() {
        return tempToken;
    }

    public void setTempToken(String tempToken) {
        this.tempToken = tempToken;
    }

    public String getOtpCode() {
        return otpCode;
    }

    public void setOtpCode(String otpCode) {
        this.otpCode = otpCode;
    }
}
