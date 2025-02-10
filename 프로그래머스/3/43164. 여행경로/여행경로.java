import java.util.*;
class Solution {
    private Map<String , PriorityQueue<String>> map = new HashMap<>(); 
    private List<String> result = new ArrayList<>(); 
    public String[] solution(String[][] tickets) {
        String[] answer = {};
       
        
        for(int i = 0 ; i<tickets.length ; i++){
            if(map.containsKey(tickets[i][0])){
                map.get(tickets[i][0]).add(tickets[i][1]) ; 
            }
            else {
                map.put(tickets[i][0] , new PriorityQueue<String>());
                map.get(tickets[i][0]).add(tickets[i][1]) ; 
            }
        }
       
        dfs("ICN") ; 
         Collections.reverse(result);  
        
        return result.stream().toArray(String[]::new) ;
    }
    
    private void dfs(String str){
        while(map.containsKey(str) && !map.get(str).isEmpty()){
            dfs(map.get(str).poll()); 
        }
        result.add(str) ; 
    }
}