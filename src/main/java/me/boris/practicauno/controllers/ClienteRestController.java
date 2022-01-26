package me.boris.practicauno.controllers;

import me.boris.practicauno.models.entity.Cliente;
import me.boris.practicauno.models.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})// ( }, )especificar
@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    private IClienteService iClienteService;

    @GetMapping("/read")
    public List<Cliente> index() {
        return iClienteService.findAll();
    }

    @GetMapping("/clientes/{id}")//id de aki
    public Cliente show(@PathVariable Long id) {
        return iClienteService.findById(id);
    }


    @PostMapping("/create")
    @ResponseStatus (HttpStatus.CREATED)
    public  Cliente saves(@RequestBody Cliente cliente) {
        return iClienteService.save(cliente);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        iClienteService.delete(id);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus (HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id){
        Cliente clienteactual  = iClienteService.findById(id);
        clienteactual.setNombre(cliente.getNombre());
        clienteactual.setApellido(cliente.getApellido());
        clienteactual.setEmail(cliente.getEmail());
        clienteactual.setCreate_at(cliente.getCreate_at());
        return iClienteService.save(clienteactual);
    }


}
