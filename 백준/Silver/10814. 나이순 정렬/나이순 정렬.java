import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        Range[] ranges = new Range[count];
        for(int i = 0 ; i<count ; i++){
            String[] arr = bufferedReader.readLine().split(" ");
            int age = Integer.parseInt(arr[0]);
            int index = i ;
            String name = arr[1];
            ranges[i] =  new Range(name ,age , index);


        }

        Arrays.sort(ranges);
        for (Range range : ranges) {
            System.out.println(range.age +" " + range.name);
        }

        bufferedReader.close();

        }
    static class Range implements Comparable<Range> {
        String name ;
        int age ;
        int index ;

        public Range(String name, int age, int index) {
            this.name = name;
            this.age = age;
            this.index = index;
        }

        @Override
        public int compareTo(Range o) {
            if (o.age > this.age) { //나이가 더 많아
                return -1;
            } else if (o.age < this.age) {
                return 1;
            } else {
                if (o.index > this.index) {
                    return -1;
                } else if (o.index < this.index) {
                    return 1;
                }
            }

            return 0;
        }


    }
}