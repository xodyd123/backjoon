import java.util.* ; 
class Solution {
    int[] citations  ;  
    int answer ; 
    public int solution(int[] citations) {
        Arrays.sort(citations); 
        this.citations = citations ;
        for(int i = citations[citations.length-1] ; i>=0 ; i--){
           if(check(i)) {
               break ;             
           } 
       }
       return answer; 
        
    }
    
    public boolean check(int value){
        int count = 0 ; 
        for(int i : this.citations){
            if(i>=value) {
                break ; 
            }
            count++ ; 
        }
        if(count-1 <= value && this.citations.length - count >= value) {
            answer = value ; 
            return true ; 
        }
        
        return false ; 
    }
}