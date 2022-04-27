package com.TaskDoneBack.repositories;

import com.TaskDoneBack.domain.entities.ActivityEntity;
import com.TaskDoneBack.utils.Constants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityEntity, Long> {

    @Modifying
    @Transactional
    @Query(value = Constants.UPDATE_ACTIVITY, nativeQuery = true)
    void update(@Param("id")Long id, @Param("codigo")String codigo, @Param("estatus")String estatus, @Param("fechaEjecucion") Timestamp fechaEjecucion,
                @Param("diasRetraso")Integer diasRetraso, @Param("responsable")Long responsable, @Param("nombreResponsable")String nombreResponsable, @Param("fechaModificacion")Timestamp fechaModificacion);

    ActivityEntity findByCodigo(String codigo);
}
