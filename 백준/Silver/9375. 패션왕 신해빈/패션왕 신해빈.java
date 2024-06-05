import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            Map<String , Integer> map = new HashMap<>();
            int result = 1;
            for (int j = 0; j < num; j++) {
                st = new StringTokenizer(br.readLine());
                String str  = st.nextToken();
                String str2   = st.nextToken();
                map.put(str2 , map.getOrDefault(str2 , 1)+1);
            }
            List<Integer> list = new ArrayList<>(map.values());
            for (Integer integer : list) {
                result *= integer;
            }
            result -= 1 ;
            System.out.println(result);

        }
    }

}