import java.io.*;
import java.util.*;

public class Main  {
    private static int[] arr ;
    private static boolean[] bol;

    private static int[] result ;

    static int max ;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        arr = new int[count];
        String[] strings = br.readLine().split(" ");


       for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        bol = new boolean[count];
        result = new int[count];
        backTracking(0);
        System.out.println(max);

    }

    private static void backTracking(int range) {
        if (range == arr.length) {
            circulate(result);
            return ;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!bol[i]) {
                result[range] =  arr[i] ;
                bol[i] = true ;
                backTracking(range+1);
                bol[i] = false ;

            }


        }

    }

    private static void circulate(int[] arr) {
        int num = 0 ;
        for (int i = 0; i < arr.length-1; i++) {
            num += Math.abs(arr[i]- arr[i+1]);
        }

        if (num > max) {
            max = num ;
        }


    }

}