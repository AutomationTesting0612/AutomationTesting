package com.automation.graph;

import java.util.ArrayList;

public class Dfs {

    static class Edge {

        int src;
        int dest;

        Edge(int s, int d) {
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i=0;i< graph.length;i++) {
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(1,0));
        graph[0].add(new Edge(1,3));
        graph[0].add(new Edge(2,0));
        graph[0].add(new Edge(2,4));
        graph[0].add(new Edge(3,1));
        graph[0].add(new Edge(3,4));
        graph[0].add(new Edge(3,5));
        graph[0].add(new Edge(4,2));
        graph[0].add(new Edge(4,3));
        graph[0].add(new Edge(4,5));
        graph[0].add(new Edge(5,3));
        graph[0].add(new Edge(5,4));
        graph[0].add(new Edge(5,6));
        graph[0].add(new Edge(6,5));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visit[]) {

            System.out.println(curr+ "");
            visit[curr]=true;
        for (int i=0;i<graph[curr].size();i++) {
            Edge e = graph[curr].get(i);
            if(visit[e.dest]==false) {
                dfs(graph, e.dest, visit);
            }
        }
    }

    public static void main(String[] args) {

        int V=7;
        ArrayList<Edge> graph[]= new ArrayList[V];

        createGraph(graph);
        boolean visit[] = new boolean[V];

        dfs(graph, 0, visit);
        System.out.println();

    }
}
