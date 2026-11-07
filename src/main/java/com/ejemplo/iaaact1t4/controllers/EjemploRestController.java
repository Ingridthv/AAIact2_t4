package com.ejemplo.iaaact1t4.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 

public class EjemploRestController {

    //Aqui definimos el endpoint que nos devolvera un JSON con la informacion del servidor

    @GetMapping("/detalles_info2")
    

    public Map<String, Object> detalles_info2 (){
//Creamos un mapa para almacenar la informacion que queremos devolver en formato JSON

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Ip", "192.168.1.1");
        //Agregamos la informacion al mapa

        return respuesta;
        //Devolvemos el mapa como respuesta en formato JSON
    }

}
