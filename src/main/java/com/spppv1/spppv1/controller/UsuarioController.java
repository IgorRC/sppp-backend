package com.spppv1.spppv1.controller;

import com.spppv1.spppv1.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {



    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        return new Usuario(id,"Igor","Ramos Cruzado","igor.ramos@unas.edu.pe","igor123");
    }
}
