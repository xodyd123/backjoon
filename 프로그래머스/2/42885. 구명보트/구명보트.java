import java.util.*;
class Solution {
     public int solution(int[] people, int limit) {
        Arrays.sort(people);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int person : people) {
            deque.add(person);
        }
        int count = 0 ;
        while (deque.size()>1) {
            Integer last  = deque.pollLast();
            Integer first  = deque.pollFirst();
            if(first+last > limit){
                count++ ;
                deque.addFirst(first);
            } else if (first+last <= limit) {
                count++;
            }
        }
        if(deque.size() == 1 ){
            count++ ; 
        }
        return count;
    }
}