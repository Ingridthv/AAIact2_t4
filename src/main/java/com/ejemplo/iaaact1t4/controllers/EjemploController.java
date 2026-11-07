package com.ejemplo.iaaact1t4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 

public class EjemploController {
    //Aqui definimos el endpoint que nos devolvera un HTML con la informacion del servidor

    @GetMapping("/detalles_info")
    

    public String info(Model model){
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Ip", "192.168.1.1");

        return "detalles_info";
    }

}
