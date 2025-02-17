import java.util.*; 
class Solution {
     Set<String> set = new HashSet<>() ; 
  
    public int solution(String str1, String str2) {
        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ; 
        
        MySet set = new MySet(str1,str2) ;    
        set.add() ; // 단어 분리  
      
        return set.union() ;// 교집합 , 합집합 
       
    }
    
    
   static class MySet {
       private static final List<String>[] list = new ArrayList[2] ; 
       private static final String reg = "[a-zA-Z]+" ; 
       private String[] strs = new String[2]; 
      
       MySet(String str1 , String str2){
           this.strs[0] = str1 ; 
           this.strs[1] = str2 ; 
           this.list[0] = new ArrayList<>() ; 
           this.list[1] = new ArrayList<>() ;  
       }
       
       public void add(){          
           for(int k = 0 ; k<strs.length  ; k++ ){
               for(int i = 0 ; i<strs[k].length()-1 ; i++){
                   String check = strs[k].substring(i , i+2) ;
                   if(check.matches(reg)){
                       list[k].add(check) ;
                   }
               }
           }
          // System.out.println(Arrays.deepToString(list)); 
       }
       public int union(){
           Map<String , Integer> map1 = new HashMap<>() ; 
           Map<String , Integer> map2 = new HashMap<>() ; 
           
           for(String str : list[0]){
               map1.put(str , map1.getOrDefault(str ,0) +1) ; 
           }
           
           for(String str : list[1]){
               map2.put(str , map2.getOrDefault(str ,0) +1) ; 
           }
         //  System.out.println("map1 : " + map1) ; 
         //  System.out.println("map2 : " + map2) ; 
          Set<String> set = new HashSet<>(map1.keySet()); 
          Set<String> set2 = map2.keySet();
          set.addAll(set2); 
 
           Iterator<String> it = set.iterator();
           int max = 0 ;
           int min = 0 ; 
           while(it.hasNext()){
               String str  = it.next(); 
               if(map1.containsKey(str) && map2.containsKey(str)){
                    int num1 = map1.get(str) ; 
                    int num2 = map2.get(str) ; 
                    max += Math.max(num1 , num2) ;  
                    min += Math.min(num1 , num2); 
               }
               else if(map1.containsKey(str)){
                   max +=  map1.get(str) ; 
                
               }
               else{
                  max += map2.get(str) ; 
               }
               
           }
          
            if(min == 0 && max == 0){
               return 65536 ;
            }
             return (int)(min/(double)max*65536);
           
       }
       
   }
}