package com.example.examen.Domain.Services;

import com.example.examen.Domain.Entities.Cliente;
import com.example.examen.Domain.Entities.Reportes;
import com.example.examen.Domain.RepositoriesContracts.ClienteRepository;
import com.example.examen.Domain.RepositoriesContracts.ReporteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente guardar(Cliente hola){
        return clienteRepository.guardar(hola);
    }

    public Cliente getData(Integer id){
        return clienteRepository.getData(id);
    }

    public void deleteData(Integer id){
        clienteRepository.deleteData(id);
    }
}
