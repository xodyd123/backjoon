import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        String[] strings = br.readLine().split(" ");
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m) {
                continue;
            } else if (arr[i] == m) {
                count++;
                continue;
            } else {
                int num = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                     num += arr[j];
                    if (num == m) {
                        count++;

                        break;
                    } else if (num > m) {

                        break;
                    }

                }
            }

        }
        System.out.println(count);
    }


}
