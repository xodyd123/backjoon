import java.io.*;


public class Main {


    static int[] arr ;

    static int count1 ;
   
    


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        arr = new int[count + 1];
        System.out.println(fib(count));
        System.out.println(fibonacci(count));




    }

    private static int fib(int count) {
        if (count == 1 || count==2 ) {
            return 1;
        }
        else{
            return fib(count-2) + fib(count-1);
        }


    }

    private static int fibonacci(int count) {
        arr[1] = 1;
        arr[2] = 1 ;
        for (int i = 3; i <= count; i++) {
            count1++;
            arr[i] = arr[i-1] + arr[i-2];
        }

        return count1;
    }



}

