package com.mycompany.saludofactorial;

import com.mycompany.saludofactorial.entity.FactorialEntity;
import com.mycompany.saludofactorial.servicesImplementation.SaludoFactorialImplementation;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactorialServicesTest {

    @Test
    public void testCalcularFactorial_NumeroPositivo() {
        SaludoFactorialImplementation implementacion = new SaludoFactorialImplementation();
        
        FactorialEntity resultado = implementacion.Factorial(5);
        //Testeo para confirmar el resultado correcto con numero positivo
        assertEquals(120, resultado.getFactorial());
    }

    @Test
    public void testCalcularFactorial_NumeroNegativo() {
        SaludoFactorialImplementation implementacion = new SaludoFactorialImplementation();
        
        FactorialEntity resultado = implementacion.Factorial(-5);
        //Testeo para validar el mensaje de retorno en caso de que el numero sea negativo
        assertEquals("Calculo Incorrecto : El número debe ser un entero no negativo", resultado.getMensaje());
        
    }
}
