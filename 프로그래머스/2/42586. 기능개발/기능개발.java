import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < progresses.length; i++) {
            double d = (100-progresses[i]) / (double) speeds[i];
            int range =(int)Math.ceil(d);
            queue.add(range);
        }
        // queue 세팅
        int count  =  1 ;
        int days = queue.poll();
        List<Integer> list = new ArrayList<>(); // 7, 3 , 9
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if(days>= poll){
                count++;
            }
            else{
                list.add(count);
                days = poll ;
                count = 1 ;
            }

        }
        if (count >= 1) {
            list.add(count);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}