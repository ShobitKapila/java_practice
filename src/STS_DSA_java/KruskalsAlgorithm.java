package STS_DSA_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Edge {
    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class DisjointSet {
    int[] parent, rank;

    DisjointSet(int size) {
        parent = new int[size];
        rank = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) {
            return;
        }

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }
}

public class KruskalsAlgorithm {

    public static List<Edge> kruskalMST(List<Edge> edges, int V) {
        Collections.sort(edges, Comparator.comparingInt(e -> e.weight));
        List<Edge> mst = new ArrayList<>();
        DisjointSet ds = new DisjointSet(V);

        for (Edge edge : edges) {
            int srcRoot = ds.find(edge.src);
            int destRoot = ds.find(edge.dest);

            if (srcRoot != destRoot) {
                mst.add(edge);
                ds.union(srcRoot, destRoot);
            }
        }

        return mst;
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        List<Edge> mst = kruskalMST(edges, V);

        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
}

