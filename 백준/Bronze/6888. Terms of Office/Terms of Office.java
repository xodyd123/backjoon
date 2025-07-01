import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        for(int i = 0 ; i<= num2 - num1  ; i+=60){
            System.out.println("All positions change in year " + (num1 + i)) ;
        }

    }
}