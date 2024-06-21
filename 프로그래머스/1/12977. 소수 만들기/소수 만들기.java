import java.util.*;
class Solution {
  public int solution(int[] nums){
        List<Integer> list =new ArrayList<>() ;

        boolean[] bol = new boolean[3000+1];
        int answer = 0;

        for (int i = 0; i < bol.length; i++) {
            bol[i] = true ;
        }
        for(int i = 0 ; i<nums.length-2 ; i++){
            for(int j = i+1 ; j<nums.length-1 ; j++){
                for(int s = j+1 ; s<nums.length; s++){
                    int div = nums[i]+nums[j]+nums[s];
                    list.add(div);
                }

            }
        }
        bol[0] = false;
        bol[1] = false;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int num  = it.next();
            for(int i = 2; i<=Math.sqrt(num) ; i++){
                if(bol[i]){
                    for(int k = i*i ; k<=num ; k+=i){
                        bol[k] = false ;
                    }
                }
            }
            if(bol[num]){
                answer++;
            }
        }

        return answer ;

    }




}