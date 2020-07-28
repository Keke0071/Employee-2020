package com.employees.hu.Controller;

import com.employees.hu.Model.EmployeeEntity;
import com.employees.hu.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("addEmployee")
    @ResponseBody
    public void addEmployee(@Valid @RequestBody EmployeeDTO employeeDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
        }
        else {
            employeeService.addEmployee(employeeDTO);
        }
    }

    @PostMapping("updateEmployee")
    @ResponseBody
    public void updateEmployee(@Valid @RequestBody EmployeeDTO employeeDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            System.out.println(bindingResult.getAllErrors());
        }
        else {
            employeeService.updateEmployee(employeeDTO);
        }
    }

    @GetMapping("Employee")
    @ResponseBody
    public List<EmployeeDTO> employeeEntities() {
        return employeeService.getEmployees();
    }

    @GetMapping("Employee2")
    @ResponseBody
    public List<EmployeeEntity> employeeEntities2() {
        return employeeService.getEmployees2();
    }

    @GetMapping(value = "/employeedelete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        System.out.println("Delete employee with id: " + id);

        employeeService.deleteEmployeeServiceMethod(id);


    }



}
