package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TopologicalOrder {
    private Map<Integer, List<Integer>> graph;
    private int[] indegree;
    private Queue<Integer> queue = new LinkedList<>();
    private List<Integer> topo = new ArrayList<>();
    public TopologicalOrder(int vertex){
        graph = new Hashtable<>();
        indegree = new int[vertex+1];
    }
    public void buildEdges(int vertex1, int vertex2){
        graph.putIfAbsent(vertex1, new ArrayList<>());
        graph.get(vertex1).add(vertex2);
        indegree[vertex2]++;
    }
    public void orderTopo(){
        for(int index = 1; index<indegree.length; index++){
            if(indegree[index]==0)
                queue.offer(index);
        }
        System.out.println(queue+" queue");
        System.out.println(graph);
        // find orderTopo
        while(!queue.isEmpty()){
            int polled = queue.poll();
            topo.add(polled);
            for(int neighbor: graph.getOrDefault(polled, Collections.emptyList())){
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    queue.offer(neighbor);
                    System.out.println(queue);
                }
            }
        }
        if(topo.size()==indegree.length-1){
            for(int each:topo)
                System.out.print(each+" -> ");
        }else{
            System.out.println("Cycle detected");
        }
    }
    public static void main(String[] args) {
        TopologicalOrder order = new TopologicalOrder(6);
        order.buildEdges(1, 2);
        order.buildEdges(1, 3);
        order.buildEdges(3, 4);
        order.buildEdges(2, 4);
        order.buildEdges(4, 5);
        order.buildEdges(5, 6);
        order.orderTopo();
    }
}
