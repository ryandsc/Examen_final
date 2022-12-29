package com.example.examen.application.converters;

import com.example.examen.Domain.Entities.Cliente;
import com.example.examen.Domain.Entities.Reportes;
import com.example.examen.application.dto.ClienteDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ClienteConverter extends AbstractConverter<Cliente, ClienteDto> {

    private ReporteConverter reporteConverter;
    @Override
    public ClienteDto fromEntity(Cliente entity) {
        if(entity==null) return  null;
        return ClienteDto.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .apellidos(entity.getApellidos())
                .reportes(reporteConverter.fromEntity(entity.getReportes()))
                .build();
    }

    @Override
    public Cliente fromDTO(ClienteDto dto) {
        if(dto==null) return  null;
        return Cliente.builder()
                .id(dto.getId())
                .nombre(dto.getNombre())
                .apellidos(dto.getApellidos())
                .reportes(reporteConverter.fromDTO(dto.getReportes()))
                .build();
    }
}
