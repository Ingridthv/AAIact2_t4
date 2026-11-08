package com.ejemplo.iaaact1t4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ejemplo.iaaact1t4.models.dto.MateriaDTO;

@Controller
@RequestMapping("/catalogo")
public class MateriaController {

    @Value("${app.autora}")
    private String autora;

    private List<MateriaDTO> materias = List.of(
        new MateriaDTO("Programacion Web", "Desarrollo"),
        new MateriaDTO("Lenguajes y Automatas II", "Sistemas"),
        new MateriaDTO("Conmutacion y Enrutamiento", "Redes")
    );

    //Lista con th:each y filtro con @RequestParam
    @GetMapping("/lista")
    public String lista(@RequestParam(required = false) String area, Model model) {
        List<MateriaDTO> resultado = materias;
        if (area != null) {
            resultado = materias.stream().filter(m -> m.getArea().equals(area)).toList();
        }
        model.addAttribute("autora", autora);
        model.addAttribute("materias", resultado);
        return "lista";
    }

    //Detalle de una materia con @PathVariable
    @GetMapping("/materia/{id}")
    public String detalle(@PathVariable int id, Model model) {
        model.addAttribute("autora", autora);
        model.addAttribute("materias", List.of(materias.get(id)));
        return "lista";
    }

    //Muestra el formulario
    @GetMapping("/nueva")
    public String formulario(Model model) {
        model.addAttribute("materia", new MateriaDTO());
        return "formulario";
    }

    //Recibe el formulario con @ModelAttribute
    @PostMapping("/nueva")
    public String guardar(@ModelAttribute MateriaDTO materia, Model model) {
        model.addAttribute("autora", autora);
        model.addAttribute("materias", List.of(materia));
        return "lista";
    }

    //POST REST que devuelve JSON usando el DTO
    @PostMapping("/api")
    @ResponseBody
    public MateriaDTO recibir(@RequestBody MateriaDTO materia) {
        return materia;
    }
}