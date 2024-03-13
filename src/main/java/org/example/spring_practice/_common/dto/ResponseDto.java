package org.example.spring_practice._common.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor(staticName = "of")
public class ResponseDto<D> {

    private final int resultCode;
    private final String message;
    private final D data;

}
