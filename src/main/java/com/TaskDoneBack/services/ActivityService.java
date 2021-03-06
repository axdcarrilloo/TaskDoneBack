package com.TaskDoneBack.services;

import com.TaskDoneBack.domain.entities.ActivityEntity;
import com.TaskDoneBack.repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    public Integer calcularFecha(Timestamp fechaEjecucion) {
        Timestamp fechaActual = getCurrentDay();
        LocalDate dateAfter = LocalDate.of(fechaActual.getYear(), fechaActual.getMonth(), fechaActual.getDate());
        LocalDate dateBefore = LocalDate.of(fechaEjecucion.getYear(), fechaEjecucion.getMonth(), fechaEjecucion.getDate());
        Integer retraso = Integer.parseInt(ChronoUnit.DAYS.between(dateBefore, dateAfter) + "");
        return retraso;
    }

    public Timestamp getCurrentDay() {
        Long datetime = System.currentTimeMillis();
        Timestamp fechaModificacion = new Timestamp(datetime);
        return fechaModificacion;
    }

    public Long delete(Long id) {
        Long r = 0l;
        if(id != null) {
            activityRepository.deleteById(id);
            r = 1l;
        }
        return r;
    }

    public List<ActivityEntity> getAll() {
        return activityRepository.findAll();
    }

    public Long update(Long id, String codigo,  String estatus, Timestamp fechaEjecucion, Integer diasRetraso, Long responsable, String nombreResponsable){
        Long result = 0l;
        if(id != null && codigo != null && estatus != null && fechaEjecucion != null && diasRetraso != null && responsable != null && nombreResponsable != null){
            Timestamp fechaModificacion = getCurrentDay();
            diasRetraso = calcularFecha(fechaEjecucion);
            activityRepository.update(id, codigo, estatus, fechaEjecucion, diasRetraso, responsable, nombreResponsable, fechaModificacion);
            result = 1l;
        }
        return result;
    }

    public List<ActivityEntity> getByCodigo(String codigo) {
        List<ActivityEntity> listActivity = new ArrayList<ActivityEntity>();
        listActivity.add(activityRepository.findByCodigo(codigo));
        return listActivity;
    }

}
