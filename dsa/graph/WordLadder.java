package graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
    Set<String> wordSet;
    public WordLadder(List<String> words){
        wordSet = new HashSet<>();
        wordSet.addAll(words);
    }
    public int findLadder(String start, String dest){
        if(!wordSet.contains(dest)) return 0;
        // implementation
        int count = 1;
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        Set<String> visited = new HashSet<>();
        visited.add(start);
        while(!queue.isEmpty()){
            // find how many words in current level
            // size = no of words in level
            // level: HIT( 1 word), level 2: HOT(1 word)
            // level 3:dot lot(2 words)
            // level 4: dog log(2 words)
            // level: 5: cog
            int size = queue.size();
            for(int index=0;index<size;index++){
                String polled = queue.poll();
                if(polled.equals(dest)) return count;
                char[] splited = polled.toCharArray();
                for(int pos = 0;pos<splited.length;pos++){
                    char og = splited[pos];
                    for(char alpha = 'a';alpha<='z';alpha++){
                        if(alpha==og) continue;
                        splited[pos] = alpha;
                        String newOne = new String(splited);
                        if(wordSet.contains(newOne)&&!visited.contains(newOne)){
                            visited.add(newOne); queue.offer(newOne);
                        }
                    }
                    splited[pos]=og;
                }
            }
            count++;
        }
        return 0;
    }
    public static void main(String[] args) {
        String begin = "hit", target = "cog";
        WordLadder ladder = new WordLadder(
            Arrays.asList("hot","dot","dog",
            "lot","log","cog"
            )
        );
        int received = ladder.findLadder(begin, target);
        System.out.println(received);
    }
}
