import java.io.*;
import java.util.*;


public class Main{

    static ArrayList<ArrayList<Node>> list ;

    static long[] dict ;

    static int city ;
    static int bus ;

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine() , " ");
         city = Integer.parseInt(st.nextToken());
         bus  = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();
        dict = new long [city+1];
        for (int i = 0; i <= city ; i++) {
            list.add(new ArrayList<>());
            dict[i] = INF ;
        }
        for (int i = 0; i < bus; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list.get(k).add(new Node(n, m));
        }

        dict[1] = 0 ;
        if (bellmanFord()) {
            sb.append("-1\n");
        }
        else{
            for (int i = 2; i <= city; i++) {
                if (dict[i] == INF) {
                    sb.append("-1\n");
                }else{
                    sb.append(dict[i] + "\n");
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean bellmanFord(){
        boolean update = false ;

        for (int i = 1; i < city; i++) {
             update = false ;
            for (int j = 1; j <= city; j++) {
                for (Node node : list.get(j)) {
                    if (dict[j] == INF) {
                        break;
                    }

                    if (dict[node.num] > dict[j] + node.dict) {
                        dict[node.num ] = dict[j] + node.dict ;
                        update = true ;
                    }
                }
            }

            if (!update) {
                break;
            }
        }

        if (update) {
            for (int i = 1; i <= city; i++) {
                for (Node node : list.get(i)) {
                    if (dict[i] == INF) {
                        break;
                    }

                    if (dict[node.num] > dict[i] + node.dict) {
                        return true;
                    }
                }
            }
        }
        return false ;


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
