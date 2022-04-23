package com.TaskDoneBack.services;

import com.TaskDoneBack.domain.entities.ActivityEntity;
import com.TaskDoneBack.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public List<ActivityEntity> getAll() {
        return activityRepository.findAll();
    }

}
