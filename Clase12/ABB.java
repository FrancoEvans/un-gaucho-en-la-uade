package ARBOL;

class NodoABB {
    int info;
    ABB hijoIzq;
    ABB hijoDer;
}

class ABB implements ABBTDA {
    NodoABB nodo = null;

    public boolean arbolVacio() { return nodo == null; }
    public int raiz()           { return nodo.info; }
    public ABB hijoIzq()     { return nodo.hijoIzq; }
    public ABB hijoDer()     { return nodo.hijoDer; }

    public void agregarElem(int x) {
        if (nodo == null) { // ARBOL VACIO
            nodo = new NodoABB();
            nodo.info = x;
            nodo.hijoIzq = new ABB(); // CREA SUBARBOL IZQUIERDO VACIO
            nodo.hijoDer = new ABB(); // CREA SUBARBOL DERECHO VACIO
        } else if (nodo.info > x) {
            nodo.hijoIzq.agregarElem(x); // DELEGA A LA IZQUIERDA
        } else if (nodo.info < x) {
            nodo.hijoDer.agregarElem(x); // DELEGA A LA DERECHA
        }
        // SI nodo.info == x, NO PASA NADA (NO DUPLICADOS)
    }

    public boolean buscar(int x) {
        if (nodo == null) {
            return false;
        } else if (nodo.info == x) {
            return true;
        } else if (nodo.info > x) {
            return nodo.hijoIzq.buscar(x);
        } else {
            return nodo.hijoDer.buscar(x);
        }
    }


    public void eliminar(int x) {
        if (nodo == null) return;
        if (nodo.info == x) {
            // CASO 1
            if (nodo.hijoDer.arbolVacio() && nodo.hijoIzq.arbolVacio()) { // NO TIENE HIJOS -> ES HOJA
                nodo.hijoIzq = null;
                nodo.hijoDer = null;
                nodo = null;
                // CASO 2
            } else if (!nodo.hijoIzq.arbolVacio() ^ !nodo.hijoDer.arbolVacio()) { // TIENE UN SOLO HIJO
                NodoABB hijo = (!nodo.hijoIzq.arbolVacio()) ? nodo.hijoIzq.nodo : nodo.hijoDer.nodo;
                nodo.info    = hijo.info;    // reescribe al hijo en el nodo actual
                nodo.hijoIzq = hijo.hijoIzq;
                nodo.hijoDer = hijo.hijoDer;
                // CASO 3
            } else { // TIENE VARIOS HIJOS -> busca el MENOR que tenga el HIJO DERECHO
                ABB actual = nodo.hijoDer;
                while (!actual.nodo.hijoIzq.arbolVacio()) {
                    actual = actual.nodo.hijoIzq;
                }
                nodo.info = actual.nodo.info; // el MENOR reemplaza al eliminado
                nodo.hijoDer.eliminar(actual.nodo.info); // el reemplazante se elimina
            }
        } else if (nodo.info > x) {
            nodo.hijoIzq.eliminar(x); // delega a la izquierda
        } else {
            nodo.hijoDer.eliminar(x); // delega a la derecha
        }
    }
}
