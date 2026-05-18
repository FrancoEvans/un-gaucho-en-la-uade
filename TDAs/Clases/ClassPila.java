package clase2;

public class ClassPila implements InterfacePila {
    private final int[] datos; // final — la referencia no cambia
    private int cantidad; // NO final — el valor cambia constantemente

    public ClassPila(int capacidad) {
        this.datos = new int[capacidad];
        this.cantidad = 0;
    }

    @Override
    public void apilar(int x) {
        if (cantidad < datos.length) {
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void desapilar() {
        if (!pilaVacia()) {
            cantidad--;
        }
    }

    @Override
    public int tope() {
        return datos[cantidad - 1];
    }

    @Override
    public boolean pilaVacia() {
        return cantidad == 0;
    }
}

// @Override se pone en ClassPila porque esos métodos están implementando los que declaró InterfacePila. Es exactamente el caso de uso de @Override — le decís al compilador "este método existe porque lo exige la interfaz".
// Si lo sacás, el código funciona igual, pero @Override actúa como red de seguridad: si escribís mal el nombre (por ejemplo Apilar en vez de apilar), el compilador te avisa en vez de crear silenciosamente un método nuevo que nunca se usa.
// En la interfaz en cambio no va @Override — ahí solo declarás los métodos, no los implementás.