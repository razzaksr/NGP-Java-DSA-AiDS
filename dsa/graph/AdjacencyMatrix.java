package graph;

// undirected and wieghted
public class AdjacencyMatrix {
    private int[][] adjacencyWeighted;
    public AdjacencyMatrix(int verSize){
        adjacencyWeighted = new int[verSize][verSize];
    }
    public void buildEdge(int ver1,int ver2, int weight){
        adjacencyWeighted[ver1][ver2] = weight;
        adjacencyWeighted[ver2][ver1] = weight;
    }
    public void viewMatrix(){
        for(int[] row : adjacencyWeighted){
            for(int col:row) System.out.print(col+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjacencyMatrix adjacent = 
        new AdjacencyMatrix(5);
        adjacent.buildEdge(0,1,100);
        adjacent.buildEdge(0, 3, 250);
        adjacent.buildEdge(1, 3, 75);
        adjacent.buildEdge(2, 4, 60);
        adjacent.buildEdge(1, 4, 100);
        adjacent.buildEdge(4, 3, 10);
        adjacent.viewMatrix();
    }
}
