import java.util.*; 
class Solution {
   
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
         Map<String , Integer> map = new HashMap<>();  
         map.put("code" , 0) ;
         map.put("date" , 1) ;
         map.put("maximum",2) ;
         map.put("remain" , 3) ;
         int i = map.get(ext) ; 
         int range = map.get(sort_by) ;
          PriorityQueue<int[]> que = new PriorityQueue<>((a,b)->{
             if(a[range] > b[range]) {
                 return 1 ; 
             }
             else{
                 return -1 ; 
             }
         }); 
        
         for(int[] arr : data){
             if(arr[i] < val_ext) que.add(arr) ;
         }
        int[][] answer = new int[que.size()][data[0].length];
        int count = 0 ;
        while(!que.isEmpty()){
            answer[count++] = que.poll(); 
        }
 
        return answer; 
    }
    
   
}