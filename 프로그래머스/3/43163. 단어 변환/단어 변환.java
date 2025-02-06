import java.util.*; 
class Solution {
    public int solution(String begin, String target, String[] words) {
        ArrayDeque<Node> deque = new ArrayDeque<>(); 
        boolean[] bol = new boolean[words.length] ; 
        Node node = new Node(begin , 0);
        deque.add(node) ; 
        int answer = 0 ; 
        while(!deque.isEmpty()){
            Node poll = deque.poll() ;
            if(poll.str.equals(target)) {
                answer = poll.dict ; 
                break ; 
            }
            
            for(int i = 0 ; i<words.length ; i++){
                if(!check(poll.str , words[i])) {
                    continue ; 
                }
                if(bol[i]){
                    continue ; 
                } 
                bol[i] = true ; 
                deque.add(new Node(words[i] , poll.dict+1));
                
            }
  
            }
            System.out.println(Arrays.toString(bol)); 
            return answer;
        }
        
    
    
    
    public boolean check(String poll , String target){
        int num = 0 ;
        
        for(int i = 0 ; i<poll.length() ; i++){
            if(poll.charAt(i) != target.charAt(i)) {
                num++ ; 
            }
           
        }
        if(num == 1) {
            return true ;
        }
        
        return false ; 
    }
    
    static class Node {
        String str ;
        int dict ; 
        
        Node(String str , int dice){
            this.str = str ;
            this.dict = dice ; 
        }
    }
}