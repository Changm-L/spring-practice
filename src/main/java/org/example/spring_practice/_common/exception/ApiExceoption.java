package org.example.spring_practice._common.exception;

import lombok.Getter;

@Getter
public class ApiExceoption extends RuntimeException{
    private final ErrorCode errorCode;

    public ApiExceoption(ErrorCode e) {
        super(e.getMessage());
        this.errorCode = e;
    }
}
