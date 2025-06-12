import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] board;

    // 방향: 오른쪽, 아래
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minRepaint = Integer.MAX_VALUE;

        // 모든 가능한 8x8 부분 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int repaintW = bfs(i, j, 'W');
                int repaintB = bfs(i, j, 'B');
                minRepaint = Math.min(minRepaint, Math.min(repaintW, repaintB));
            }
        }

        System.out.println(minRepaint);
    }

    // BFS로 8x8 체스판 검사
    static int bfs(int startX, int startY, char startColor) {
        boolean[][] visited = new boolean[8][8];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        int repaint = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            // 현재 보드 위치
            char expected = getExpectedColor(x, y, startColor);
            char actual = board[startX + x][startY + y];

            if (actual != expected) {
                repaint++;
            }

            for (int d = 0; d < 2; d++) { // 오른쪽, 아래로만 이동
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 8 && ny < 8 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny});
                }
            }
        }

        return repaint;
    }

    // (i + j) % 2 를 이용해 체스판에서 예상 색 구하기
    static char getExpectedColor(int i, int j, char startColor) {
        if ((i + j) % 2 == 0) {
            return startColor;
        } else {
            return startColor == 'W' ? 'B' : 'W';
        }
    }
}
