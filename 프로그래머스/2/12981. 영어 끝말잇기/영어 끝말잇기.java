import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        set.add(words[0]); 
        char end = words[0].charAt(words[0].length() - 1);
        for (int i = 1; i < words.length; i++) {
            if(end != words[i].charAt(0) || set.contains(words[i])){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1  ;
                break;
            }
            set.add(words[i]);
            end = words[i].charAt(words[i].length() - 1);
        }

        return answer;
    }
}