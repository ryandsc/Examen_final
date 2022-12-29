package com.example.examen.application.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Builder
@Getter
public class ClienteDto {
    private Integer id;

    private String nombre;

    private String apellidos;

    private List<ReporteDto> reportes;
}
