import java.io.*;
import java.util.*;


public class Main  {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder result = new StringBuilder();
        result.append("<");
        List<Integer> list =  new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            list.add(i);
        }


        int range = k-1;
        while (list.size() > 0) {
            try{
            result.append(list.get(range) + ", ");

            list.remove(range);
            range = (range+k-1)%list.size()  ;}
            catch (ArithmeticException e){
                break;
                
            }

        }
        
        result.deleteCharAt(result.length()-1);
        result.deleteCharAt(result.length()-1);
        result.append(">");
        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
