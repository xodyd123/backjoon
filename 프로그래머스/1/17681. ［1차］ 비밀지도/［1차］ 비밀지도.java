import java.util.*; 
class Solution {
    private int n ; 
    public String[] solution(int n, int[] arr1, int[] arr2) {
        this.n = n ; 
        String[] answer = new String[n] ; 
        for(int i = 0 ; i<arr1.length ; i++){
            String str = change(arr1[i] , arr2[i]);
            answer[i] = str.replaceAll("1" , "#").replaceAll("0" , " ") ;
        }
       
        
        return answer;
    }
    
    public String change(int num1 , int num2){
        StringBuilder sb1 = new StringBuilder() ; 
        StringBuilder sb2 = new StringBuilder() ; 
        while(true){
            if(sb1.length() == n && sb2.length() == n){
                break ; 
            }

            sb1.append(num1 % 2) ;
            sb2.append(num2 % 2) ; 
            num1 = num1 / 2 ;
            num2 = num2 / 2 ; 
 
        } 
        String[] str2 = sb2.reverse().toString().split(""); 
        String[] str1 = sb1.reverse().toString().split("");
   
        String[] arr = new String[sb2.length()] ; 
        Arrays.fill(arr , "1") ; 
        for(int i = 0 ; i<arr.length ; i++){
            if(str2[i].equals("0") && str1[i].equals("0")){
                arr[i] = "0" ; 
            }
        }        
        return String.join("" , arr) ;
        
    }
}