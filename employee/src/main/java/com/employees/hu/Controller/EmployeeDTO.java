package com.employees.hu.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
public class EmployeeDTO {
    @Min(0)
    private Long Id;
    @NotBlank
    private String Name;
    @NotNull
    @Min(18)
    private int age;
    @NotNull
    @Max(375000)
    private int salary;
    @NotNull
    private String position;

}
