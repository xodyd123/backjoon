import java.io.*;

import java.util.*;


public class Main {

    private static ArrayList<Integer>[] arr ;

    private static boolean[] booleans ;

    static int start ;
    static int count = 1 ;
    static int[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        arr[start].add(start);
        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            arr[n1].add(n2);
            arr[n2].add(n1);

        }

        for (int i = 1 ; i<arr.length ; i++) {
           Collections.sort(arr[i]);
        }

        booleans = new boolean[N+1];
        list = new int[N+1];
        list[start] = 1;
        booleans[start] = true ;
        dfs(start);


        for (int i = 1 ; i< list.length ; i++) {
            bw.write(list[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();


    }

    public static void dfs(int num){
        for (int result : arr[num]) {

            while(!booleans[result]){
                list[result] = ++count;

                booleans[result] = true ;
               dfs(result);
            }
        }

    }


}



