import java.util.ArrayDeque;

class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        // Add all elements to the queue
        for (int num : section) {
            queue.add(num);
        }
        
        while (!queue.isEmpty()) {
            int start = queue.peekFirst();
            int end = start + m - 1;
            boolean processed = false;
            
            // Process elements in the current range
            while (!queue.isEmpty() && queue.peekFirst() <= end) {
                queue.pollFirst();
                processed = true;
            }
            
            if (processed) {
                count++;
            }
        }
        
        return count;
    }
}
