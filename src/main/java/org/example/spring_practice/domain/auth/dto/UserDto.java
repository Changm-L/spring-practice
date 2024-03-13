package org.example.spring_practice.domain.auth.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.Size;
@Data
@Getter
@Setter
@ToString
public class UserDto {
    private String id;

    @Size(min = 8, max = 20, message = "비밀번호는 8자 이상 20자 이하로 입력해야 합니다.")
    private String password;
}
