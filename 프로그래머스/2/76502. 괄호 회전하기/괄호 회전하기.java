import java.io.*;
import java.util.*;
class Solution {
    public int solution(String s) {
        int count = 0 ;
        for(int i = 0 ; i<s .length() ; i++ ){
            while (true) {
                StringBuilder str  = new StringBuilder();
                for (int num = i; num < s .length(); num++) {
                    str.append(s .charAt(num));
                }
                if(str.length()<s .length()){
                   int num =  s .length()-str.length();
                    for (int j = 0; j < num; j++) {
                        str.append(s .charAt(j));
                    }
                }
                if(str.length() == s .length()){
                    boolean bol = stack(str.toString());
                    if(bol){
                        count++ ;
                    }
                    break;
                }


            }

        }
        return count;
    }
    private static boolean stack(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '[' || ch == '(' || ch== '{' ){
                stack.push(ch);
            }

            if (stack.empty() && (ch == ']' || ch == '}' || ch == ')')) {
                return false ;
            }

            if (!stack.isEmpty()) {
                if(stack.peek() == '[' && ch == ']'){
                    stack.pop();
                }
                else if(stack.peek() == '(' && ch == ')'){
                    stack.pop();
                }
                else if(stack.peek() == '{' && ch == '}'){
                    stack.pop();
                }
            }

        }
        if(stack.empty()){
            return true ;
        }
        else {
            return false;
        }
    }


}
