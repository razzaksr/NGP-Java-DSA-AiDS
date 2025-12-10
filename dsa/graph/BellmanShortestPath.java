package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class BellmanShortestPath {
    private Map<Integer,List<NearBy>> adjacency;
    private int size;
    public BellmanShortestPath(int vSize){
        this.size = vSize;
        adjacency = new Hashtable<>();
    }
    public void build(int origin, int reach, int wt){
        adjacency.putIfAbsent(origin, new ArrayList<>());
        adjacency.get(origin).add(new NearBy(reach, wt));
    }
    public void findShort(int begin){
        int[] dist = new int[size];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[begin] = 0;
        for(int times = 1; times<size; times++){
            for(Integer origin:adjacency.keySet()){
                for(NearBy each:adjacency.get(origin)){
                    if(dist[origin]!=Integer.MAX_VALUE
                        &&dist[origin]+each.weight<
                        dist[each.neighbor]){
                            dist[each.neighbor] =
                             dist[origin]+each.weight;
                    }
                }
            }
        }
        // check for negative weighted cycle
        for(Integer origin:adjacency.keySet()){
            for(NearBy each:adjacency.get(origin)){
                if(dist[origin]!=Integer.MAX_VALUE
                    &&dist[origin]+each.weight<
                    dist[each.neighbor]){
                        System.out.println("Graph contains a negative weighted cycle!");
                        return;
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
    public static void main(String[] args) {
        BellmanShortestPath path = 
        new BellmanShortestPath(5);
        path.build(0, 1, -1);
        path.build(0, 2, 4);
        path.build(1, 2, 3);
        path.build(1, 3, 2);
        path.build(1, 4, 2);
        path.build(3, 2, 5);
        path.build(3, 1, 1);
        path.build(4, 3, -3);
        path.findShort(0);
        BellmanShortestPath path2 = 
        new BellmanShortestPath(3);
        path2.build(0, 1, 1);
        path2.build(1, 2, -1);
        path2.build(2, 0, -1);
        path2.findShort(0);
    }
}
