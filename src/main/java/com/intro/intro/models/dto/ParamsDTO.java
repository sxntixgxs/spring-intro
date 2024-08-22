package com.intro.intro.models.dto;

public class ParamsDTO {
    private String message;

    public ParamsDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
