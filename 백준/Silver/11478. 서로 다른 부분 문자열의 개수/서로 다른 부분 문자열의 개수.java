import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s  = br.readLine();
        int result =  0;
        int count = 0 ;
        Set<String> set = new HashSet<>();
        while (result <= s.length()) {
            for (int i = 0; i < s.length(); i++) {
                int range = i+result;
                if(range >= s.length()){
                    break;
                }
                if(set.contains(s.substring(i , range+1))){
                    continue;
                }
                set.add(s.substring(i , range+1));


            }
            result++ ;
        }


        bw.write(set.size()+"\n");
        bw.flush();
        bw.close();
        br.close();

    }
}
