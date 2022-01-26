package me.boris.practicauno.models.service;

import me.boris.practicauno.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();

    public Cliente findById(Long id);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public Cliente update(Cliente cliente,Long id);

}


