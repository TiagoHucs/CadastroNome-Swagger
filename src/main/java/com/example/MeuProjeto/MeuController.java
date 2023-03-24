package com.example.MeuProjeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/nomes")
public class MeuController {

    @Autowired
    private MeuService service;

    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public ResponseEntity<Void> salvar(@RequestBody String nome){
        service.salvar(nome);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public ResponseEntity<List<String>> listar(){
        return ResponseEntity.ok().body(service.listar());
    }
}
