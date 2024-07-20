import java.util.*;
class Solution {
  public String solution(String x, String y) {
        Map<Character, Long> mapX = new HashMap<>();
        PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
        for (Character c  : x.toCharArray()) {
            mapX.put(c , mapX.getOrDefault(c , 0L)+1) ;
        }
        for (Character c  : y.toCharArray()) {
           if(mapX.containsKey(c) && mapX.get(c) > 0){
               list.add(Integer.parseInt(String.valueOf(c)));
               mapX.put(c , mapX.get(c)-1);
           }
        }
        StringBuilder sb = new StringBuilder();
        if(list.size() == 0){
            sb.append("-1");
        }
        while (!list.isEmpty()) {
            sb.append(list.poll());
        }
        while (true){
              if(sb.charAt(0) != '0' || sb.length() == 1){
                break; 
            }
            sb.deleteCharAt(0); 
        }
        String answer = sb.toString();
        return answer;
    }
}
