import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int result = 0 ;
        int k = 0 ;
        boolean bol = true ;
        while (k<n) {
            int num = Integer.parseInt(br.readLine());
              if (result < num) {
                for (int i = result+1; i <= num; i++) {
                    stack.push(i);
                    sb.append("+ \n");
                }
                result = num;


              } else if (stack.peek() > num) {
                  bol = false;
              }

            stack.pop();
            sb.append("- \n");
            k++;

        }

        if (bol) {
            System.out.println(sb.toString());
        }
        else{
            System.out.println("NO");
        }

        }


}

