class Solution {
       public int solution(int[] numbers, int k) {

        int answer = numbers[0];
        try{
        for(int i = 1; i<k ;i++){
            answer += 2;
            answer %= numbers.length ;

        }
         answer = numbers[answer-1] ;
        }catch (ArrayIndexOutOfBoundsException e){
            answer = numbers[numbers.length-1] ;

        }
        return answer ;

    }
       }