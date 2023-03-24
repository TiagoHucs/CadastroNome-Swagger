package com.example.MeuProjeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class MeuService {
    public static final Logger LOGGER = Logger.getLogger(MeuService.class.getName());

    @Autowired
    private MeuRepository repository;

    public void salvar(String nome) {
        repository.save(nome);
    }

    public List<String> listar() {
        return repository.findAll();
    }

    public void deletaTudo(){
        repository.deleteAll();
    }
}
