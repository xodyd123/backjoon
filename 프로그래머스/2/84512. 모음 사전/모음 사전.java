import java.util.*;
class Solution {
     private static final char[] ALPHABET = {'A' , 'E', 'I', 'O', 'U'};

     private static List<String> list = new ArrayList<>();
     
     public int solution(String word) {
        main(word);
        int i = list.indexOf(word)+1;
        return i ;
    }
    
   public static void main(String str){
        Stack<Character> stack = new Stack<>();
        circulate(stack);

    }

    private static void circulate(Stack<Character> stack) {

        if(stack.size() == 5){
            stack.pop();
            return ;
        }
        for (int i = 0; i < ALPHABET.length; i++) {
            stack.push(ALPHABET[i]) ;
            StringBuilder sb = new StringBuilder();
            for (int k = 0 ; k<stack.size() ; k++) {
                sb.append(stack.get(k));
            }
            list.add(sb.toString());

            circulate(stack);
        }
        if(!stack.isEmpty()){
            stack.pop();
        }

    }
}
