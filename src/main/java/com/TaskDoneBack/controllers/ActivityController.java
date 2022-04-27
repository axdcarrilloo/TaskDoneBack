package com.TaskDoneBack.controllers;

import com.TaskDoneBack.domain.entities.ActivityEntity;
import com.TaskDoneBack.domain.entities.EmployeeEntity;
import com.TaskDoneBack.services.ActivityService;
import com.TaskDoneBack.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping(value = Route.NAME_APP+Route.ACTIVITY_MAIN)
@CrossOrigin(origins = "*")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping(value = Route.ACTIVITY_CALCULAR_FECHA)
    public ResponseEntity<Integer> calcularRetraso(@PathVariable Timestamp fecha) {
        return new ResponseEntity<Integer>(activityService.calcularFecha(fecha), HttpStatus.OK);
    }

    @DeleteMapping(value = Route.ACTIVITY_DELETE)
    public ResponseEntity<Long> delete(@PathVariable Long id) {
        return new ResponseEntity<Long>(activityService.delete(id), HttpStatus.OK);
    }

    @PutMapping(value = Route.ACTIVITY_UPDATE)
    public ResponseEntity<Long> update(@RequestBody ActivityEntity activity) {
        return new ResponseEntity<Long>(activityService.update(activity.getId(), activity.getCodigo(), activity.getEstatus(), activity.getFechaEjecucion(),
                activity.getDiasRetraso(), activity.getResponsable(), activity.getNombreResponsable()), HttpStatus.OK);
    }

    @GetMapping(value = Route.ACTIVITY_GETALL, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ActivityEntity>> getAll() {
        return new ResponseEntity<List<ActivityEntity>>(activityService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = Route.ACTIVITY_GETBYCODIGO, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ActivityEntity>> getByCodigo(@PathVariable String codigo) {
        return new ResponseEntity<List<ActivityEntity>>(activityService.getByCodigo(codigo), HttpStatus.OK);
    }

}
