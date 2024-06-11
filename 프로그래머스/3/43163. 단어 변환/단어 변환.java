import java.util.*;
class Solution {
    int answer ; 
    public int solution(String begin, String target, String[] words) {
        boolean[] bol = new boolean[words.length];
        ArrayDeque<Node> que = new ArrayDeque<>();
        que.add(new Node(begin , 0));
        while(!que.isEmpty()){
            Node node = que.poll();
            if(node.str.equals(target)){
                answer = node.num; 
                break ; 
            }
            
            for(int i = 0 ; i<words.length ; i++){
                    if(!bol[i] && check(node.str , words[i])){
                        bol[i] = true ; 
                        que.add(new Node(words[i] , node.num+1));
                            
                        }
                    }
                
            }
          return answer; 
            
        }
     
    
    private boolean check(String node , String words){
        int count = 0 ; 
        for(int j = 0 ; j<node.length() ; j++){
            if(node.charAt(j) != words.charAt(j)){
                count ++ ;
            }
        }
        
        return count == 1 ? true : false ; 
    }
    
    static class Node {
        String str ;
        int num ;
        
        Node(String str , int num){
            this.str = str ;
            this.num = num ; 
        }
    }
    
    
}