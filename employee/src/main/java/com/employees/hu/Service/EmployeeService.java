package com.employees.hu.Service;

import com.employees.hu.Controller.EmployeeDTO;
import com.employees.hu.Model.EmployeeEntity;
import com.employees.hu.Persist.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
private EmployeeRepository employeeRepository;


@Autowired
public EmployeeService(EmployeeRepository bookRepository) {
        this.employeeRepository = employeeRepository;
        }

public void addEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDTO.getId());
        employeeEntity.setName(employeeDTO.getName());
        employeeRepository.save(employeeEntity);
        }

public void updateEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDTO.getId());
        employeeEntity.setName(employeeDTO.getName());
        employeeRepository.save(employeeEntity);    //minden adatot updatel
        }

public List<EmployeeDTO> getEmployees() {
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for (EmployeeEntity employeeEntity : employeeRepository.findAll()) {
        employeeDTOList.add(new EmployeeDTO(
        employeeEntity.getId(),
        employeeEntity.getName(),
        employeeEntity.getAge(),
        employeeEntity.getSalary(),
        employeeEntity.getPosition()
        ));
        }
        return employeeDTOList;
        }



public List<EmployeeEntity> getEmployees2() {
                return (List<EmployeeEntity>) employeeRepository.findAll();
        }

        public void deleteEmployeeServiceMethod(Long id)
        {
                EmployeeEntity entity = employeeRepository.findById(id).get();
                if (entity == null)
                {
                System.out.println("Nem talalhato ilyen entity, nem lesz torles");
        }
                else
                {
                        employeeRepository.deleteById(id);
                        System.out.println("Az employee torolve lett");
                }
        }


        }