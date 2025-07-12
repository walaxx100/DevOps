package com.example.devops.controller;

import com.example.devops.dto.ClienteDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @GetMapping("/cliente")
    public ResponseEntity<ClienteDto> getCliente(){
        ClienteDto cliente = new ClienteDto();
        cliente.setNombre("Ana");
        cliente.setApellido("González");
        cliente.setTelefono("7744-2233");
        cliente.setDireccion("Av. Central #45, San Salvador");
        cliente.setAltura(1.68);
        cliente.setPeso(62.0);
        cliente.setDui("12345678-9");
        cliente.setEdad(28);

        return ResponseEntity.ok(cliente);
    }
}
