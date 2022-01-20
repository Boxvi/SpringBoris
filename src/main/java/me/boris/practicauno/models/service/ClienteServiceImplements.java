package me.boris.practicauno.models.service;

import me.boris.practicauno.models.dao.IClienteDao;
import me.boris.practicauno.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteServiceImplements implements IClienteService {
    @Autowired
    private IClienteDao iClienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) iClienteDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return iClienteDao.findById(id).orElse(null);
    }


}
