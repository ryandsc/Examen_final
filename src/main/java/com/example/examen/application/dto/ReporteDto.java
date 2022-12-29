package com.example.examen.application.dto;

import com.example.examen.Domain.Entities.Cliente;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Setter
@Builder
@Getter
public class ReporteDto {
    private Integer id;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "America/Lima")
    private Date fechas;

    private String motivos;
}
