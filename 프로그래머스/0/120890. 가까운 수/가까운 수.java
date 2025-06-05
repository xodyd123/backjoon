import java.util.*; 
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array) ; 
        int result = 1000000000;  
        int answer = 0 ; 
        for(int num : array){
            int range = Math.abs(num-n) ;
            if(result > range) {
                result = range ; 
                answer = num ; 
                        
            }
        }
        return answer ;       
    }
}