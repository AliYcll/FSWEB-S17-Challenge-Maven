package com.workintech.spring17challenge.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
    private Integer id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @Min(0)
    @Max(4)
    private Integer credit;
    
    @NotNull
    private Grade grade;
}