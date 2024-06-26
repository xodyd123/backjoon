class Solution {
   public int solution(int a, int b, int c) {
        int answer = 0 ;
        while (c >= a) {
             int bottle = (c/a)*b;
            int div = c%a ;
            answer += bottle;
            c = bottle+div;

        }
        return answer ;
    }


}
