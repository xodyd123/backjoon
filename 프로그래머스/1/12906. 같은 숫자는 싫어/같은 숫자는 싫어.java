import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        ArrayDeque<Integer> que = new ArrayDeque<>() ; 
        for(int i : arr){
          if(!que.isEmpty() && que.peekLast() == i) continue ;
          
            que.add(i) ; 
        }        

        return que.stream().mapToInt(Integer::new).toArray();
    }
}