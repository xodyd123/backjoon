import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.addFirst(i);
        }
        sb.append("<");
        while (!deque.isEmpty()) {
            for (int i = 1; i <= m; i++) {
                Integer num = deque.pollLast();
                if (i == m) {
                    sb.append(num+", ");
                    continue;
                }
                deque.addFirst(num);

            }


        }
        sb.delete(sb.length()-1,sb.length());
        sb.delete(sb.length()-1,sb.length());
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }

}