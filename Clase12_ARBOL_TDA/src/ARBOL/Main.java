package ARBOL;

public class Main {
    public static void main(String[] args) {
        ABB arbol = new ABB();
        arbol.agregarElem(50);
        arbol.agregarElem(30);
        arbol.agregarElem(70);
        arbol.agregarElem(20);
        arbol.agregarElem(40);

        System.out.println(arbol.buscar(40)); // true
        System.out.println(arbol.buscar(99)); // false

        arbol.eliminar(20);
        System.out.println(arbol.buscar(20)); // false

        arbol.eliminar(30);
        System.out.println(arbol.buscar(30)); // false
        System.out.println(arbol.buscar(40)); // true
    }
}