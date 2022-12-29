package com.example.examen.application.Controllers;

import com.example.examen.Domain.Entities.Cliente;
import com.example.examen.Domain.Services.ClienteService;
import com.example.examen.application.converters.ClienteConverter;
import com.example.examen.application.dto.ClienteDto;
import com.example.examen.application.utils.WrapperResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class ClienteControllerController {

    private final ClienteService clienteService;
    private final ClienteConverter clienteConverter;

    public ClienteControllerController(ClienteService clienteService, ClienteConverter clienteConverter) {
        this.clienteService = clienteService;
        this.clienteConverter = clienteConverter;
    }

    @PostMapping
    public ResponseEntity<WrapperResponse<ClienteDto>> crearHola(@RequestBody ClienteDto data ){
        Cliente dataTemp= clienteConverter.fromDTO(data);
        Cliente resultTemp = clienteService.guardar(dataTemp);
        ClienteDto result = clienteConverter.fromEntity(resultTemp);
        return new WrapperResponse<ClienteDto>(true,"success",result)
                .createResponse(HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<WrapperResponse<ClienteDto>> getHola(@PathVariable("id") Integer id){
        Cliente resultTemp = clienteService.getData(id);
        ClienteDto result= clienteConverter.fromEntity(resultTemp);
        return new WrapperResponse<ClienteDto>(true,"success",result)
                .createResponse(HttpStatus.OK);
    }

//    @DeleteMapping("{id}")
//    public ResponseEntity<WrapperResponse<Void>> deleteHola(@PathVariable("id") Integer id){
//        reporteService.deleteData(id);
//        return new WrapperResponse<Void>(true,"success",null)
//                .createResponse(HttpStatus.OK);
//    }

}
