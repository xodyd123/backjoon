import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        LRUCache cache = new LRUCache(cacheSize);
        for (String city : cities) {
            cache.access(city.toLowerCase());
        }

        return cache.getTime();
    }

    static class LRUCache extends LinkedHashMap<String, Integer> {
        private final int capacity;
        private int time = 0;

        public LRUCache(int capacity) {
            super(capacity, 0.75f, true); // LRU 정책 활성화
            this.capacity = capacity;
        }

        void access(String city) {
            if (super.containsKey(city)) {
                time += 1; // Cache Hit
            } else {
                if (super.size() >= capacity) {
                    Iterator<String> it = super.keySet().iterator();
                    it.next();
                    it.remove(); // LRU 요소 제거
                }
                time += 5; // Cache Miss
            }
            super.put(city, 0); // 최신 요소로 갱신
        }

        int getTime() {
            return time;
        }
    }
}
