package graph;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DetectCycleUndirected {
    public Map<Integer, List<Integer>> adjancency;
    int size;
    public DetectCycleUndirected(int vertSize){
        size = vertSize;
        adjancency = new Hashtable<>();
    }
    public void buildEdges(int vertex1, int vertex2){
        adjancency.putIfAbsent(vertex1, new ArrayList<>());
        adjancency.putIfAbsent(vertex2, new ArrayList<>());
        adjancency.get(vertex1).add(vertex2);
        adjancency.get(vertex2).add(vertex1);
    }
    public boolean cyclecDetector(int vertex, 
        boolean[] visisted, int parent){
        visisted[vertex]=true;
        if(adjancency.containsKey(vertex)){
            for(int neighbor:adjancency.get(vertex)){
                if(!visisted[neighbor]){
                    if(cyclecDetector(neighbor, 
                        visisted, vertex))
                        return true;
                }else if(neighbor!=parent) 
                    return true;
            }
        }
        return false;
    }
    public boolean isCycle(){
        boolean[] visited = new boolean[size];
        // traverse through boolean array
        for(int index = 0;index<size;index++){
            if(!visited[index])
                if(cyclecDetector(index, visited, -1))
                    return true;
        }
        return false; // no cycle
    }
    public static void main(String[] args) {
        DetectCycleUndirected cycle = 
        new DetectCycleUndirected(5);
        cycle.buildEdges(0, 1);
        cycle.buildEdges(1, 2);
        cycle.buildEdges(2, 3);
        cycle.buildEdges(3, 4);
        // cycle.buildEdges(4, 0);
        boolean received = cycle.isCycle();
        System.out.println("Is Cycle detected "+received);
    }
}
