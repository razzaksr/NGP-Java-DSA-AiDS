package graph;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;

public class ReconstructTravelPlan {
    private Map<String,PriorityQueue<String>> graph;
    private LinkedList<String> newOrder;
    public ReconstructTravelPlan(){
        graph = new Hashtable<>();
        newOrder = new LinkedList<>();
    }
    public void build(String departure, String arrival){
        graph.putIfAbsent(departure, 
            new PriorityQueue<>());
        graph.get(departure).add(arrival);
    }
    public void depthFirst(String origin){
        PriorityQueue<String> nextPorts =
         graph.get(origin);
         while(nextPorts!=null&&!nextPorts.isEmpty()){
            String neighbor = nextPorts.poll();// ATL, SFO
            depthFirst(neighbor);
         }
         newOrder.addFirst(origin);
    }
    public static void main(String[] args) {
        ReconstructTravelPlan plan = 
        new ReconstructTravelPlan();
        plan.build("JFK", "SFO");
        plan.build("JFK", "ATL");
        plan.build("SFO", "ATL");
        plan.build("ATL", "JFK");
        plan.build("ATL", "SFO");
        System.out.println(plan.graph);
        plan.depthFirst("JFK");
        System.out.println(plan.newOrder);
    }
}
