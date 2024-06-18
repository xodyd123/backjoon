import java.util.*;
class Solution {
    static StringBuilder sb ;
    public String solution(String new_id){
        String lowerCase = new_id.toLowerCase();
        sb = new StringBuilder(lowerCase);

        check2();
        check3();
        check4();
        check5();
        check6();
        check7();


        //System.out.println(sb.toString());
        return sb.toString();

    }
    private void check2() {
        for(int i = 0; i< sb.toString().length() ; ++i){
            char ch = sb.charAt(i);
            if((ch - 'a') >=0 && (ch-'a') <=25){
                continue;
            }
            if(Character.isDigit(ch)){
                continue;
            }
            if(ch == '-'){
                continue;
            }
            if(ch == '_'){
                continue;
            }
            if(ch == '.'){
                continue;
            }
            sb.deleteCharAt(i);
            i = -1 ;
        }
    }

      
     private void check3(){
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<sb.length() ; i++){
            stack.push(sb.charAt(i));
            if(stack.size()>=2){
                boolean bol = true ;
                for(int j = 0 ; j<2 ; j++){
                    if(stack.get(stack.size()-2+j) != '.'){
                        bol = false;
                        break;
                    }
                }

                if(bol){
                    for (int j = 0; j < 2; j++) {
                        stack.pop();
                    }
                    stack.push('.');
                }

            }
        }
        StringBuilder sbs = new StringBuilder();
        for (Character c : stack) {
            sbs.append(c);

        }
        sb = sbs ;
    }
    private void check4(){
        if(sb.length()>0 && sb.charAt(0) == '.'){
            sb.deleteCharAt(0);
        } if (sb.length()>0 && sb.charAt(sb.length()-1) == '.') {
            sb.deleteCharAt(sb.length()-1);
        }


    }
    private void check5(){
        if (sb.length() == 0) {
            sb.append('a');

        }

    }

    private void check6(){
        if(sb.length()>=16){
            sb.delete(15 , sb.length());
            if(sb.charAt(sb.length()-1) == '.'){
                sb.deleteCharAt(sb.length()-1);
            }
        }


    }
    private void check7(){
        while (sb.length()<3){
            sb.append(sb.charAt(sb.length()-1));
        }
        

    }


}
