package clase4.Clases;

import clase4.Interfaces.InterfaceCola;

public class ClassCola implements InterfaceCola {
    private final String[] elementos;
    private int cantidad;
    private int primero;
    private int ultimo;

    public ClassCola(int capacidad) {
        this.elementos = new String[capacidad];
        this.primero = 0;
        this.ultimo = 0;
        this.cantidad = 0;
    }

    public void agregar(String elemento) {
        if (cantidad != elementos.length) {
            elementos[ultimo] = elemento;
            ultimo = (ultimo + 1) % elementos.length; // circular >> 'ultimo' llega al final y vuelve a 0
            cantidad++;
        }
    }

    public String sacar() {
        if (cantidad > 0) {
            String elemento = elementos[primero];
            elementos[primero] = null;
            primero = (primero + 1) % elementos.length;
            cantidad--;
            return elemento;
        }
        return null;
    }

    public String get_primero() {
        return elementos[primero];
    }

    public boolean colaVacia() {
        return (cantidad == 0);
    }
}
