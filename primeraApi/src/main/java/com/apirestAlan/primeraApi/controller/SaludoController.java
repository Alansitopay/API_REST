package com.apirestAlan.primeraApi.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alansaludos")
public class SaludoController {

    @Operation(summary = "Devolverá un Hola Mundo!")
    @GetMapping("/hola")
    public String holaMundo (){
        return "Hola Mundo!";
    }
    @Operation(summary = "Devolvera Hola Mundo!, el nombre del usuario y su edad")
    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaMundoNombre (@PathVariable String nombre, @PathVariable int edad){
        return "Hola Mundo! "+ nombre + " Tu edad es: "+ edad;
    }
}
