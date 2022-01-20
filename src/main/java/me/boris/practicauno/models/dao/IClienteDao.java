package me.boris.practicauno.models.dao;

import me.boris.practicauno.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente,Long> {
}
