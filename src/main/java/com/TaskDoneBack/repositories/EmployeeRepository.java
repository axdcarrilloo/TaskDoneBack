package com.TaskDoneBack.repositories;

import com.TaskDoneBack.domain.entities.EmployeeEntity;
import com.TaskDoneBack.utils.Constants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    @Query(value = Constants.CONSULTAR_EMPLEADO_NOMBREOCEDULA, nativeQuery = true)
    List<EmployeeEntity> getByNombreOrCedula(@Param("consulta")String consulta);

}
