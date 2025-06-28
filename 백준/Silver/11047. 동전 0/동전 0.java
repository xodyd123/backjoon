import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            int num  = Integer.parseInt(bf.readLine());
            arr[count-1-i] = num;
        }
        int idx = 0;
        int result = 0 ;
        while(true){
            if(price ==0){
                break;
            }
            if(idx<arr.length){
                if(price<arr[idx]){
                    idx++;
                }
                else{
                    price -= arr[idx];
                    result+=1;
                }
            }

        }
        System.out.println(result);
    }

}
