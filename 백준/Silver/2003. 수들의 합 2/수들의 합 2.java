import java.io.*;
import java.util.*;


public class Main  {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }

        int count = 0 , s = 0 , e = 0 ,sum = 0 ;
        while (true) {
            if (sum >= m) {
                sum -= arr[s++];
            } else if (e == n) {
                break;
            }
            else {
                sum += arr[e++];
            }

            if (sum == m) {
                count ++ ;
            }
        }
        System.out.println(count);
    }


}
