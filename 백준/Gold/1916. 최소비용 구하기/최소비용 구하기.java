import java.io.*;
import java.util.*;


public class Main {

    static ArrayList<Node>[] list ;

    static int[] dict ;

    static PriorityQueue<Node> queue ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int bus = Integer.parseInt(br.readLine());
        int city = Integer.parseInt(br.readLine());
        list = new ArrayList[bus + 1];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < city; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int  k = Integer.parseInt(st.nextToken());
            int  n = Integer.parseInt(st.nextToken());
            int  m  = Integer.parseInt(st.nextToken());
            list[k].add(new Node(n,m));
        }

        st = new StringTokenizer(br.readLine() , " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        dict = new int[bus+1];
        Arrays.fill(dict , Integer.MAX_VALUE);
        dict[start] = 0 ;

        queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if (o1.dict > o2.dict) {
                    return 1;
                }
                return -1;
            }
        });
        queue.add(new Node(start,0));
        bfs();
        System.out.println(dict[end]);


    }

    private static void bfs(){



        while (!queue.isEmpty()) {
            Node before = queue.poll();

            if(dict[before.num] < before.dict ){
                continue;
            }

            for(Node after : list[before.num]){
                if (dict[after.num] > dict[before.num] + after.dict) {
                    dict[after.num] = dict[before.num] + after.dict;
                    queue.add(after);
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


