import java.util.*;
import java.io.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count  = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        String[] arr = new String[sum+1] ;

        Map<String , Integer> map = new HashMap<>();
        for (int i = 1; i <= sum; i++) {
            String num = br.readLine();
            arr[i]= num ;
            map.put(num , i);

        }

        for (int i = 1; i < arr.length; i++) {
            if (count == 0) {
                break ;
            }
            if (map.get(arr[i])== i){
                System.out.println(arr[i]);
                count--;
            }
        }


    }

}