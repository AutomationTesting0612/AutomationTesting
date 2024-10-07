package com.automation.graph;

import cucumber.api.java.ja.但し;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DisconnectedComponentGraph {


    static class Edge {

        int src;

        int dest;

        public Edge(int s, int d) {
            this.src=s;
            this.dest= d;
        }

    }

    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i=0;i< graph.length;i++){
            graph[i]= new ArrayList<Edge>();
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

    public static void bfs(ArrayList<Edge> graph[], int V, boolean vist[], int start) {
        Queue<Integer> queue= new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()) {
            int current = queue.remove();
            if(vist[current]== false) {

                System.out.println(current + "");
                vist[current]= true;

                for(int i=0;i<graph[current].size();i++){
                    Edge e= graph[current].get(i);
                    queue.add(e.dest);
                }

            }


        }
    }

    public static void main(String[] args) {

        int V=7;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean vist[] = new boolean[V];

        for(int i=0;i<V;i++){
            if(vist[i]==false){
                bfs(graph, V, vist, i);
            }
        }



        System.out.println();








    }
}



