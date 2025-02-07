import java.io.*;
import java.util.*;


public class Main {


     final static  int[] N = {-1, 1, 0 , 0};
     final static  int[] M = {0, 0, 1, -1};


     static int[][] map ;

     static int[][] dict ;

     static boolean[][] visit ;
     static int result =1 ;

     static int x_range;
     static int y_range;



     static ArrayDeque<Node> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        map = new int[count][count];
        visit = new boolean[count][count];
        dict = new int[count][count];
        for (int x = 0; x < count; x++) {
            String[] strings = br.readLine().split("");
            for (int j = 0; j < strings.length; j++) {
                map[x][j] = Integer.parseInt(strings[j]);
            }
        }

        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                if (!visit[x][y] && map[x][y] == 1) {
                    bfs(x,y);
                    result++;
                }

            }

        }
        System.out.println(result-1);
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i<result ; i++){
            int answer = 1 ;
            for(int[] num : dict){
                for(int j : num){
                    if(i == j){
                       answer++;
                    }
                }
            }
            list.add(answer);
        }
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }

    }

    private static void bfs(int x, int y) {
        deque.add(new Node(x, y));
        visit[x][y] = true ;

        while (!deque.isEmpty()) {
            Node node = deque.poll();
            for (int i = 0; i < 4; i++) {
                 x_range = node.x + N[i];
                 y_range = node.y + M[i];

                if (x_range < 0 || y_range < 0 || x_range>= map.length ||y_range>= map.length) {
                    continue;
                }

                 if(!visit[x_range][y_range] && map[x_range][y_range] == 1) {
                       visit[x_range][y_range] = true ;
                       deque.add(new Node(x_range , y_range));
                       dict[x_range][y_range] = result  ;
                }

            }
        }


    }
   /* private static boolean check(){
        return (x_range>= 0 && x_range<count && y_range>= 0 &&y_range<count);

    }*/
    static class Node {
        int x ;
        int y ;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }


}
