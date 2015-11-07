package com.dataimage.m3_lab3.controllers.test;

import com.dataimage.m3_lab3.model.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"pruebas", "test"})
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("titulo", "Hola comparito.....");
        model.addAttribute("texto", "Estamos pasando parametros");
        return "test/index";
    }

    @RequestMapping("informacion")
    public String alternativo() {
        return "test/informacion";
    }

    @RequestMapping(value = {"info", "prueba"})
    public String pruebas() {
        return "test/pruebas";
    }

    @ModelAttribute
    public void informacion(Model model) {
        model.addAttribute("titulo", "Estamos accediendo a atributros comunes ");
        model.addAttribute("texto", "texto secundario");
    }

    @RequestMapping("parametros")
    public String goParam(String nombre, String apellido,String genero, Model model) {
        model.addAttribute("nombre", nombre);
        model.addAttribute("apellido", apellido);
        model.addAttribute("genero",genero);
        return "test/formulario";
    }
    
    @RequestMapping("binding")
    public String goParam(Persona persona, Model model) {
        model.addAttribute("persona",persona);
        return "test/formulario2";
    }

}
