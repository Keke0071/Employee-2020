package com.employees.hu.Persist;

import com.employees.hu.Model.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {
        }
