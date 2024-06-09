import java.util.*;
class Solution {
    int count ;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers , target , 0 , 0);
        
        int answer = count ;
        
        return answer;
        
    }
    
    private void dfs(int[] numbers , int target , int start , int dept){
        if(numbers.length == start){
            if(target == dept){
                count++;
            }
            return ; 
        }
        
        int plus = dept + numbers[start];
        int minus = dept - numbers[start];
        
        dfs(numbers , target , start+1 , plus);
        dfs(numbers , target , start+1 , minus);
    }
    
    
}