package me.boris.practicauno.models.service;

import me.boris.practicauno.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();

    public Cliente findById(Long id);

}


