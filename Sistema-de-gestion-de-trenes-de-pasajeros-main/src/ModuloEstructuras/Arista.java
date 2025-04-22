package ModuloEstructuras;

public class Arista<T> {
    Vertice<T> destino;
    int peso;

    Arista(Vertice<T> destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }
}
