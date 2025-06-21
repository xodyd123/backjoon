import java.io.*;

public class Main {
    static int num;
    static int count;
    static int[] arr;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        num = Integer.parseInt(s[0]);
        count = Integer.parseInt(s[1]);
        arr = new int[count];

        solve(0);
        bw.flush();
        bw.close();
    }

    public static void solve(int start) throws IOException {
        if (start == count) {
            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
            bw.write(sb.toString());
            bw.newLine();
            return;
        }

        for (int i = 1; i <= num; i++) {
            arr[start] = i;
            solve(start + 1);
        }
    }
}


