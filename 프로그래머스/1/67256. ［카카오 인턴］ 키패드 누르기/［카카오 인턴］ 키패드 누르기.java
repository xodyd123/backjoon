import java.util.*;
class Solution {
       static final int[] arr  = {3,1,-1,-3};

      ArrayDeque<Integer> queue = new ArrayDeque<>() ;
    public String solution(int[] numbers , String hande) {
        StringBuilder sb = new StringBuilder();
        int left = 10 ;
        int right = 12 ;

        for(int num : numbers){
            int[] left_dict = new int[13];
            int[] right_dict = new int[13];
            if(num == 1 || num == 4 || num == 7){
                left = num ;
                sb.append('L');
            } else if (num == 3 || num == 6 || num == 9) {
                right = num ;
                sb.append('R');
            } else{
                int dict = num ;
                if(num == 0){
                    dict = 11 ;
                }
                queue.add(left);
                if(left == dict){
                   left_dict[dict] = 0;
                }
                else{
                    while (!queue.isEmpty()){
                        Integer before = queue.poll();
                        for(int i = 0  ; i<4 ; i++){
                            int after = before + arr[i];
                            if(after<0 || after>12){
                                continue;
                            }
                            if(left_dict[after] == 0){
                                left_dict[after] = left_dict[before] +1 ;
                                queue.add(after) ;
                            }
                        }
                    }
                }
                if(right == dict){
                    right_dict[dict] = 0 ;
                }
                else{
                    queue.add(right);
                    while (!queue.isEmpty()){
                        Integer before = queue.poll();
                        for(int i = 0  ; i<4 ; i++){
                            int after = before + arr[i];
                            if(after<0 || after>12){
                                continue;
                            }
                            if(right_dict[after] == 0){
                                right_dict[after] = right_dict[before] +1 ;
                                queue.add(after) ;
                            }
                        }
                    }
                }

                if(right_dict[dict] == left_dict[dict]){
                    if(hande.equals("right")){
                        sb.append("R");
                        right = dict;
                    }
                    else{
                        sb.append("L");
                        left = dict;
                    }
                } else if (left_dict[dict] > right_dict[dict]) {
                    sb.append("R");
                    right = dict ;
                }
                else{
                    sb.append("L");
                    left = dict ;
                }

            }


        }
        return sb.toString();
    }
}
