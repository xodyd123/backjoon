import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = br.readLine();
        Map map = new HashMap();

        map.put("1 2 3 4 5 6 7 8", "ascending");
        map.put("8 7 6 5 4 3 2 1", "descending");

        if(map.containsKey(result)) {
            System.out.println(map.get(result));
        }
        else {
            System.out.println("mixed");
        }
    }
}