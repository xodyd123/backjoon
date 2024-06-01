import java.io.*;
import java.util.*;


public class Main  {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int i = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int e = 1 , s = 1 , m = 1;
        int year = 1;
        while (true) {
            if (e == n && i == s && r == m) {
                break;
            }
            e++ ;
            s++ ;
            m++ ;
            year++ ;
            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1 ;
            }
            if (m == 20) {
                m = 1 ;
            }

        }
        System.out.println(year);
    }


}