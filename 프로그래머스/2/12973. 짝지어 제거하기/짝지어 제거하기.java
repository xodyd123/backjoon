import java.util.*;
class Solution{
    public int solution(String s){
        char[] c = s.toCharArray();
        Stack<Character>stack = new Stack<>();

        for(char ch : c ){
            if(stack.empty()){
                stack.push(ch);
            } else if (!stack.empty()) {
                if(stack.peek() == ch){
                    stack.pop();
                }
                else {
                    stack.push(ch);
                }
            }
        }
        if(stack.empty()){
            return 1; 
        }
        else {
            return 0;
        }
    }
}