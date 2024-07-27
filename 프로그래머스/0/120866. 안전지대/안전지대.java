import java.util.*; 
class Solution {
    private static final int[] x_range = {1,-1 , 0 , 0 , 1 ,-1 , 1 , -1};
    private static final int[] y_range = {0,0 , 1 , -1 , 1 ,-1 , -1  ,1};
    List<Node> list = new ArrayList<>();
    public int solution(int[][] board) {
        int size = board.length * board[0].length; 
        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board[i].length ; j++){
                if(board[i][j] == 1){
                    list.add(new Node(i,j));
                    }
                }
            }
        
        for(Node node : list){
            for(int i = 0 ; i<x_range.length ; i++){
                int x = node.x+x_range[i];
                int y = node.y+y_range[i];
                if(x>=board.length || y>=board[0].length || x<0 || y<0){
                    continue ;
                }
                if(board[x][y] == 1){
                    continue;
                }
                
                board[x][y] = 1 ; 
            }
        }
        int answer = 0 ; 
        for(int j =0  ; j<board.length ; j++){
            for(int i = 0 ; i<board[j].length ; i++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }    
        return answer;
    }
static class Node{
    int x ; 
    int y ; 
    
    Node(int x , int y){
        this.x = x;
        this.y = y ;
    }
}

}

