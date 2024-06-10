import java.util.*;
class Solution {
    boolean[] bol ; 
    ArrayList<Integer>[] arr ;  
    int answer ; 

    public int solution(int n, int[][] computers) {
        bol = new boolean[n];  
        arr = new ArrayList[n]; 

        
        for(int i = 0 ; i<n ; i++){
            arr[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i<computers.length ; i++){
            for(int j = 0 ; j<computers[i].length ; j++){
                if(computers[i][j] == 1){
                    arr[i].add(j);
                    arr[j].add(i); 
                }
            }
        }
        
        for(int i = 0 ; i<n ; i++){
            if(!bol[i]){
                dfs(i);
                answer++;
            }
        }
        return answer;

    }
    private void dfs(int start){
        bol[start] = true ; 
        for(int num : arr[start]){
            if(!bol[num]){
                dfs(num);
             
            }
        }
    
        
    }
}