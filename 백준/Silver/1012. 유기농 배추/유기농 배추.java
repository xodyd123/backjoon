import java.io.*;
import java.util.*;


public class Main {


     final static  int[] N = {-1, 1, 0 , 0};
     final static  int[] M = {0, 0, 1, -1};


     static int[][] range ;

     static int[][] dict ;

     static boolean[][] visit ;



     static int x_range;
     static int y_range;

     static int x ;
     static int y ;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();
        int case1 = Integer.parseInt(br.readLine());

        for (int j = 0; j < case1; j++) {
            st = new StringTokenizer(br.readLine() , " ");
            x= Integer.parseInt(st.nextToken());
            y= Integer.parseInt(st.nextToken());
            int sum = Integer.parseInt(st.nextToken());
            range = new int[y][x];
            for (int i = 0; i < sum; i++) {
                st = new StringTokenizer(br.readLine() , " ");
                int x_r = Integer.parseInt(st.nextToken());
                int y_r = Integer.parseInt(st.nextToken());
                range[y_r][x_r] = 1;
            }

            dict = new int[y][x];
            visit = new boolean[y][x];

            int result = 0 ;
            for(int s = 0 ; s<y; s++){
                for (int t = 0; t < x  ; t++) {
                    if (range[s][t] == 1 && !visit[s][t] ) {
                        //System.out.println("s : " + s);
                        //System.out.println("t : " + t);
                        result++;
                        dfs(t , s);

                    }

                }
            }
            sb.append(result).append("\n");

        }
        System.out.println(sb);



    }

    private static void dfs(int x, int y) {
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(x, y));
        visit[y][x] = true ;

        while (!deque.isEmpty()) {
            Node node = deque.poll();
            for (int i = 0; i < N.length; i++) {
                  x_range = node.x + N[i];
                  y_range = node.y + M[i];


                if(range_check() &&!visit[y_range][x_range] && range[y_range][x_range]==1){
                    visit[y_range][x_range] = true ;
                    deque.add(new Node(x_range, y_range));

                }


                }


            }

        }

    private static boolean range_check() {
        return(x_range>= 0 && y_range>=0 && x_range< x && y_range<y);
    }

    static class Node{
        int x ;
        int y ;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    

}