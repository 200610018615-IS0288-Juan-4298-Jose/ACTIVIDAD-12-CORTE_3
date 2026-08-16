public class Main {
    public static void main(String[] args) {
        
        Grafo grafo = new Grafo();

        grafo.agregarArista(1, 2, 4);
        grafo.agregarArista(1, 3, 2);
        grafo.agregarArista(2, 4, 5);
        grafo.agregarArista(3, 4, 8);
        grafo.agregarArista(3, 5, 10);
        grafo.agregarArista(4, 5, 2);

        System.out.println("prueba de camino. :3");

        System.out.print("BFS partiendo desde el nodo 1: ");
        
        System.out.println();

        System.out.print("DFS partiendo desde el nodo 1: ");
        
        System.out.println();

        System.out.println("\n--- Distancias mínimas con Dijkstra desde el nodo 1 ---");
 
    }
}

