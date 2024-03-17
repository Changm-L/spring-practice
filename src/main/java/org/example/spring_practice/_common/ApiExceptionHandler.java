package org.example.spring_practice._common;

import jakarta.servlet.http.HttpServletRequest;
import org.example.spring_practice._common.dto.ResponseDto;
import org.example.spring_practice._common.exception.ApiExceoption;
import org.example.spring_practice._common.exception.ErrorCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({ApiExceoption.class})
    public ResponseDto<Object> exceptionHandler(final ApiExceoption e) {
        return ResponseDto.of(e.getErrorCode().getStatus(), e.getMessage(), null);
    }

    @ExceptionHandler({RuntimeException.class})
    public ResponseDto<Object> exceptionHandler(final RuntimeException e) {
        return ResponseDto.of(ErrorCode.RUNTIME_EXCEPTION.getStatus(), e.getMessage(), null);
    }

    @ExceptionHandler({AccessDeniedException.class})
    public ResponseDto<Object> exceptionHandler(final AccessDeniedException e) {
        return ResponseDto.of(ErrorCode.UNAUTHORIZED.getStatus(), e.getMessage(), null);
    }

    @ExceptionHandler({Exception.class})
    public ResponseDto<Object> exceptionHandler(final Exception e) {
        return ResponseDto.of(ErrorCode.INTERNAL_SERVER_ERROR.getStatus(), e.getMessage(), null);
    }
}
