package com.example.examen.Domain.Services;

import com.example.examen.Domain.Entities.Reportes;
import com.example.examen.Domain.RepositoriesContracts.ReporteRepository;
import org.springframework.stereotype.Service;

@Service
public class ReporteService {

    private final ReporteRepository reporteRepository;

    public ReporteService(ReporteRepository reporteRepository) {
        this.reporteRepository = reporteRepository;
    }

    public Reportes guardar(Reportes hola){
        return reporteRepository.guardar(hola);
    }

    public Reportes getData(Integer id){
        return reporteRepository.getData(id);
    }

    public void deleteData(Integer id){
        reporteRepository.deleteData(id);
    }

}
