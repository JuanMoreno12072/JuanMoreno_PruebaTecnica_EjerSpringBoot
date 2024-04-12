package com.mycompany.saludofactorial.entity;

public class FactorialEntity {

    private int numero;
    private long factorial;
    private String mensaje;

    public FactorialEntity(int numeroCons, long factorialCons, String mensajeCons) {
        numero = numeroCons;
        factorial = factorialCons;
        mensaje = mensajeCons;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getFactorial() {
        return factorial;
    }

    public void setFactorial(long factorial) {
        this.factorial = factorial;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
