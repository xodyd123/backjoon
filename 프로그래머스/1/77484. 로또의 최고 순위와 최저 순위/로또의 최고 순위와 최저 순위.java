import java.util.*;
class Solution {
 
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0 ;
        Set<Integer> set = new HashSet<>();
        for (int winNum : win_nums) {
            set.add(winNum);
        }
        int zero = 0;
        for(int lotto : lottos){
            if(set.contains(lotto)){
                set.remove(lotto);
                count++;
            } else if (lotto == 0) {
                zero++;

            }

        }

        int[] result = {count + zero , count};
        Map<Integer , Integer> map = new HashMap<>();
        map.put(6,1);
        map.put(5,2);
        map.put(4,3);
        map.put(3,4);
        map.put(2,5);
        map.put(1, 6);
        map.put(0, 6);
        for(int i = 0 ; i<result.length ;i++){
            result[i] = map.get(result[i]);
        }

        return result;


    }




}

