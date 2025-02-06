import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int[] x = {0,0 ,1 ,-1} ;
        int[] y = {1,-1 ,0 ,0} ; 
        int max_x = maps[0].length ; 
        int max_y = maps.length ; 
        int[][] dict = new int[max_y][max_x] ;
        dict[0][0] = 1 ; 
        
        Node node = new Node(0,0) ; 
        
        ArrayDeque<Node> que = new ArrayDeque<>() ; 
        que.add(node) ;
        
        while(!que.isEmpty()){
            Node poll = que.poll() ; 
         
            for(int i = 0 ; i<4 ; i++){
                int dict_x = poll.x + x[i] ;
                int dict_y = poll.y + y[i] ; 
               
            
            if(dict_x < 0 || dict_y < 0 || dict_x >= max_x || dict_y >= max_y){
                continue ;
            }
                
            if(maps[dict_y][dict_x] == 0) {
                continue ; 
            }
            
            if(dict[dict_y][dict_x] == 0) {
                  dict[dict_y][dict_x] = dict[poll.y][poll.x] + 1 ; 
                  que.add(new Node(dict_x , dict_y)) ; 
            }
         }
            
          
             
        }
         
     
         if(dict[max_y-1][max_x-1]==0) return -1 ;
          
          return dict[max_y-1][max_x-1] ;  
    }
    
    static class Node {
        
        int x ,y ;
        
        Node(int x, int y){
            this.x = x ;
            this.y = y ;
        }
    }
}