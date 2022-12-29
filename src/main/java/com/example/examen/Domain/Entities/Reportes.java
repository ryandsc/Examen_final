package com.example.examen.Domain.Entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder

public class Reportes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Temporal(TemporalType.DATE)
    @Column(name = "fechas",nullable = false)
    private Date fechas;

    @Column(name = "motivos",nullable = false,length = 12)
    private String motivos;

    @ManyToOne
    @JoinColumn(name = "reporte", foreignKey = @ForeignKey(name = "FK_Resporte_Clente"),nullable = false)
    private Cliente clientes;

}
