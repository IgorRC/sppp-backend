package com.spppv1.spppv1.controller;

import com.spppv1.spppv1.models.Documento;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@RestController
public class DocumentoController{

    @CrossOrigin (origins = "http://127.0.0.1:5173")
    @RequestMapping(value = "documento/{id}")
    public Documento getDocumentos(@PathVariable Long id){
        return new Documento(id,"Primer avance","Los objetivos fueron mejorados","20/10/2022");
    }
}
