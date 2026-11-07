package com.ejemplo.iaaact1t4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProyectoController {

    //Aqui definimos el endpoint que nos devolvera un HTML con el nombre del proyecto

    @GetMapping("/proyecto")
    public String proyecto(Model model){
        model.addAttribute("Titulo", "Proyecto de AAI");
        model.addAttribute("Materia", "Programacion Web");

        return "proyecto";
    }
}
