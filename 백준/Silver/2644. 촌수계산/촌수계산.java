import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int size = Integer.parseInt(br.readLine());
        int[] dict = new int[size+1];
        ArrayList<Integer>[] list = new ArrayList[size+1];
        for (int i = 0; i <= size; i++) {
            list[i] = new ArrayList<>();
        }
        st = new StringTokenizer(br.readLine());
        int end = Integer.parseInt(st.nextToken()); //7
        int start = Integer.parseInt(st.nextToken()); // 3 ;
        int range = Integer.parseInt(br.readLine());
        for (int i = 0; i < range; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list[n].add(m);
            list[m].add(n);
        }

        ArrayDeque<Integer> deque = new ArrayDeque<>() ;
        deque.add(start);
        while (!deque.isEmpty()) {
            Integer poll = deque.poll();
            for (int i : list[poll]) {
                if (dict[i] == 0) {
                    dict[i] = dict[poll] + 1;
                    deque.add(i);
                }
            }
        }

        if (dict[end] == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(dict[end]);
        }
        

    }

}

