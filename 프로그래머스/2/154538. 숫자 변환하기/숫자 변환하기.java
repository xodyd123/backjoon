import java.util.*; 
class Solution {
    ArrayDeque<Node> que = new ArrayDeque<>() ; 
    int n ; 
    int y ; 
    boolean[] bol ; 
    public int solution(int x, int y, int n) {
        this.n = n ; 
        this.y = y ;
        this.bol = new boolean[y+1] ; 
        
        que.add(new Node(x , 0)); 
        return dfs();
    }
    
    public int dfs(){
        while(!que.isEmpty()){
            Node node = que.poll() ;
            int x = node.x ;
            int count = node.count ; 
            
            if(x == this.y){
                  return count ; 
                }
            
            for(int i = 0 ; i<3 ; i++){
                int new_x = x ; 
               if(i == 0){
                   new_x += this.n;
                   
               }else if(i== 1) {
                   new_x *= 2  ; 
               }
                else{
                   new_x *= 3 ; 
                }
                
                if(new_x>this.y){
                    continue ; 
                }
                
                if(this.bol[new_x]){
                    continue ; 
                }
                
                bol[new_x] = true ; 
                int new_count = count+1 ; 
                que.add(new Node(new_x , new_count)) ;   
            }  
        }
           return -1 ; 
    }
    
    static class Node{
        int x ;
        int count ; 
        
        Node(int x , int count){
            this.x = x ;
            this.count = count ; 
        }
    }
}