package com.example.examen.Infraetructure.Imp;

import com.example.examen.application.exception.ResourceNotFoundException;
import com.example.examen.Domain.Entities.Reportes;
import com.example.examen.Domain.RepositoriesContracts.ReporteRepository;
import com.example.examen.Infraetructure.Repositories.ReporteRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReporteRpositoryImp implements ReporteRepository {

    @Autowired
    ReporteRepositoryJPA db;


    @Override
    public Reportes guardar(Reportes hola) {
        return db.save(hola);
    }

    @Override
    public Reportes getData(Integer id) {
        return db.findById(id).orElseThrow(
                        ()-> new ResourceNotFoundException("no existe: "+id));
    }

    @Override
    public void deleteData(Integer id) {
        db.deleteById(id);
    }
}
