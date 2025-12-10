package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

// Key: 0 >> NearBy(1,9), NearBy(2,6), NearBy(3,5), NearBy(4,3)
// key: 2 >> NearBy(1,2), NearBy(3,4)

class NearBy{
    int neighbor;
    int weight;
    public NearBy(int vertex, int weight){
        this.neighbor = vertex;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "NearBy [neighbor=" + neighbor + ", weight=" + weight + "]\n";
    }
}
public class DijkstraShortestPath {
    private Map<Integer,List<NearBy>> adjacency;
    private int size;
    public DijkstraShortestPath(int vSize){
        this.size = vSize;
        adjacency = new Hashtable<>();
    }
    public void build(int origin, int reach, int wt){
        adjacency.putIfAbsent(origin, new ArrayList<>());
        adjacency.get(origin).add(new NearBy(reach, wt));
    }
    public int[] findShortest(int begin){
        int[] distance = new int[size];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[begin] = 0;
        Queue<int[]> queue = 
        new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        queue.offer(new int[]{begin,0});
        // poll, compare and update, push
        while(!queue.isEmpty()){
            int[] polled = queue.poll();
            int curVertex = polled[0], curWt = polled[1];
            if(curWt>distance[curVertex]) continue;
            // find neighbors
            if(adjacency.containsKey(curVertex)){
                for(NearBy each:adjacency.get(curVertex)){
                    if(distance[curVertex]+each.weight < distance[each.neighbor]){
                        distance[each.neighbor] = distance[curVertex]+each.weight;
                        queue.offer((new int[]{each.neighbor,each.weight}));
                    }
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        DijkstraShortestPath path = 
        new DijkstraShortestPath(5);
        path.build(0, 1, 9);
        path.build(0, 2, 6);
        path.build(0, 3, 5);
        path.build(0, 4, 3);
        path.build(2, 1, 2);
        path.build(2, 3, 4);
        System.out.println(path.adjacency);
        int[] received = path.findShortest(0);
        System.out.println(Arrays.toString(received));
    }
}