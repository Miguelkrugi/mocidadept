package com.mocidade.mocidadept.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mocidade.mocidadept.models.repositories.Utilizador;
import com.mocidade.mocidadept.models.repositories.UtilizadorRepository;

@RestController
@RequestMapping(path = "/api/mocidade/utilizadores")
public class UtilizadorController {
    
    private Logger logger = LoggerFactory.getLogger(UtilizadorController.class); 
    @Autowired
    private UtilizadorRepository utilizadorRepository;
    @GetMapping(path = "/seeusers", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Utilizador> getUnits() {
        logger.info("A Exibir os utilizadores");
        return utilizadorRepository.findAllUsers();
    }

    @PostMapping(path = "/registeruser", produces = MediaType.APPLICATION_JSON_VALUE)
    public Utilizador saveUtilizador(@RequestBody Utilizador utilizador){

        Utilizador savedUtilizador = (Utilizador) utilizadorRepository.save(utilizador);

        logger.info("Saving the user...");
        return savedUtilizador;


    }

}
