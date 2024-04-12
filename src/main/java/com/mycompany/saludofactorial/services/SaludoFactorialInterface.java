package com.mycompany.saludofactorial.services;

import com.mycompany.saludofactorial.entity.FactorialEntity;
import com.mycompany.saludofactorial.entity.MensajeEntity;


public interface SaludoFactorialInterface {
    
    public MensajeEntity Saludo();
    public FactorialEntity Factorial(int numero);
    
}
