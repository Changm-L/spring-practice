package org.example.spring_practice._common.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.spring_practice._common.exception.ErrorCode;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@RequiredArgsConstructor(staticName = "of")
public class ResponseDto<D> {

    private final HttpStatus result;
    private final String message;
    private final D data;

    public ResponseDto<Object> of(ErrorCode e) {
        return ResponseDto.of(e.getStatus(), e.getMessage(), null);
    }

}
