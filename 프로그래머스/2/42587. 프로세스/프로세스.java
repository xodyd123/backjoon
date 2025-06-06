import java.util.* ;
class Solution {
    public int solution(int[] priorities, int location) {
     
        Obj[] obj = new Obj[priorities.length] ; 
        for(int i = 0 ; i<priorities.length ; i++){
            obj[i] = new Obj(i ,  priorities[i]); 
        }
        PriorityQueue<Obj> que = new PriorityQueue<>((a, b) -> b.num - a.num); 
        ArrayDeque<Obj> deque = new ArrayDeque<>() ; 
        for(Obj o : obj){
            que.add(o) ;
            deque.add(o); 
        }
    
        List<Integer> list = new ArrayList<>() ; 
        while(!que.isEmpty()){
            Obj o1 = que.peek();
            Obj o2 = deque.poll();
            if(o1.num == o2.num){
                list.add(o2.index)  ;
                 que.poll() ;
            }
            else{
                deque.add(o2); 
            }
          

        }      
        int answer = 0 ; 
        for(int i = 0  ;i<list.size() ; i++){
            if(location == list.get(i)){
                answer = i+1 ;
                break;
            }
        }
       
        return answer ;
    }     
    static class Obj {
        
        int index ; 
        int num ; 
        
        Obj(int index , int num){
            this.index = index ; 
            this.num = num ; 
        }
    }
}