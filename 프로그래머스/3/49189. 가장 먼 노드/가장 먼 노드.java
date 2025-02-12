import java.util.*; 
class Solution {
    private List<Integer>[] list ; 
    private boolean[] bol ; 
    private List<Integer> result = new ArrayList<>() ; 
    private ArrayDeque<Node> deque = new ArrayDeque<>(); 
    public int solution(int n, int[][] edge) {
        list = new ArrayList[n+1] ; 
         bol = new boolean[n+1] ; 
        
        for(int i = 0 ; i<= n ; i++){
            list[i] = new ArrayList<>() ; 
        }
        
        for(int[] arr : edge){
           list[arr[0]].add(arr[1]);
           list[arr[1]].add(arr[0]);
            
        }
       
        bol[1] = true ; 
        deque.add(new Node(1,1)) ; 
        bfs(); 
        Collections.sort(result, Collections.reverseOrder()) ;
        int max = result.get(0); 
       
        return (int)result.stream().filter(item -> item == max).count();
    }
    
    private void bfs(){
        
        while(!deque.isEmpty()){
            Node node = deque.poll() ;
            int start = node.start ; 
            int dict = node.dict ; 
       for(int end : list[start]){
           if(!bol[end]){
               bol[end] = true ;
               Node newNode = new Node(end , dict+1) ; 
               result.add(dict+1) ; 
               deque.add(newNode) ; 
           }
       }
      }
        
      
    }
    
    static class Node {
        int start ;
        int dict ; 
        
        Node(int start , int dict){
            this.start = start ; 
            this.dict = dict ; 
        };
    }
}

