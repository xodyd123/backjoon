import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String command = br.readLine();
        int count = Integer.parseInt(command);
        String[] str = br.readLine().split(" ");
        Integer[] arr = new Integer[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        String command1 = br.readLine();
        String[] strs = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        for (int i = 0; i < strs.length; i++) {
            if (set.contains(Integer.parseInt(strs[i]))) {
                System.out.print(1 + " ");
            }
            else{
                System.out.print(0 + " ");
            }
        }

    }

}