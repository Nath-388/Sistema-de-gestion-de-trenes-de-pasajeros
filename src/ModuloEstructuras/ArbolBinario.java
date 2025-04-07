package ModuloEstructuras;

public class ArbolBinario<T extends Comparable<T>> {
    //Para busquedas eficientes
    protected class NodoArbol{
        T dato;
        NodoArbol izquierdo;
        NodoArbol derecho;

        NodoArbol(T dato){
            this.dato = dato;
        }
    }
private NodoArbol raiz;
}
