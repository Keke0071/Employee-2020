package com.employees.hu.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "employee")
@ToString
@Data



@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    @Id
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