package example.Algorithms.dijkstra;

public class dijkstra {
  
    // Finds the shortest distance to a vertice. 
    int minDistance(int dist[], Boolean vistedVertices[], int numVertices)
    {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
 
        for (int v = 0; v < numVertices; v++)
            // if the vertex has not been visted already and the distance is less then the max (ie has been set elsewhere)
            // then save the vertex and set a new min
            if (vistedVertices[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }

    void dijkstra(int graph[][], int src)
    {
        int numVertices = graph.length;
        int dist[] = new int[numVertices]; 

        Boolean vistedVertices[] = new Boolean[numVertices];

        for (int i = 0; i < numVertices; i++) {
            dist[i] = Integer.MAX_VALUE;
            vistedVertices[i] = false;
        }
 
        dist[src] = 0;

        for (int count = 0; count < numVertices - 1; count++) {

            int u = minDistance(dist, vistedVertices, numVertices);
 

            vistedVertices[u] = true;
 
            for (int v = 0; v < numVertices; v++)
 
                // If the next vertex has not been visted and has an edge to the current vertex
                // and the distance of the current vertex (to the source) is not = to the max value
                // and the distance of the current vertex plus the distance to the next vertex is less then the 
                // distance of the next vertex to the source 
                if (!vistedVertices[v] && graph[u][v] != 0
                    && dist[u] != Integer.MAX_VALUE
                    && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
 
 
    } 
}
