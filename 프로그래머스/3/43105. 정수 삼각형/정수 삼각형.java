import java.util.*; 
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        for(int i = 1 ; i<triangle.length ; i++){
           for(int j = 1 ; j<=triangle[i].length ; j++){
              
             if(j == 1){
                 triangle[i][j-1] += triangle[i-1][0] ; 
                 
             }else if(j == triangle[i].length) {
                  triangle[i][j-1] += triangle[i-1][triangle[i-1].length-1] ; 
             }
             else{
                 //System.out.println(triangle[i-1][j-2]);
                 
                 triangle[i][j-1] += Math.max(triangle[i-1][j-2] , triangle[i-1][j-1]); 
             }
           }
        }
        max(triangle[triangle.length-1]); 
        
        return  max(triangle[triangle.length-1]);
    }
    
    public int max(int[] arr) {
        int max = 0 ; 
        for(int i : arr){
            max = Math.max(max , i) ; 
        }
        return max ; 
    }
    
   
}