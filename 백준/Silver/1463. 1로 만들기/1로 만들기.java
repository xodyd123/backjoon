import java.io.*;



public class Main {

    static Integer[] arr  = new Integer[1000000+1];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        arr[1] = 0 ;
        arr[2] = 1 ;
        arr[3] = 1 ;
        fib(count);


        bw.write(arr[count]+"\n");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int fib(int count) {

        for (int i = 4; i <= count; i++) {
            int min = arr[i-1] + 1 ;

            if (i % 3 == 0) {
                 if(min > arr[i/3] +1){
                     min = arr[i/3]+1;
                 }

            }
            if (i % 2== 0) {
                if(min > arr[i/2] +1){
                    min = arr[i/2]+1;
                }
            }

            arr[i] = min ;
        }

        return arr[count];
    }


}
