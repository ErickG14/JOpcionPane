package org.example;

import org.example.Controlador.ControladorEjemplo;
import org.example.Vista.Ventana;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Ventana ventana = new Ventana("Ejemplo opcionPane");
        ControladorEjemplo conntroller = new ControladorEjemplo(ventana);
    }
}