import java.util.* ; 
class Solution {
    public int[] solution(String s) {
        Map<String , Integer> map = new HashMap<>() ;
        String[] str = s.split("") ; 
        
        System.out.println(Arrays.toString(str));
        int[] answer = new int[s.length()] ;
        for(int i = 0 ; i<answer.length ; i++){
            answer[i] = -1 ; 
        }
        
        for(int i= 0 ; i<str.length ; i++){
           if(map.containsKey(str[i])){
               int before = map.get(str[i]) ;
               int after =  i;
               answer[i] = after - before ; 
           }
            
            map.put(str[i] , i);  
        }
        return answer;
    }
}