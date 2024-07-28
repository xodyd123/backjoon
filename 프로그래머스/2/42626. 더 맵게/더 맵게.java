import java.util.*; 
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : scoville){
            queue.add(num) ; 
        }
    
        while(!queue.isEmpty()){
            if(queue.peek() >= K){
                break ;
            }
            else{
                if(queue.size() >= 2){
                    int num1 = queue.poll();
                    int num2 = queue.poll();
                    int range = num1 + (num2*2) ;
                    queue.add(range);
                    answer++;
                }
                else{
                    break;
                }
                
            }
            
        }
        if(queue.size() == 1 && queue.poll() < K){
           
            return -1 ; 
        }
  
      
        
        return answer ; 
        
     
    }
}