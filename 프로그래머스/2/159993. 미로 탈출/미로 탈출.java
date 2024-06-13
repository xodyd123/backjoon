import java.util.*; 
class Solution {
    static  final int[] n = {-1,1,0,0};
    static  final int[] m = {0,0,-1,1};
    char[][] map ; 
    int x_range, y_range ;
    int answer ;
   
    public int solution(String[] maps) {
        x_range = maps.length ;
        y_range = maps[0].length();
        map = new char[x_range][y_range]; 
        for(int i = 0 ; i<maps.length ; i++){
            for(int j = 0 ; j<maps[i].length() ; j++){
                map[i][j] = maps[i].charAt(j); 
                }
        }
        Node start = null;
        Node lever = null ; 
        Node end = null ; 
        for(int i = 0 ; i<map.length ; i++){
            for(int j = 0 ; j<map[i].length ; j++){
                if(map[i][j] == 'S'){
                    start = new Node(i,j); 
                }
                else if(map[i][j] == 'L'){
                    lever = new Node(i,j);
                }
                else if(map[i][j] == 'E'){
                    end = new Node(i,j); 
                }
            }
        }
        int startlever = bfs(start , lever); 
        int leverend = bfs(lever , end); 
        
        if(startlever == -1 || leverend == -1){
            return -1 ;
        }
        else{
            return startlever + leverend;               
        }
        
        
    }
        
        
        private int bfs(Node start , Node end){
            ArrayDeque<Node> deque = new ArrayDeque<>();
            deque.add(start); 
            int[][]dist = new int[x_range][y_range];
            dist[start.x][start.y] = 1 ;
            while(!deque.isEmpty()){
                Node node = deque.poll();
                for(int i = 0 ; i<4 ; i++){
                    int x = node.x + n[i];
                    int y = node.y + m[i];
                    
                    if(x<0 || y<0 || x>=x_range || y>=y_range){
                        continue ;
                    }
                     
                    if(map[x][y] == 'X'){
                        continue ;
                    }
                    
                       
                    if(dist[x][y] == 0){
                        dist[x][y] = dist[node.x][node.y]+1 ;
                        deque.add(new Node(x,y));
                    }
                    if(x == end.x && y == end.y){
                        return dist[x][y] -1 ;
                    }
                   
                }
            }
            return -1 ;
        }
        
        
    static class Node{
      
        int x ;
        int y ; 
        
        Node(int x , int y){
            this.x= x;
            this.y= y;
        }
    } 
}
