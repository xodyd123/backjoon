import java.util.*;
import java.io.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean bol = true;
        for (int i = 0; i < phone_book.length - 1; i++) {
             if(phone_book[i+1].startsWith(phone_book[i])){
                bol = false ;
                break;
            }

        }

        if(bol){
           return true ;
        }
        else{
           return false ;
        }


    }
    
}
