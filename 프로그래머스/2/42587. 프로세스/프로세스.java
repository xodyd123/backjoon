import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] priorities, int location) {
          List<Integer>list =new ArrayList<>();

        PriorityQueue<queue> pq = new PriorityQueue<>(new Comparator<queue>() {
            @Override
            public int compare(queue o1, queue o2) {
              if(o2.num > o1.num){
                  return 1 ;
              }
              return -1 ;
            }
        });

        ArrayDeque<queue> deque = new ArrayDeque<>();

        for (int i = 0; i < priorities.length; i++) {
            pq.add(new queue(i , priorities[i]));
            deque.add(new queue(i , priorities[i]));
        }
        
        while (!pq.isEmpty()) {
            queue peek = pq.peek();
            queue poll2 = deque.poll();

            if(peek.num == poll2.num){
                list.add(poll2.idx);
                pq.poll();
            }
            else{
                deque.add(poll2);
            }

          
        }
        int result = 0 ;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == location){
                result = i+1;
                break;
            }
           
        }
        return result;




    }

    static class queue {
        int idx ;
        int num ;

        public queue(int idx, int num) {
            this.idx = idx;
            this.num = num;
        }
    }


}

