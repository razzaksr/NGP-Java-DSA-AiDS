package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphTraversals {
    public Map<Integer,List<Integer>> adjacents;
    public GraphTraversals(){
        adjacents = new Hashtable<>();
    }
    public void buildEdges(int key, int value){
        adjacents.putIfAbsent(key, new ArrayList<>());
        adjacents.get(key).add(value);
    }
    public void bFs(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start); queue.offer(start);
        while(!queue.isEmpty()){
            int polled = queue.poll();
            System.out.print(polled+" -> ");
            if(adjacents.containsKey(polled)){
                for(int neighbor : adjacents.get(polled)){
                    if(!visited.contains(neighbor)){
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                }
            }
        }
        System.out.println();
    }
    public void dFs(int start, Set<Integer> visited){
        visited.add(start);
        System.out.print(start+" -> ");
        if(adjacents.containsKey(start)){
            for(int neighbor:adjacents.get(start)){
                if(!visited.contains(neighbor))
                    dFs(neighbor,visited);
            }
        }
    }
    public static void main(String[] args) {
        GraphTraversals travsersal = new GraphTraversals();
        travsersal.buildEdges(0, 1);
        travsersal.buildEdges(1, 3);
        travsersal.buildEdges(2, 0);
        travsersal.buildEdges(2, 3);
        travsersal.buildEdges(3, 4);
        // System.out.println(travsersal.adjacents);
        travsersal.bFs(0);
        Set<Integer> depthVisted = new HashSet<>();
        travsersal.dFs(0, depthVisted);
    }
}
