package clase4.Clases;

import clase4.Interfaces.InterfaceDict;

public class ClassDict implements InterfaceDict {
    private final String[] claves;
    private final String[] valores;
    private int cantidad;

    public ClassDict(int capacidad) {
        this.claves = new String[capacidad];
        this.valores = new String[capacidad];
        this.cantidad = 0;
    }

    public void put(String clave, String valor) {
        if (cantidad < claves.length) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        }
    }

    public String get(String clave) {
        int indice = -1;
        for (int i=0; i < cantidad; i++) {
            if (claves[i].equals(clave)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            return valores[indice];
        }
        return null;
    }

    public void delete(String clave) {
        int indice = -1;
        for (int i=0; i < cantidad; i++) {
            if (claves[i].equals(clave)) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            for (int i = indice; i < cantidad - 1; i++) {
                claves[i] = claves[i + 1];
                valores[i] = valores[i + 1];
            }
            claves[cantidad - 1] = null;
            valores[cantidad - 1] = null;
            cantidad--;
        }
    }
}
