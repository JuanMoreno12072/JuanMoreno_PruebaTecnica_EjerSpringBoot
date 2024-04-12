package com.mycompany.saludofactorial.controller;

import com.mycompany.saludofactorial.entity.FactorialEntity;
import com.mycompany.saludofactorial.entity.MensajeEntity;
import com.mycompany.saludofactorial.services.SaludoFactorialInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    SaludoFactorialInterface saludofactorialinterface;

    @GetMapping("/hola")
    public MensajeEntity EnviarSaludo() {
        return saludofactorialinterface.Saludo();        
    }

    @GetMapping("/factorial/{numero}")
    public FactorialEntity CalculaFactorial(@PathVariable int numero) {
        return saludofactorialinterface.Factorial(numero);        
    }

}
