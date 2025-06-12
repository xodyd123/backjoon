import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static String[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);

        arr = new String[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().split("");
        }

        int min = Integer.MAX_VALUE;

        // 가능한 모든 8x8 영역에 대해 검사
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                min = Math.min(min, bfs(i, j, "W")); // W로 시작
                min = Math.min(min, bfs(i, j, "B")); // B로 시작
            }
        }

        System.out.println(min);
    }

    // BFS로 8x8 영역 내 올바른 색 비교
    static int bfs(int startX, int startY, String startColor) {
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(0, 0, startColor));

        int repaint = 0;

        while (!deque.isEmpty()) {
            Node cur = deque.poll();
            int x = cur.x;
            int y = cur.y;

            if (x >= 8 || y >= 8) continue;

            int boardX = startX + x;
            int boardY = startY + y;

            String expectedColor = ((x + y) % 2 == 0) ? startColor : (startColor.equals("W") ? "B" : "W");

            if (!arr[boardX][boardY].equals(expectedColor)) {
                repaint++;
            }

            // 오른쪽, 아래로만 확장 (중복 없이 8x8)
            if (x + 1 < 8) deque.add(new Node(x + 1, y, ""));
            if (y + 1 < 8 && x == 0) deque.add(new Node(x, y + 1, ""));
        }

        return repaint;
    }

    static class Node {
        int x, y;
        String expected;

        public Node(int x, int y, String expected) {
            this.x = x;
            this.y = y;
            this.expected = expected;
        }
    }
}
