import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {

        StringBuilder sb = new StringBuilder();

        Group[] groups = new Group[4];
        groups[0] = new Group('R' ,'T');
        groups[1] = new Group('C' ,'F');
        groups[2] = new Group('J' ,'M');
        groups[3] = new Group('A' ,'N');

        Map<Character , Integer> map = new HashMap<>();
        map.put('R' , 0);
        map.put('T' , 0);
        map.put('C' , 0);
        map.put('F' , 0);
        map.put('J' , 0);
        map.put('M' , 0);
        map.put('A' , 0);
        map.put('N' , 0);
        for(int i = 0; i< choices.length ; i++){
            if(choices[i] == 1){
                map.put(survey[i].charAt(0) , map.getOrDefault(survey[i].charAt(0) , 0)+3);
            }  else if (choices[i] == 2){
                map.put(survey[i].charAt(0) , map.getOrDefault(survey[i].charAt(0) , 0)+2);
            } else if (choices[i] == 3){
                map.put(survey[i].charAt(0) , map.getOrDefault(survey[i].charAt(0) , 0)+1);
            }else if (choices[i] == 5){
                map.put(survey[i].charAt(1) , map.getOrDefault(survey[i].charAt(1) , 0)+1);
            }else if (choices[i] == 6){
                map.put(survey[i].charAt(1) , map.getOrDefault(survey[i].charAt(1) , 0)+2);
            }else if (choices[i] == 7){
                map.put(survey[i].charAt(1) , map.getOrDefault(survey[i].charAt(1) , 0)+3);
            }
        }
        for(int i= 0 ; i<groups.length ; i++){
            int num1 = map.get(groups[i].com1) ;
            int num2 = map.get(groups[i].com2) ;
            if(num1 > num2){
                sb.append(groups[i].com1);
            } else if(num2 > num1){
                sb.append(groups[i].com2);
            }
            else{
                if(groups[i].com1 - groups[i].com2 >0){
                    sb.append(groups[i].com2);
                }
                else{
                    sb.append(groups[i].com1);
                }
            }

        }
        return sb.toString();

    }

    static class Group{
        char com1 ;
        char com2 ;

        public Group(char com1, char com2) {
            this.com1 = com1;
            this.com2 = com2;
        }
    }

}