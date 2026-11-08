package com.ejemplo.iaaact1t4.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api/parametros")

public class RquestParamControllers {
    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam (required = false, defaultValue = "Hola a todos de parte de ingrid") String informacion) {
        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(informacion);
        return parametro1;

    }
    
    

}
