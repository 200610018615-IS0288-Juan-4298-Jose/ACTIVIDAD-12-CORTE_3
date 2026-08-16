# Actividad 12: Implementación de Estructuras No Lineales - Grafos y Algoritmos de Rutas

## Descripción del Proyecto
Proyecto desarrollado en Java que implementa una estructura de datos de **Grafo No Dirigido** utilizando **Listas de Adyacencia**. Incluye algoritmos fundamentales de exploración (**BFS** y **DFS**) y cálculo de caminos mínimos (**Dijkstra**).



## Cuadro Comparativo: Matriz vs. Lista de Adyacencia

| Característica | Matriz de Adyacencia | Lista de Adyacencia (Implementada) |
| :--- | :--- | :--- |
| **Representación** | Una matriz bidimensional de tamaño $V \times V$ donde las celdas indican la presencia y peso de las aristas. | Un mapa de listas (Map<Integer, List<Arista>>) donde cada vértice almacena únicamente sus conexiones directas. |
| **Uso de Memoria** | $O(V^2)$. Consume mucha memoria incluso si el grafo tiene pocas conexiones (grafos dispersos). | $O(V + E)$. Altamente eficiente, ya que solo ocupa espacio por los vértices y las aristas existentes. |
| **Eficiencia para buscar una arista** | $O(1)$ directo mediante los índices de la matriz. | $O(V)$ o $O(\text{grado del vértice})$ recorriendo la lista de adyacencia. |
| **Justificación de Elección** | Descartada por el alto desperdicio de memoria si el grafo no es denso. | **Seleccionada** porque optimiza el uso de memoria y se adapta de forma dinámica al crecimiento de vértices y aristas ponderadas. |
