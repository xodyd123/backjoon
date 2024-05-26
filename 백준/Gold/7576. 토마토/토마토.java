import java.io.*;
import java.util.*;


public class Main {


    final static  int[] N = {-1, 1, 0 , 0};
    final static  int[] M = {0, 0, 1, -1};


    static int[][] map ;

    static int[][] dict ;

    static boolean[][] visit ;

    static int m;
    static int n;


    static ArrayDeque<Node> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int k = 0; k < str.length; k++) {
                map[i][k] = Integer.parseInt(str[k]);
            }
        }
        dict = new int[n][m];
        for (int s = 0; s < m; s++) {
            for (int t = 0; t < n; t++) {
                if (map[t][s] == 1) {
                    deque.add(new Node(s, t));
                }
                if (map[t][s] == 0) {
                    dict[t][s] = -1;
                }

            }
        }
        bfs();

        int max_num  = 0 ;
        for (int[] i : dict) {
            for (int num : i) {
                if (num == -1) {
                    max_num = -1 ;
                    break;
                }

                if (num > max_num) {
                    max_num = num ;
                }
            }
            if (max_num == -1) {
                break;
            }
        }
        sb.append(max_num);
        System.out.println(sb);

    }


    private static void bfs() {
        while (!deque.isEmpty()) {
            Node node = deque.poll();
            for (int i = 0; i < 4; i++) {
                int x_range = node.x + N[i];
                int y_range = node.y + M[i];

                if (x_range < 0 || y_range < 0 || x_range >= m || y_range >= n || map[y_range][x_range] == -1 ) {
                    continue;
                }

                if (map[y_range][x_range] == 0 &&  dict[y_range][x_range] == -1 ) {
                    dict[y_range][x_range] = dict[node.y][node.x]+1;
                    deque.add(new Node(x_range , y_range));

                }


            }
        }
    }


    static class Node {
        int x ;
        int y ;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
