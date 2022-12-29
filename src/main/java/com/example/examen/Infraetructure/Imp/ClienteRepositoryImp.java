package com.example.examen.Infraetructure.Imp;

import com.example.examen.Domain.Entities.Cliente;
import com.example.examen.Domain.Entities.Reportes;
import com.example.examen.Domain.RepositoriesContracts.ClienteRepository;
import com.example.examen.Infraetructure.Repositories.ClienteRespositoryJPA;
import com.example.examen.Infraetructure.Repositories.ReporteRepositoryJPA;
import com.example.examen.application.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteRepositoryImp implements ClienteRepository {
    @Autowired
    ClienteRespositoryJPA db;


    @Override
    public Cliente guardar(Cliente hola) {
        return db.save(hola);
    }

    @Override
    public Cliente getData(Integer id) {
        return db.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("no existe: "+id));
    }

    @Override
    public void deleteData(Integer id) {
        db.deleteById(id);
    }
}
