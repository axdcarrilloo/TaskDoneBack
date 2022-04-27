package com.TaskDoneBack.utils;

public class Constants {

    public static final String UPDATE_ACTIVITY = "UPDATE activity SET codigo = :codigo, estatus = :estatus, fecha_ejecucion = :fechaEjecucion, dias_retraso = :diasRetraso, responsable = :responsable, nombre_responsable = :nombreResponsable, fecha_modificacion = :fechaModificacion WHERE id = :id";
    public static final String CONSULTAR_EMPLEADO_NOMBREOCEDULA = "SELECT * FROM employees WHERE nombre LIKE :consulta% OR cedula LIKE :consulta%";

}
