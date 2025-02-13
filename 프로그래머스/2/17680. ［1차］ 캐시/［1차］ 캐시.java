import java.util.*; 

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5; 
        
        Db db = new Db(cacheSize);
        for (String str : cities) {
            db.add(str.toLowerCase());
        }

        return db.time;
    }

    static class Db {
        ArrayDeque<String> deque = new ArrayDeque<>();
        int time;
        int size;

        Db(int size) {
            this.size = size;
        }

        private void add(String str) {
            if (check(str)) {

                deque.remove(str);
                deque.add(str);
                time += 1;
            } else {
              
                if (deque.size() >= size) {
                    deque.poll();
                }
                deque.add(str);
                time += 5;
            }
        }

        private boolean check(String str) {
            return deque.contains(str);
        }
    }
}
