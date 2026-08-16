public class NodoDistancia implements Comparable<NodoDistancia> {
    private int vertice;
    private int distancia;
    public NodoDistancia(int vertice, int distancia) {
        this.vertice = vertice;
        this.distancia = distancia;
    }
    public int getVertice() {
        return vertice;
    }

    public int getDistancia() {
        return distancia;
    }
    @Override
    public int compareTo(NodoDistancia otro) {
        return Integer.compare(this.distancia, otro.distancia);
    }
}