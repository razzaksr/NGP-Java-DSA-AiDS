package graph;

import java.util.ArrayList;
import java.util.List;

// Direct Graph unweighted
public class AdjacencyList {
    private List<List<Integer>> adjUnweighted;
    public AdjacencyList(int size){
        adjUnweighted = new ArrayList<>();
        for(int index = 0; index<size; index++)
            adjUnweighted.add(new ArrayList<>());
    }
    public void buildEdges(int row, int col){
        adjUnweighted.get(row).add(col);
    }
    public void viewList(){
        for(List<Integer> row:adjUnweighted){
            for(Integer temp:row)
                System.out.print(temp+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjacencyList adj = new AdjacencyList(5);
        adj.buildEdges(0,1);
        adj.buildEdges(0, 3);
        adj.buildEdges(1, 3);
        adj.buildEdges(2, 4);
        adj.buildEdges(1, 4);
        adj.buildEdges(4, 3);
        adj.viewList();
    }
}
