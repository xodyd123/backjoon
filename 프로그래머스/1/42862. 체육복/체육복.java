import java.util.*;
class Solution {
     public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> lostSet = new HashSet<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : reserve) {
            set.add(i);
        }
        for (int i : lost) {
            lostSet.add(i);
            if (set.contains(i)) {
                set.remove(i);
                lostSet.remove(i);
            }
        }
        int count = 0 ;
        int answer = n - lostSet.size();
        PriorityQueue<Integer> resQueue  = new PriorityQueue<>(set);
        while (!resQueue.isEmpty()) {
            Integer poll = resQueue.poll();
            int back = poll - 1;
            int front = poll + 1;
            if(lostSet.contains(back)){
                lostSet.remove(back);
                count ++ ;
            } else if (lostSet.contains(front)) {
                lostSet.remove(front);
                count ++ ;
            }
        }
        answer += count ;
        return answer ;
    }

}