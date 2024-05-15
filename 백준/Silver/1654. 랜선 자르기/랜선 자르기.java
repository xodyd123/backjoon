import java.io.*;

import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long max = 0 ;
        long[] lens = new long[k];
        for (int i = 0; i < k; i++) {
            long length = Long.parseLong(br.readLine());
            lens[i] = length ;
            if(length>max){
                max = length;
            }
        }

        binarySearch(lens , 1, max , n );


    }

    public static void binarySearch(long[] lens, long start, long end, int n) {
        int result = n ;
        long range = (start + end)/2;
        int count = 0 ;

        for(long len : lens){
            count += len / range;
        }
        if(result<=count){
           // binarySearch(lens , range+1, end, n);
            start = range+1 ;
            range = (start+end)/2 ;
        }

        if(result>count){
            //binarySearch(lens , start , range-1, n);
            end = range-1;
            range = (start+end)/2 ;
        }

        if(start>end){
            System.out.println(range);
            return ;
        }

        binarySearch(lens , start , end , n);



    }
}
