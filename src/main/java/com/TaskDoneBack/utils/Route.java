package com.TaskDoneBack.utils;

public class Route {

    public static final String NAME_APP = "/TaskDone";

    public static final String ACTIVITY_MAIN = "/activity";
    public static final String ACTIVITY_GETALL = "/activity-getall";
    public static final String ACTIVITY_UPDATE = "/activity-update";
    public static final String ACTIVITY_DELETE = "/activity-delete/{id}";
    public static final String ACTIVITY_CALCULAR_FECHA = "/calcular-fecha/{fecha}";
    public static final String ACTIVITY_GETBYCODIGO = "/activity-getbyCodigo/{codigo}";

    public static final String EMPLOYEE_MAIN = "/employee";
    public static final String EMPLOYEE_GETALL = "/employee-getall";
    public static final String EMPLOYEE_GETBYID = "/employee-getbyid/{id}";
    public static final String EMPLOYEE_GETBYNOMBRE_ORCEDULA = "/employee-getbynombreCedula/{consulta}";


}
