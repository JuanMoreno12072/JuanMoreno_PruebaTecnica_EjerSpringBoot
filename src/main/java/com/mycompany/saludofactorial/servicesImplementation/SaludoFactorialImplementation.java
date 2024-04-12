package com.mycompany.saludofactorial.servicesImplementation;

import com.mycompany.saludofactorial.entity.FactorialEntity;
import com.mycompany.saludofactorial.entity.MensajeEntity;
import com.mycompany.saludofactorial.services.SaludoFactorialInterface;
import org.springframework.stereotype.Service;

@Service
public class SaludoFactorialImplementation implements SaludoFactorialInterface {

    @Override
    public MensajeEntity Saludo() {
        //Se crea instancia de la clase MensajeEntity para asignar valores y retornar JSON en la salida del servicio
        MensajeEntity mensaje = new MensajeEntity();
        mensaje.setEquipo("NTTData - Latam");
        mensaje.setMensaje("Saludos!!!");
        return mensaje;
    }

    @Override
    public FactorialEntity Factorial(int numero) {
        //Se valida que el numero sea un entero positivo
        //En caso de que no lo sea se retorna entidad con mensaje de advertencia
        if (numero < 0) {
            FactorialEntity factorial = new FactorialEntity(numero, 0, "Calculo Incorrecto : El número debe ser un entero no negativo");
            return factorial;
        } else {
            //En caso de que el numero sea valido se calcula el factorial
            long factorialAcumulada = 1;
            for (int i = 1; i <= numero; i++) {
                factorialAcumulada *= i;
            }
            //Se retorna entidad con valores calculados y mensaje de confirmacion
            FactorialEntity factorial = new FactorialEntity(numero, factorialAcumulada, "Calculo Correcto");
            return factorial;
        }
    }

}
