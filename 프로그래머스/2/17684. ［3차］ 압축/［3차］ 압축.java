import java.util.*;
class Solution {
    ArrayDeque<String> que = new ArrayDeque<>() ;
    public int[] solution(String msg) {
        char ch = 'A' ; 
        Map<String , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i<26 ; i++){
            char j = (char)(ch+i);
            map.put(String.valueOf(j) , i+1) ;
        }
        int count = 27 ; 
        for(char c : msg.toCharArray()){
            que.add(String.valueOf(c)) ; 
        }
        List<Integer> list = new ArrayList<>() ; 
        StringBuilder sb = new StringBuilder() ;
        while(!que.isEmpty()){

            if(map.containsKey(sb + que.peek())){
                sb.append(que.poll());
                continue ;
            }


            list.add(map.get(sb.toString())) ;
            map.put(sb+que.peek() , count++) ;
            sb = new StringBuilder() ;


        }

        list.add(map.get(sb.toString())) ;
        //System.out.println(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
