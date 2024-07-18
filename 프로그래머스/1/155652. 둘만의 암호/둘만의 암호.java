import java.util.HashSet;
import java.util.Set;
class Solution {
     public String solution(String s, String skip, int index) {

        Set<Character> set = new HashSet<>();
        for (Character c : skip.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int num = 0 ;
            while(num<index){
                ++ch ;
                if(set.contains(ch)){
                    continue;
                }
                if (ch > 122) {
                    ch = 'a';
                    if(set.contains(ch)){
                        continue;
                    }
                    num++;
                }
                else {
                    num++;
                }

            }
            sb.append(ch);

        }
        return sb.toString();
    }
}
