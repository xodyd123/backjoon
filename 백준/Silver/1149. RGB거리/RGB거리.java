import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    static int[][] arr ;
    static int[][] dp ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = new int[num][3];
        dp = new int[num][3];

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                if(i == 0){
                    dp[i][j] = arr[i][j];
                }
                else{
                   if(j == 0){
                       dp[i][j] += Math.min(dp[i-1][j+1] , dp[i-1][j+2]) + arr[i][j];



                   }
                   else if(j == 1){
                       dp[i][j] += Math.min(dp[i-1][j-1] , dp[i-1][j+1]) + arr[i][j];
                   } else if (j == 2) {
                       dp[i][j] += Math.min(dp[i-1][j-2] , dp[i-1][j-1]) + arr[i][j];
                   }
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<3 ; i++){
            min = Math.min(min, dp[num-1][i]);
        }
        System.out.println(min);

    }
}