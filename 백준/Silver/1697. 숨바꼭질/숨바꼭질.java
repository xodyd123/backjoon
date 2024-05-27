import java.io.*;
import java.util.*;


public class Main {


    final static  int[] N = {-1, 1,2};

    static ArrayDeque<Integer> deque = new ArrayDeque<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int subin = Integer.parseInt(st.nextToken());
        int bro = Integer.parseInt(st.nextToken());

        int[] dict = new int[100000+1];
        // 0
        deque.add(subin);
        while (!deque.isEmpty()) {
            Integer poll = deque.poll();
            if(poll == bro){
                break;
            }
            else {
                for (int i = 0; i < 3; i++) {
                    int after  = poll ;
                    if (i == 2) {
                        after *= N[i];
                    }
                    else {
                        after += N[i];
                    }
                    if (after < 0 || after > 100000 || dict[after] != 0) {
                        continue;
                    }

                    if (dict[after] == 0) {
                        dict[after] = dict[poll] + 1;
                        deque.add(after);
                    }
                }
            }
        }

        System.out.println(dict[bro]);
        

    }


}

