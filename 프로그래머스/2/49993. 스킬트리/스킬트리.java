import java.util.* ; 
class Solution {
    String skill ; 
    public int solution(String skill, String[] skill_trees) {
         this.skill = skill ;
          int answer = 0;
        for(String str :  skill_trees){
            if(check(str)) answer ++ ; 
        }
      
        return answer;
    }
    
    public boolean check(String str){
        ArrayDeque<Character> que = new ArrayDeque<>() ;
        for(char ch : skill.toCharArray()){
            que.add(ch) ; 
        }
        
        for(char ch : str.toCharArray()){
            if(this.skill.contains(String.valueOf(ch))){
                if(que.peek() != ch) return false ;
                
                else {
                    que.poll() ;
                }
            }
            
        }
        return true ; 
    }
}