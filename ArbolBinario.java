public class ArbolBinario {

    Nodo raiz;

    public ArbolBinario() {

        raiz = null;
    }

    public void insertar(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (raiz == null) {

            raiz = nuevo;

        } else {

            insertarRecursivo(raiz, nuevo);
        }
    }

    private void insertarRecursivo(Nodo actual, Nodo nuevo) {

        if (nuevo.dato > actual.dato) {

            if (actual.derecha == null) {

                actual.derecha = nuevo;

            } else {

                insertarRecursivo(actual.derecha, nuevo);
            }

        } else {

            if (actual.izquierda == null) {

                actual.izquierda = nuevo;

            } else {

                insertarRecursivo(actual.izquierda, nuevo);
            }
        }
    }

    public void mostrarPreOrden(Nodo nodo) {

        if (nodo != null) {

            System.out.println(nodo.dato);

            mostrarPreOrden(nodo.izquierda);

            mostrarPreOrden(nodo.derecha);
        }
    }
}