package com.TaskDoneBack.services;

import com.TaskDoneBack.domain.entities.EmployeeEntity;
import com.TaskDoneBack.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeEntity getById(Long id) {
        return employeeRepository.findById(id).get();
    }

    public List<EmployeeEntity> getAll() {
        return employeeRepository.findAll();
    }

    public List<EmployeeEntity> getByNombreCedula(String consulta) {
        return employeeRepository.getByNombreOrCedula(consulta);
    }

}
