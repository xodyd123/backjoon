import java.util.LinkedList;
import java.util.Queue;

class Solution {
    Queue<Integer> q = new LinkedList<Integer>();
    public int solution(int[] numbers, int target) {
        int answer = 0;
        q.offer(0);
        q.offer(0);
        while(q.peek()!=null){
            int level =q.poll();
            int v = q.poll();
            if(level==numbers.length){
                if(v==target)
                    answer++;
            }else {

                q.offer(level + 1);
                q.offer(v + numbers[level]);

                q.offer(level + 1);
                q.offer(v - numbers[level]);
            }
        }
        return answer;
    }   
}