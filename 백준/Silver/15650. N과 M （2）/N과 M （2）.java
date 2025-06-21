import java.io.*;
import java.util.Arrays;
public class Main {
    static int num ;
    static int count ;
    static boolean[] bol ;
    static int[] arr ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        num = Integer.parseInt(s[0]);
        count = Integer.parseInt(s[1]);
        arr = new int[count];
        bol = new boolean[num+1];
        solve(0, 0 );

    }


    public static void solve(int start , int range ) {

        if(start == count) {
            for (int i : arr) {
                System.out.print(i +" ");
            }
            System.out.println();
            return;
        }

        for(int i = 1 ; i <= num ; i++) {
            if(!bol[i] && i >range) {
                bol[i] = true;
                arr[start] = i ;
                solve(start+1 , i);
                bol[i] = false;
            }

            }

        }
 }
