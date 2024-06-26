import java.util.HashMap;
import java.util.Map;
class Solution {
      public int[] solution(String[] keymap, String[] targets) {
        int[] result = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for (String str : keymap) {
            for (int i = 0; i < str.length(); i++) {
                if (map.containsKey(str.charAt(i))) {
                    if (map.get(str.charAt(i)) > i + 1) {
                        map.put(str.charAt(i), i + 1);
                    }
                } else {
                    map.put(str.charAt(i), i + 1);
                }
            }
        }
        for (int i = 0; i < targets.length; i++) {
            for(int j = 0 ; j<targets[i].length() ; j++){
                if(!map.containsKey(targets[i].charAt(j))){
                    result[i] = -1;
                    break;
                }
                result[i] += map.get(targets[i].charAt(j));
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 0) {
                result[i] = -1 ;
            }
        }
        return result;
    }

}
