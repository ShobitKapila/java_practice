package STS_DSA_java;

import java.util.*;

public class HamiltonianCycle {

    public static List<Integer> findHamiltonianCycle(int[][] graph) {
        int n = graph.length;
        List<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[n];

        path.add(0); // Start from the first vertex (0)

        if (hamiltonianCycleUtil(graph, visited, path, 0)) {
            return path;
        }

        return Collections.emptyList(); // If no Hamiltonian Cycle found, return an empty list
    }

    private static boolean hamiltonianCycleUtil(int[][] graph, boolean[] visited, List<Integer> path, int pos) {
        if (pos == graph.length - 1) {
            // Check if the last vertex is connected to the starting vertex (Hamiltonian Cycle condition)
            if (graph[path.get(pos)][path.get(0)] == 1) {
                return true; // Hamiltonian Cycle found
            }
            return false;
        }

        for (int v = 1; v < graph.length; v++) {
            if (!visited[v] && graph[path.get(pos)][v] == 1) {
                visited[v] = true;
                path.add(v);

                if (hamiltonianCycleUtil(graph, visited, path, pos + 1)) {
                    return true;
                }

                visited[v] = false;
                path.remove(path.size() - 1);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 1},
                {1, 0, 1, 0}
        };

        List<Integer> cycle = findHamiltonianCycle(graph);
        System.out.println("Hamiltonian Cycle: " + cycle);
    }
}

