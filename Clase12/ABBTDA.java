package ARBOL;

public interface ABBTDA {
    int raiz();
    ABB hijoIzq();
    ABB hijoDer();
    void agregarElem(int x);
    void eliminar(int x);
    boolean buscar(int x);
    boolean arbolVacio();
}
