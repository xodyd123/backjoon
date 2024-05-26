import java.io.*;
import java.util.*;


public class Main {

    static ArrayList<Node>[] list ;

    static int[] dict ; // return

    // static boolean[] visit ;





    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int V = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());

        list = new ArrayList[V+1];
        dict = new int[V+1] ;
        //visit = new boolean[V+1] ;

        Arrays.fill(dict , Integer.MAX_VALUE);
        dict[start] = 0 ;
        for(int i = 0 ; i<V+1 ; i++ ){
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine() , " ");
            int u = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(new Node(w , v));
        }
        bfs(start);
        for (int i = 1; i <= dict.length-1; i++) {
            if(dict[i] != Integer.MAX_VALUE){
                System.out.println(dict[i]);

            }
            else{
                System.out.println("INF");
            }
        }


    }

    private static void bfs(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.dict>o2.dict){
                    return 1 ;
                }
                else{
                    return -1;
                }
            }

        });
        queue.add(new Node(start , 0));

        while (!queue.isEmpty()) {
            Node before   = queue.poll(); // dict[before.num] l
             if(dict[before.num] < before.dict){
                 continue;
             }
            for(Node next : list[before.num]){
                if(dict[next.num] > before.dict + next.dict){
                    dict[next.num] = before.dict+ next.dict;
                    queue.add(new Node(next.num,   dict[next.num]));
                }
            }

        }
    }


    static class Node {
        int num ;
        int dict ;

        public Node(int num, int dict) {
            this.num = num;
            this.dict = dict;
        }
    }

}
