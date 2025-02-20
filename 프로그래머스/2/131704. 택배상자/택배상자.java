import java.util.*; 
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>() ; 
        for(int i= 1 ; i<=order.length ; i++){
            deque.add(i) ; 
        }
        
        for(int i : order){
            while(!deque.isEmpty() && deque.peek()<i){
                stack.push(deque.poll()) ;
            } 
            if(!stack.empty() && stack.peek() == i){
                answer ++ ; 
                stack.pop();
              
            }
            else if(!deque.isEmpty() && deque.peek() == i){
                answer ++ ; 
                deque.poll() ; 
                
            }
            else if(!deque.isEmpty() && !stack.empty() && deque.peek() != i && stack.peek() != i){
                break ;
            }
           
            
        }
        
       
      
        return answer;
    }
    
}