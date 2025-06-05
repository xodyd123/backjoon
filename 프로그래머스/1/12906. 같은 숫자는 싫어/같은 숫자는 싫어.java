import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
   
        ArrayDeque<Integer> que = new ArrayDeque<>();
        for(int num : arr){

           if(!que.isEmpty() && que.peekLast() == num){
               continue ; 
           }
           que.add(num);
        }
       int[] answer = new int[que.size()];
       int num = 0 ; 
       while(!que.isEmpty()){
           answer[num++] = que.poll() ;
       }
        return answer;
    }
}