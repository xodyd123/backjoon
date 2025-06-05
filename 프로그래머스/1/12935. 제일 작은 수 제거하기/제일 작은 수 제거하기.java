import java.util.* ; 
class Solution {
    public int[] solution(int[] arr) { 
        List<Integer> list = new ArrayList<>() ; 
        int num = arr[0] ;
       
         if(arr.length == 1) {
            return new int[]{-1} ;
        }
          for(int i : arr){
            if(num > i) {
                num = i ; 
            }
        }
      
      
        for(int k = 0 ; k<arr.length; k++){
            if(num != arr[k]){        
               list.add(arr[k]) ; 
            }
            
        }
        int[] result = new int[list.size()]; 
        for(int i = 0 ; i<list.size()  ; i++){
            result[i] = list.get(i) ; 
        }

        return result ; 
      
    }
}