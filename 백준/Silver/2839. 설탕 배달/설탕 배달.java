import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] dp ;
    static int result = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        dp = new int[num + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        int count = count(0, num);
        if(count == result){
            System.out.println(-1);
        }
        else {
            System.out.println(count);
        }


    }


    public static int count(int count , int num) {

        if(num < 0){
            return Integer.MAX_VALUE ;
        }

        if(dp[num] != -1) {
            return dp[num];
        }

        count ++ ;
        int min3 = count(count , num-5);
        int min5 = count(count , num-3);
        return dp[num] = Math.min(min3, min5) == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(min3, min5) + 1;
    }
}