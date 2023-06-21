package com.example.demo.user.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginRequest implements Serializable {
    public String name;
    public String password;

}
