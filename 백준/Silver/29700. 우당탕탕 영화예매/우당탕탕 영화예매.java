
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br.readLine().split(" ");
        int n = Integer.parseInt(strs[0]), m = Integer.parseInt(strs[1]), k = Integer.parseInt(strs[2]);
        String zero = "" ;
        int count = 0 ;
        for (int i = 0; i < k; i++) {
            zero += "0";
        }
        for (int i = 0 ; i < n ; i++) {
            String str = br.readLine() ;
            for (int j = 0; j <= str.length() - k; j++) {
                String range = str.substring(j, j + k);
                if(range.equals(zero)) {
                    count++;
                }

            }
            
        }
        System.out.println(count);
    }

}
