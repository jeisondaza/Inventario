package com.example.Inventario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {

    @RequestMapping("/")
    public String greting() {
        return "¡Hola a todos!";
    }
    @RequestMapping("/con")
    public String bye(){
        return "Adios a todos";
    }
}
