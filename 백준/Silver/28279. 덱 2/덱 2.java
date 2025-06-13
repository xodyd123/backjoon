import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (; num > 0; num--) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            if (s.length == 2) {
                int b = Integer.parseInt(s[1]);
                if (a == 1) deque.addFirst(b);
                else deque.addLast(b);
            } else if (a == 3) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.pollFirst());
                } else {
                    System.out.println(-1);
                }
            } else if (a == 4) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.pollLast());
                } else {
                    System.out.println(-1);
                }
            } else if (a == 5) {
                System.out.println(deque.size());
            } else if (a == 6) {
                if (!deque.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else if (a == 7) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekFirst());
                } else {
                    System.out.println(-1);
                }
            } else if (a == 8) {
                if (!deque.isEmpty()) {
                    System.out.println(deque.peekLast());
                } else {
                    System.out.println(-1);
                }
            }

        }
    }
}
