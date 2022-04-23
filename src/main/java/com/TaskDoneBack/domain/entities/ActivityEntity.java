package com.TaskDoneBack.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "activity")
public class ActivityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 6)
    private String codigo;

    @Column(nullable = false, length = 9)
    private String estatus;

    @Column(name = "fecha_ejecucion", nullable = false)
    private Timestamp fechaEjecucion;

    @Column(name = "dias_retraso", nullable = false)
    private Integer diasRetraso;

    @Column(name = "id_responsable", nullable = false)
    private Long idResponsable;

    @Column(name = "fecha_creacion", nullable = false)
    private Timestamp fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Timestamp fechaModificacion;

}
