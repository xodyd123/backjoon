import java.util.*;
import java.io.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= bomb.length()) { // 조사 시작
                boolean bol = true ;
                for (int j = 0; j < bomb.length(); j++) {

                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        bol = false ;
                        break ;
                    }
                }
                if (bol) {
                        for (int s = 0; s < bomb.length(); s++) {
                            stack.pop();
                        }
                    }
                }
            }
        for (char ch : stack) {
            sb.append(ch);
        }

        System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
    }


}