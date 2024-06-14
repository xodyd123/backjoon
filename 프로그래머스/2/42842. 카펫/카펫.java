class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2]; 
        int size = brown + yellow;
        int a = 1 ;
        int b = 1 ; 
        while(true){
            if(size % a == 0){
                b = size/a ; 
                if(a>=b){
                    if((a-2) *(b-2) == yellow){
                        break; 
                    }
                }
                 
                }
            a++; 
        }
            

        answer[0] = a ;
        answer[1] = b ;
        return answer;
    }
}