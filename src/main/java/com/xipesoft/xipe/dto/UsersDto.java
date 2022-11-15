package com.xipesoft.xipe.dto;

import com.xipesoft.xipe.entities.Profile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UsersDto {
    private Long id;
    private String email;
    private Profile profile;
    private List <TaskDto> tasks = new ArrayList<>();

}
