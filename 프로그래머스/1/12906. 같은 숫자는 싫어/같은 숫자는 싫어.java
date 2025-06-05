import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
   
        ArrayDeque<Integer> que = new ArrayDeque<>();
        for(int num : arr){
           if(que.isEmpty()){
               que.add(num) ; 
           } 
           else if(que.peekLast() == num){
               continue ; 
           }
          else {
              que.add(num) ; 
          }
        }
          int[] answer = new int[que.size()];
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
       int num = 0 ; 
       while(!que.isEmpty()){
           answer[num++] = que.poll() ;
       }
        
       

        return answer;
    }
}