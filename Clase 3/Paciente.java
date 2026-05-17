package Modelos;

import Interfaces.PilaTDA;
import Implementacion.Estrategia_1;

public class Paciente {

    private String nombre;
    private int prioridad;
    private PilaTDA sintomas;

    public Paciente(String nombre, int prioridad) {

        this.nombre = nombre;
        this.prioridad = prioridad;

        sintomas = new Estrategia_1();
        sintomas.InicializarPila();
    }

    public void agregarSintoma(int codigoSintoma) {
        sintomas.Apilar(codigoSintoma);
    }

    public int ultimoSintoma() {
        return sintomas.Tope();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }
}