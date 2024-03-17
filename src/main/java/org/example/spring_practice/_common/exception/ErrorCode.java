package org.example.spring_practice._common.exception;

import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@ToString
public enum ErrorCode {

    RUNTIME_EXCEPTION(HttpStatus.BAD_REQUEST, "올바른 요청형식이 아닙니다."),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "인증정보가 유효하지 않습니다."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "서버 에러"),
    POST_NOT_FOUND(HttpStatus.NOT_FOUND, "게시글을 찾을 수 없습니다.");

    private final HttpStatus status;
    private final String message;

    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

}
