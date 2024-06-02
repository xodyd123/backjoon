import java.io.*;
import java.util.*;

public class Main {
     private static int[] arr ;
     private static boolean[] bol;


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int maxNum = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());
        arr = new int[count];
        bol = new boolean[maxNum];
        backTracking(maxNum , count ,  0);



    }

    public static void backTracking(int maxNum ,int count , int range) {
        if(count==range){
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 0 ; i<maxNum ; i++){
            if(!bol[i]){
                arr[range] = i+1 ;
                bol[i] = true ;
                backTracking(maxNum , count , range+1);
                bol[i] = false;
            }
        }

        }

}
