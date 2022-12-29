package com.example.examen.application.converters;

import com.example.examen.Domain.Entities.Reportes;
import com.example.examen.application.dto.ReporteDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ReporteConverter extends AbstractConverter<Reportes, ReporteDto> {
    @Override
    public ReporteDto fromEntity(Reportes entity) {
        if(entity==null) return  null;
        return ReporteDto.builder()
                .id(entity.getId())
                .fechas(entity.getFechas())
                .motivos(entity.getMotivos())
                .build();
    }

    @Override
    public Reportes fromDTO(ReporteDto dto) {
        if(dto==null) return  null;
        return Reportes.builder()
                .id(dto.getId())
                .fechas(dto.getFechas())
                .motivos(dto.getMotivos())
                .build();
    }
}
