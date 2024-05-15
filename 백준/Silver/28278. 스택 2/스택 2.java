import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();

        List<Integer> print = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String split = bf.readLine();
            int num = 0;
            int num1 = 0;
            if(split.length()>1){
                String[] split1 = split.split(" ");
                num = Integer.parseInt(split1[0]);
                num1 = Integer.parseInt(split1[1]);
            }
            else{
                num = Integer.parseInt(split);
            }
            if(num == 1){
                stack.push(num1);}
            if (num == 2) {
                if (!stack.empty()) {
                    print.add(stack.peek());
                    stack.pop();
                }
                else {
                    print.add(-1);
                }
            }
            if (num == 3) {
                print.add(stack.size());
            }
            if (num == 4) {
                if (stack.empty()) {
                    print.add(1);
                } else {
                    print.add(0);
                }
            }
            if (num == 5) {
                if (!stack.empty()) {
                    print.add(stack.peek());
                } else {
                    print.add(-1);
                }
            }

        }
        for (Integer integer : print) {
            System.out.println(integer);
        }}
}




