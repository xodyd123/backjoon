import java.util.*;

class Solution {
    int[] x_dict = {-1, 1, 0, 0};
    int[] y_dict = {0, 0, -1, 1};
    int x_range;
    int y_range;
    int[][] dict;

    public int solution(int[][] maps) {
        y_range = maps.length;
        x_range = maps[0].length;
        dict = new int[y_range][x_range];
        dict[0][0] = 1;
        bfs(new Node(0, 0), maps);

        // 목표 지점이 도달 가능하지 않은 경우 -1 반환
        if (dict[y_range - 1][x_range - 1] == 0) {
            return -1;
        }

        return dict[y_range - 1][x_range - 1];
    }

    private void bfs(Node node, int[][] maps) {
        ArrayDeque<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = poll.r + x_dict[i];
                int nc = poll.c + y_dict[i];

                if (nc >= x_range || nr >= y_range || nc < 0 || nr < 0) {
                    continue;
                }
                if (maps[nr][nc] == 0) {
                    continue;
                }

                if (dict[nr][nc] == 0) {
                    dict[nr][nc] = dict[poll.r][poll.c] + 1;
                    queue.add(new Node(nr, nc));
                }
            }
        }
    }

    static class Node {
        int r;
        int c;

        Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}

