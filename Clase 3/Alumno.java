package Modelos;

public class Alumno {

    private int legajo;
    private int prioridad;

    public Alumno(int legajo, int prioridad) {

        this.legajo = legajo;
        this.prioridad = prioridad;
    }

    public int getLegajo() {
        return legajo;
    }

    public int getPrioridad() {
        return prioridad;
    }
}