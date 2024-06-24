import java.util.ArrayDeque;
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayDeque<Integer>[] arr = new ArrayDeque[board.length+1];
        for (int i = 0; i < board.length+1; i++) {
            arr[i] = new ArrayDeque<>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != 0) {
                    arr[j+1].add(board[i][j]);
                }
            }
        }

        Stack<Integer> stack = new Stack<>();
        int count = 0 ;
        for (int i = 0; i < moves.length; i++) {
            int move = moves[i];
            Integer poll = arr[move].poll();
            if(poll == null || poll == 0){
                continue;
            }
        

            stack.push(poll);
            boolean bol = false ;
            if (stack.size()>=2) {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                if(pop1 != pop2 ){
                    bol = true ;
                }
                if(bol){
                    stack.push(pop2);
                    stack.push(pop1);
                    continue;
                }
                count+=2;

            }
          
        }

        return count ;
    }
}
