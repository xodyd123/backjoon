import java.util.*; 
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];
        Arrays.fill(answer , -1) ;
        
        ArrayDeque<Integer> deque = new ArrayDeque<>() ;
         
        for(int i = 0 ; i<numbers.length ; i++){
            while(!deque.isEmpty() && numbers[deque.peekLast()]<numbers[i]){
                answer[deque.pollLast()] = numbers[i] ; 
            }
            
            deque.add(i) ; 
        }
        
       
        return answer;
    }
}