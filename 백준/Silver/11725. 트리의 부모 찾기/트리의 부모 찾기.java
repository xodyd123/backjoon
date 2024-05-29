import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] list = new ArrayList[size+1];
        for (int i = 0; i <= size; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < size-1; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list[n].add(m);
            list[m].add(n);
        }

        int[] dict = new int[size + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1) ;

        while (!deque.isEmpty()) {
            Integer poll = deque.poll();
            for (int num : list[poll]) {
                if (dict[num] == 0) {
                    dict[num] = poll ;
                    deque.add(num);
                }
            }
        }

        for (int i = 2; i < dict.length; i++) {
            System.out.println(dict[i]);
        }

    }

}

