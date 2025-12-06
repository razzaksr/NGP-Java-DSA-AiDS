package graph;

import java.util.ArrayList;
import java.util.List;

public class DirectedDegree {
    private List<List<Integer>> adjList;
    private int verSize;
    public DirectedDegree(int size){
        adjList = new ArrayList<>();
        verSize = size;
        for(int index = 1;index<=size;index++){
            adjList.add(new ArrayList<>());
        }
    }
    public void buildEdges(int row, int col){
        adjList.get(row).add(col);
    }
    public void findDegree(){
        int[] inDegree = new int[verSize];
        int[] outDegree = new int[verSize];
        for(int row=0; row<verSize;row++){
            for(int col : adjList.get(row)){
                outDegree[row]++;
                inDegree[col]++;
            }
        }
        // view found degrees
        for(int index = 0; index<verSize;index++){
            System.out.println("Vertex "+index
            +" In Degree "+inDegree[index]
            +" Out degree "+outDegree[index]);
        }
    }
    public static void main(String[] args) {
        DirectedDegree object = new DirectedDegree(5);
        object.buildEdges(0, 1);
        object.buildEdges(1, 3);
        object.buildEdges(2, 0);
        object.buildEdges(2, 3);
        object.buildEdges(3, 4);
        object.findDegree();
    }
}
