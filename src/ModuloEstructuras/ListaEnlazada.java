package ModuloEstructuras;

public class ListaEnlazada<T> {

    private static class Nodo <T>{
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato){
            this.dato = dato;
            this.siguiente = null;
        }
    }
    private Nodo<T> cabeza;
    private int numNodos;

    public ListaEnlazada(){
        cabeza = null;
        numNodos=0;
    }

    public void agregar(T elemento){
    }
    public void Eliminar(T elemento){

    }
}
