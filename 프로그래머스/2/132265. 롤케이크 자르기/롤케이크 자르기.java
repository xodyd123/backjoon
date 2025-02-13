import java.util.* ; 
class Solution {
    public int solution(int[] topping) {
        Map<Integer , Integer> map = new HashMap<>() ;
        Set<Integer> set = new HashSet<>() ; 
        
        for(int i : topping){
            if(!map.containsKey(i)){
                map.put(i , 1) ; 
            }
            
            else {
                map.put(i , map.get(i)+1) ; 
            }
        }
        
        
         int answer = 0 ;
        for(int num : topping){
            set.add(num) ; 
            map.put(num , map.get(num) -1) ;
            
            if(map.get(num) == 0){
                map.remove(num) ; 
            }
            
            if(set.size() == map.size()){
                answer ++ ; 
            }
        }
    
        return answer;
    }
}