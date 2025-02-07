
import java.io.*;
import java.util.*;

public class Main {
     static List<Integer>[] arr ;
     static boolean[] bol ;
     static int answer ;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int coumpters = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        arr = new ArrayList[coumpters + 1];
        bol = new boolean[coumpters + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for (; num > 0; num--) {
            st = new StringTokenizer(bf.readLine()); ;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        dfs(1) ;
        if(answer-1<0){
            System.out.println(0);
        }
        else {
            System.out.println(answer-1);
        }
    }

    private static void dfs(int start) {

        for(int index : arr[start]){
            if (!bol[index]) {
                bol[index] = true ;
                answer++;
                dfs(index) ;
            }
        }
    }

}
