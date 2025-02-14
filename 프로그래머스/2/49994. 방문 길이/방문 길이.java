import java.util.*;

class Solution {
    public int solution(String dirs) {
        Node node = new Node(); 
        for (char ch : dirs.toCharArray()) {
            switch (ch) {
                case 'U': node.walk(0, 1); break;
                case 'D': node.walk(0, -1); break;
                case 'L': node.walk(-1, 0); break;
                case 'R': node.walk(1, 0); break;
            }
        }
        return node.dict; // 방문한 길의 개수 반환
    }

    static class Node {
        int x = 0;
        int y = 0;
        int dict = 0;
        Set<String> set = new HashSet<>();

        public void walk(int dx, int dy) {
            int next_x = this.x + dx;
            int next_y = this.y + dy;

            // 좌표 범위 확인 (-5 ~ 5 사이)
            if (next_x > 5 || next_x < -5 || next_y > 5 || next_y < -5) {
                return;
            }

            // 길을 고유하게 저장하기 위해 (x, y) → (nx, ny)와 반대 방향도 고려
            String road = Math.min(this.x, next_x) + "" + Math.min(this.y, next_y) +
                          Math.max(this.x, next_x)  + Math.max(this.y, next_y);

            // 처음 방문한 길이면 count 증가
            if (!set.contains(road)) {
                set.add(road);
                this.dict += 1;
            }

            // 좌표 업데이트
            this.x = next_x;
            this.y = next_y;
        }
    }
}
