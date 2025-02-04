import java.util.*; 
class Solution {
    public String solution(String phone_number) {
        String answer = "*";
        int length = phone_number.length()-4; 
        answer = answer.repeat(length) ; 
        String sub = phone_number.substring(length) ;
     
        
        return answer+sub;
    }
}