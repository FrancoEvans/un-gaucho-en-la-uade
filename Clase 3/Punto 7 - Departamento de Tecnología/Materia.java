package Modelos;

public class Materia {

    private String nombre;
    private String[] correlativas;
    private int cantidad;

    public Materia(String nombre) {

        this.nombre = nombre;

        correlativas = new String[50];
        cantidad = 0;
    }

    public void agregarCorrelativa(String materia) {

        correlativas[cantidad] = materia;
        cantidad++;
    }

    public void mostrarCorrelativas() {

        System.out.println("Correlativas de " + nombre);

        for (int i = 0; i < cantidad; i++) {
            System.out.println(correlativas[i]);
        }
    }
}
