import java.util.*;
class Solution { 
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>(); 
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i<progresses.length ; i++){
            if((100-progresses[i]) % speeds[i] == 0) {
                 list.add((100-progresses[i]) / speeds[i]) ;
            }
            else {
                list.add((100-progresses[i])/speeds[i] + 1) ;
                
            }
        }
    for(Integer i : list){
        if(q.isEmpty()){q.add(i);}
        else if(!q.isEmpty() && q.peek()>=i){q.add(i);}
        else if(!q.isEmpty() && q.peek()<i){result.add(q.size()); 
                                          q.clear();
                                          q.add(i);}
        
    } 
    if(q.size()>0){result.add(q.size());}


 
    System.out.println(result);
    return result.stream().mapToInt(Integer::intValue).toArray();}
}