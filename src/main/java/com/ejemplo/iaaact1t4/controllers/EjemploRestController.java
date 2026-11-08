package com.ejemplo.iaaact1t4.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.iaaact1t4.models.Empleados;
import com.ejemplo.iaaact1t4.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;




@RestController 
@RequestMapping("/api")

public class EjemploRestController {

    //Aqui definimos el endpoint que nos devolvera un JSON con la informacion del servidor

     @GetMapping(path= "/detalles_info2")

    public ClaseDTO detalles_info2 (){  //Creamos un mapa para almacenar la informacion que queremos devolver en formato JSON
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Ingrid Arcadio");

        return usuario1;
        //Devolvemos el mapa como respuesta en formato JSON
    }

}
