package com.automation.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraph {

    static class Edge {

        int s;
        int d;

        public Edge(int s, int d){
            this.s=s;
            this.d=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));
    }

    public static void bfs(ArrayList<Edge> graph[], int V) {

        Queue<Integer> q = new LinkedList<>();
        boolean vist[] = new boolean[V];
        q.add(0);
        while(!q.isEmpty()) {
            int current=q.remove();
            if(vist[current]==false){
                System.out.println(current + " ");
                vist[current] = true;
                for(int i=0;i<graph[current].size();i++) {
                    Edge e = graph[current].get(i);
                    q.add(e.d);
                }
            }
        }

    }

    public static void main(String args[]) {

        int V=4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        //print 2's neighbor

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.d + "");
        }








    }
}
