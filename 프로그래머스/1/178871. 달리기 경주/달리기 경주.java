import java.util.*;

class Solution {
    static Map<String , Integer> map ;
    public String[] solution(String[] players, String[] callings) {
        map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i] , i);
        }
        for (String calling : callings) {
            int num = map.get(calling);
            if(num>0){
                String range = players[num-1];
                players[num-1] = players[num] ;
                players[num] = range ;
                map.replace(players[num] , num);
                map.replace(players[num-1] , num-1);
            }

        }
        return players ;
    }


}
        
