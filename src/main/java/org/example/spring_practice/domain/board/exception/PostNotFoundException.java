package org.example.spring_practice.domain.board.exception;

import org.example.spring_practice._common.exception.ApiExceoption;
import org.example.spring_practice._common.exception.ErrorCode;
import org.springframework.http.HttpStatus;


public class PostNotFoundException  extends ApiExceoption{
    public PostNotFoundException() {
        super(ErrorCode.POST_NOT_FOUND);
    }
}
