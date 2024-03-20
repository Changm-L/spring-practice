package org.example.spring_practice.domain.auth.presentaion;

import jakarta.validation.Valid;
import org.example.spring_practice._common.dto.ResponseDto;
import org.example.spring_practice.domain.auth.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/test")
    public void test() {
        System.out.println("Test");
    }

    @PostMapping("/log-in")
    public ResponseDto<Object> logIn(@Valid @RequestBody UserDto userDto, BindingResult result) {

        return ResponseDto.of(HttpStatus.OK, "Message", null);
    }
}
