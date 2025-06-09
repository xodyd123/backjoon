
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] numbers = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            numbers[i] = Integer.parseInt(s[i]);
        }
        int result = (numbers[2] - numbers[0]) / (numbers[0] - numbers[1] ) +1 ;
        if ((numbers[2] - numbers[0]) % (numbers[0] - numbers[1]) != 0) {
            result = result + 1;
        }
        System.out.println(result);
    }
}
