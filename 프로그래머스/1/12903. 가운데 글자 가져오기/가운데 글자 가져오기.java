import java.util.*;
class Solution {
    public String solution(String s) {
        int len = s.length() / 2 ; 
        int cen = s.length()%2 ; 
       
        return cen == 0 ? s.substring(len-1 , len+1) : s.substring(len , len+1) ; 
    }
}