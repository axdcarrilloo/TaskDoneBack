package com.TaskDoneBack.controllers;

import com.TaskDoneBack.domain.entities.ActivityEntity;
import com.TaskDoneBack.services.ActivityService;
import com.TaskDoneBack.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = Route.NAME_APP+Route.ACTIVITY_MAIN, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping(value = Route.ACTIVITY_GETALL, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ActivityEntity>> getAll() {
        return new ResponseEntity<List<ActivityEntity>>(activityService.getAll(), HttpStatus.OK);
    }

}
