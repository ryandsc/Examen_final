package com.example.examen.Domain.RepositoriesContracts;

import com.example.examen.Domain.Entities.Cliente;
import com.example.examen.Domain.Entities.Reportes;

public interface ClienteRepository {
    Cliente guardar(Cliente hola);

    Cliente getData(Integer id);

    void  deleteData(Integer id);
}
