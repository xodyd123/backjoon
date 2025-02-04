import java.util.*; 
class Solution {
    List<Integer> arr = new ArrayList<>() ; 
    
    public List<Integer> solution(int[] array, int[][] commands) {
      
        for(int[] arr : commands) {
            int start = Math.min(arr[0] - 1 , arr[1]) ;
            int end = Math.max(arr[0] - 1 , arr[1]) ;
            func(start , end , arr[2]-1 , array) ;
        }
        
    
        return arr ;
    }
    
    public void func(int start , int end , int result , int[] array){
       
        List<Integer> list = new ArrayList() ; 
        for(; start<end ; start++){ 
            list.add(array[start]) ; 
        }
        Collections.sort(list) ; 
      
        
        arr.add(list.get(result) ); 
  
    }
}