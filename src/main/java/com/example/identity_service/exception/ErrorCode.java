package com.example.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZEO_EXCEPTION(9999, "Uncategoried error"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTED(1002, "User existed"),
    USERNAME_INVALID(1003, "Username must be at lest 3 characters"),
    PASSWORD_INVALID(1004, "Password must be at lest 8 characters"),
    USER_NOT_EXISTED(1005, "User not existed")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
