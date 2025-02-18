class Solution {
    private static final int[] x = {0 , 0 , 1 , -1} ; 
    private static final int[] y = {1 , -1 , 0 , 0} ; 
    
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w] ; 
        int answer = 0;
        for(int i = 0 ; i<4 ; i++){
            int new_h = h + x[i] ;
            int new_w = w + y[i] ; 
            if(new_h >= board[h].length || new_h<0 || new_w >= board.length || new_w < 0) {
                continue ;
            } 
            if(board[new_h][new_w].equals(color)){
                answer ++ ; 
            }
        }
       
        return answer;
    }
}