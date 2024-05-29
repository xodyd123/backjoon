import java.io.*;
import java.util.*;


public class Main  {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int people = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        int[] num = new int[people];
        for (int i = 0; i < strings.length; i++) {
            num[i] = Integer.parseInt(strings[i]);
        }
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int range = 1 ;
        Boolean bol = true;
        for (int i : num) {
            stack.push(i);
            while (!stack.empty()){
                Integer peek = stack.peek();
                if(peek == range){
                    stack.pop();
                    range ++ ;
                }
                else {

                    break;
                }
            }

        }

        if(stack.empty()){
            bw.write("Nice");
        }
        else{
            bw.write("Sad");
        }
        bw.flush();
        bw.close();
        br.close();

    }


}
