package ModuloEstructuras;

public class Vertice {
    T dato;
    ListaEnlazada<Arista<T>> adyacentes;
    int distancia; // Para Dijkstra
    boolean visitado;

    public Vertice(T dato) {
        this.dato = dato;
        this.adyacentes = new ListaEnlazada<>();
        this.distancia = Integer.MAX_VALUE;
        this.visitado = false;
    }

    @Override
    public int compareTo(Vertice<T> otro) {
        return this.distancia - otro.distancia;
    }
}
