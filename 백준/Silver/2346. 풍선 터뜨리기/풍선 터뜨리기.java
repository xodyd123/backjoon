import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split(" ");

        Deque<Node> deque = new ArrayDeque<>();
        for (int i = 0; i < num; i++) {
            int value = Integer.parseInt(strs[i]);
            deque.add(new Node(value, i + 1));
        }

        List<Integer> result = new ArrayList<>();

        while (!deque.isEmpty()) {
            Node current = deque.pollFirst();
            result.add(current.index);

            if (deque.isEmpty()) break;

            int move = current.value;

            if (move > 0) {
                
                for (int i = 0; i < move - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                // 뒤로 |move|번 이동
                for (int i = 0; i < Math.abs(move); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    static class Node {
        int value;
        int index;
        public Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
