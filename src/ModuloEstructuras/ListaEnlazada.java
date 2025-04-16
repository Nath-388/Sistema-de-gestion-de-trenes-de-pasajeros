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
        Nodo nuevo= new Nodo(elemento);
        if(cabeza == null){
            cabeza = nuevo;
        }
        else{
            Nodo temp = cabeza;
            while(temp.siguiente != null){
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }
    public void Eliminar(T elemento){
        Nodo nuevo= new Nodo(elemento);
        if(cabeza == null){
            System.out.println("No hay elementos en la lista");
        }
        else{
            Nodo temp = cabeza;
            while(temp != null){
                if(temp.dato.equals(elemento)){
                    temp=temp.siguiente;
                    System.out.println("El elemento " + elemento + " se eliminado en la lista");
                }
            }
        }

    }
}
