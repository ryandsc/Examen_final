package com.example.examen.Domain.RepositoriesContracts;

import com.example.examen.Domain.Entities.Reportes;

public interface ReporteRepository {
    Reportes guardar(Reportes hola);

    Reportes getData(Integer id);

    void  deleteData(Integer id);
}
