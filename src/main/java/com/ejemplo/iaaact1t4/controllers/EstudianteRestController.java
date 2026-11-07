package com.ejemplo.iaaact1t4.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteRestController {

    //Aqui definimos el endpoint que nos devolvera un JSON con la lista de materias

    @GetMapping("/materias")
    public Map<String, Object> materias(){
        //Creamos un mapa para almacenar las materias
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Materias", List.of(
            "Programacion Web",
            "Lenguajes y Automatas II",
            "Conmutacion y Enrutamiento de redes de datos"
        ));

        //Devolvemos el mapa como respuesta en formato JSON
        return respuesta;
    }

    //Aqui definimos el endpoint que nos devolvera un JSON con datos del estudiante

    @GetMapping("/estudiante")
    public Map<String, Object> estudiante(){
        //Creamos un mapa para almacenar la informacion del estudiante
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Iniciales", "AAI");
        respuesta.put("Semestre", 7);

        //Devolvemos el mapa como respuesta en formato JSON
        return respuesta;
    }
}