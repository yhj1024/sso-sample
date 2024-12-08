package org.example.backend.dto;

// 응답용 클래스
public class ApiResponse {
    private String message;

    public ApiResponse(String message) {
        this.message = message;
    }

    // getter
    public String getMessage() {
        return message;
    }
}
