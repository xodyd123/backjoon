import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        int answer = 0 ; 
        String[] strs = new String[numbers.length];
        for(int i = 0 ; i<numbers.length ; i++){
            strs[i] = String.valueOf(numbers[i]); 
        }
        Arrays.sort(strs , new Comparator<String>(){
            @Override 
            public int compare(String o1 , String o2){
                 StringBuilder sb1 = new StringBuilder();  
                 sb1.append(o1).append(o2); 
                 StringBuilder sb2 = new StringBuilder();  
                 sb2.append(o2).append(o1);
                 if(Integer.parseInt(sb2.toString()) > Integer.parseInt(sb1.toString())){
                     return 1 ;
                 }
                if(Integer.parseInt(sb2.toString()) < Integer.parseInt(sb1.toString())){
                     return -11 ;
                 }
                 return 0; 
            }
        });
        StringBuilder result =new StringBuilder();
        for(String str : strs){
            result.append(str);
        }
        return result.charAt(0) == '0' ? "0" : result.toString();
    }
}