package com.example.MeuProjeto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class MeuRepository {
    private List<String> nomes = new ArrayList<>();

    public void save(String nome) {
        nomes.add(nome);
    }

    public List<String> findAll() {
        return nomes;
    }

    public void deleteAll() {
        nomes = new ArrayList<>();
    }
}
