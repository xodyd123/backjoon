import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[][] result  ;
    static int[][] arr ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        result  = new int[n][n];
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for(int j = 0 ; j<str.length ; j++){
                arr[i][j] = Integer.parseInt(str[j]);
            }

        }

        for (int i = 0; i < n; i++) {
            result[n-1][i] = arr[n-1][i];
        }

        for(int k = n-2 ; k>=0 ; k--){
            for(int i = 0 ;  i <= k  ; i++){
                result[k][i] += arr[k][i] + Math.max(result[k+1][i] , result[k+1][i+1]);
            }
        }

        System.out.println(result[0][0]);

    }
}
