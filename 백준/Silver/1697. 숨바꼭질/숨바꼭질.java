import java.io.*;
import java.util.*;


public class Main  {

    static final int[] N = {-1, 1, 2};





    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int subin = Integer.parseInt(st.nextToken());
        int bro = Integer.parseInt(st.nextToken());

        int[] dict = new int[100000 + 1];
        for (int i = 0; i < dict.length; i++) {
            dict[i] = -1 ;
        }
        boolean[] booleans = new boolean[100000 + 1];
        dict[subin] = 0 ; //0초
        booleans[subin] = true ;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(subin);
        int result =  0;
        while (!deque.isEmpty() ) {
            Integer next = deque.poll();
            for (int i = 0; i < 3; i++) {
                int range;
                if (i == 2) {
                    range = next *N[2];
                }
                else {
                    range = next +N[i];
                }
                if(range<0|| range >100000){
                    continue;
                }

                if (dict[range] == -1) {
                    dict[range] = dict[next] + 1;
                    deque.add(range);
                }

                if(range == bro){
                    result = dict[range];
                    //  System.out.println(range);
                }
            }

        }
        System.out.println(result);


    }

}
