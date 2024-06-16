import java.util.*;
class Solution {
    public int solution(String dartResult) {  
        String num = "123456789";
        int answer = 0;
        int[] range = new int[3];
        String[] strs = new String[3];
        int count = 0 ;
         for(int i = 0; i< dartResult.length() ; i++){
            if(i>0){
                if((dartResult.charAt(i-1) != '1' && dartResult.charAt(i) =='0')){
                    range[count++] = i ;
                } else if ((num.contains(dartResult.charAt(i)+""))) {
                    range[count++] = i ;
                }

            }
            else if(num.contains(dartResult.charAt(i)+"")||dartResult.charAt(i) == '0'){
                    range[count++] = i;
                }
        }


        strs[0] = dartResult.substring(range[0] , range[1]);
        strs[1] = dartResult.substring(range[1] , range[2]);
        strs[2] = dartResult.substring(range[2] , dartResult.length());

        List<Node> list = new ArrayList<>();
        for(int i = 0 ; i<strs.length ; i++){
            if(strs[i].charAt(strs[i].length()-1) == '*' ||strs[i].charAt(strs[i].length()-1) == '#'){
                int number = Integer.parseInt(strs[i].substring(0 ,strs[i].length()-2));
                if(strs[i].charAt(strs[i].length()-2) == 'S'){
                    list.add(new Node(number ,strs[i].charAt(strs[i].length()-1) ));
                } else if (strs[i].charAt(strs[i].length()-2) == 'D') {
                    list.add(new Node(number*number ,strs[i].charAt(strs[i].length()-1) ));

                }else if (strs[i].charAt(strs[i].length()-2) == 'T') {
                    list.add(new Node(number*number*number ,strs[i].charAt(strs[i].length()-1) ));

                }

            }
            else{
                int number = Integer.parseInt(strs[i].substring(0 ,strs[i].length()-1));
                if(strs[i].charAt(strs[i].length()-1) == 'S'){
                    list.add(new Node(number));
                } else if (strs[i].charAt(strs[i].length()-1) == 'D') {
                    list.add(new Node(number*number));

                }else if (strs[i].charAt(strs[i].length()-1) == 'T') {
                    list.add(new Node(number*number*number));

                }
            }
        }

        for(int i= 0 ; i<list.size() ;i++){
            if(list.get(i).opt == '#'){
                list.get(i).num *= -1 ;
            }
            else if(list.get(i).opt == '*'){
                list.get(i).num *=2 ;
                if(i>0){
                    list.get(i-1).num *= 2;
                }
            }
        }

        for (Node node : list) {
            answer += node.num;
        }
        return answer;
        //System.out.println(answer);
        

    }

    static class Node{
        int num ;
        char opt ;

        public Node(int num) {
            this.num = num;
        }

        public Node(int num, char opt) {
            this.num = num;
            this.opt = opt;
        }
    }

}
