package com.xipesoft.xipe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProfileDto {
    private Long id;
    private String phone;
    private UsersDto users;
    private String password;

}
