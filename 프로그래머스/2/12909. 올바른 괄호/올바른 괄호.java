class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] strList = s.split(""); 
        int count = 0; 
        for(String str : strList){ //)
            if(count<0){answer = false; break;}
            else if(str.equals("(")){count++;} 
            else if(str.equals(")")){count--;} 
        } 
        if(count<0){answer=false;}
        if(count>0){answer =false;}
        //System.out.println("Hello Java"); //  )(

        return answer;
    }
}