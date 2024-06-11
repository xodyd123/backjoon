import java.util.*;
class Solution {
    boolean[] bol ;
    int answer ; 
    
    public int solution(String begin, String target, String[] words) {
        bol = new boolean[words.length];
        dfs(begin , target , words , 0);

        return answer ;
   
    }
    
    private void dfs(String begin , String target , String[] words , int count){
        if(begin.equals(target)){
            answer = count ;
            return ; 
        }
        
        for(int i = 0 ; i<words.length; i++){
            if(bol[i]){
                continue ; 
            }
            int up = 0 ; 
            for(int j = 0 ; j<words[i].length() ;  j++){
                if(begin.charAt(j) == words[i].charAt(j)){
                    up++;
                }
            }
            if(up == words[0].length() -1){
                bol[i] = true ; 
                dfs(words[i] , target , words , count+1);
                bol[i] = false ;
            }
        }
    }
    
    
}