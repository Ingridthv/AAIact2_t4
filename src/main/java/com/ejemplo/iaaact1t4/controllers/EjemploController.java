package com.ejemplo.iaaact1t4.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;

import com.ejemplo.iaaact1t4.models.Empleados;


@Controller 

public class EjemploController {
    //Aqui definimos el endpoint que nos devolvera un HTML con la informacion del servidor

    @GetMapping("/detalles_info")
    

    public String info(Model model) {
        Empleados empleado1 = new Empleados("Ingrid", "Arcadio", "Calle etla 143", "Administrador", 21, 953132643, 001   );

        model.addAttribute("empleado", empleado1);

        return "detalles_info";
    }

    @ModelAttribute("Empleados")

    public List<Empleados> LisEmpleados(){
        return Arrays.asList(
            new Empleados("Ingrid", "Arcadio", "Calle etla 143", "Administrador", 21, 953132643, 002),
            new Empleados("Juan", "Perez", "Calle 123", "Vendedor", 30, 123456789, 002),
            new Empleados("Maria", "Gomez", "Calle 456", "Gerente", 40, 987654321, 003)
        );
        
    }

}
