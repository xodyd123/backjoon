
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    static int result ;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(br.readLine());
            solve(n , 0);
            System.out.println(result);
            result = 0 ;
        }

    }

    public static void solve(int n , int start ) {

        if(start == n) {
            result ++ ;
        }

        if(start > n){
            return ;
        }

        for(int i = 1 ; i<=3 ; i++){
            solve(n , start+i) ;
        }

    }

}
