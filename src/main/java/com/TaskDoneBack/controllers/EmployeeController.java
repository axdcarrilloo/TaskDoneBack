package com.TaskDoneBack.controllers;

import com.TaskDoneBack.domain.entities.ActivityEntity;
import com.TaskDoneBack.domain.entities.EmployeeEntity;
import com.TaskDoneBack.services.EmployeeService;
import com.TaskDoneBack.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.NAME_APP+Route.EMPLOYEE_MAIN, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = Route.EMPLOYEE_GETBYID, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeEntity> getById(@PathVariable Long id) {
        return new ResponseEntity<EmployeeEntity>(employeeService.getById(id), HttpStatus.OK);
    }

    @GetMapping(value = Route.EMPLOYEE_GETALL, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeEntity>> getAll() {
        return new ResponseEntity<List<EmployeeEntity>>(employeeService.getAll(), HttpStatus.OK);
    }

}
