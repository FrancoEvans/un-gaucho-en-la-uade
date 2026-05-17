package Modelos;

public class MainSistema {

    public static void main(String[] args) {

        Alumno a1 = new Alumno(1001, 10);
        Alumno a2 = new Alumno(1002, 5);

        Materia prog2 = new Materia("Programacion II");

        prog2.agregarCorrelativa("Programacion I");
        prog2.agregarCorrelativa("Algebra");

        System.out.println("Alumno prioritario: " + a1.getLegajo());

        prog2.mostrarCorrelativas();
    }
}
