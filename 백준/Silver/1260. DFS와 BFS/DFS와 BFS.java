import java.io.*;
import java.util.*;

public class Main {

    private static ArrayList<Integer>[] list ;
    private static List<Integer> result = new ArrayList<>();

    private static StringBuilder sb  = new StringBuilder();



    private static boolean[] booleans;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        list = new ArrayList[num+1];
        for (int i = 0; i < num + 1; i++) {
            list[i] = new ArrayList<>();
        }
        int[][] arr = new int[line][2];
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(bf.readLine());
            int startLine = Integer.parseInt(st.nextToken());
            int enbLine = Integer.parseInt(st.nextToken());
            arr[i][0] = startLine;
            arr[i][1] = enbLine;

        }

        for(int[] ar : arr){
            list[ar[0]].add(ar[1]);
            list[ar[1]].add(ar[0]);
            Collections.sort(list[ar[0]]);
            Collections.sort(list[ar[1]]);
        }


        booleans = new boolean[list.length];
        dfsSearch(start);
        sb.append("\n");
        booleans = new boolean[list.length];
        bfsSearch(start);
        System.out.println(sb.toString());
    }

    private static void dfsSearch(int start){
        result.add(start);;
        sb.append(start).append(" ");
        booleans[start] = true ;
        for(int next : list[start]){
            //System.out.println("next = " + next);
        if(!booleans[next]){
            dfsSearch(next);
        }
        }
    }

    private static void bfsSearch(int start){
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);

        booleans[start] = true ;

        while(!queue.isEmpty()){
            Integer num = queue.poll();
            result.add(num);
            sb.append(num).append(" ");
            for(int next : list[num]){
                if (!booleans[next]) {
                    queue.add(next);
                    booleans[next] =true ;
                }
            }
        }

    }
}
