package me.boris.practicauno.controllers;

import me.boris.practicauno.models.entity.Cliente;
import me.boris.practicauno.models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})// ( }, )especificar
@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    private IClienteService iClienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return iClienteService.findAll();
    }

    @GetMapping("/clientes/{id}")//id de aki
    public Cliente show(@PathVariable Long id) {
        return iClienteService.findById(id);
    }

}
