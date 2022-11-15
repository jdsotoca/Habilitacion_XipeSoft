package com.xipesoft.xipe.dto;

import com.xipesoft.xipe.enums.Enum_StateTask;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TaskDto {
    public Long id;
    public String title;
    public String description;
    private Enum_StateTask states;
}
