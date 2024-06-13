import java.util.*;
class Solution {
    public int[] solution(String s) {
        Set<String> set = new LinkedHashSet<>();
        s = s.substring(0 , s.length() -2).replace("{" , "");
        String[] arr = s.split("},");
        Arrays.sort(arr , new Comparator<String>(){
            @Override
            public int compare(String o1 , String o2){
                if(o1.length() > o2.length()){
                    return 1 ; 
                }
                if(o2.length() > o1.length()){
                    return - 1; 
                }
                return 0 ; 
            }
            
        });
        
        for(int i = 0 ; i<arr.length ; i++){
            String[] strs = arr[i].split(","); 
            for(int j = 0 ; j<strs.length ; j++){
                set.add(strs[j]);
            }
        } 
        
        List<String> list = new ArrayList<>(set);
        int[] answer = new int[list.size()];
        for(int i = 0 ; i<list.size() ; i++){
            answer[i] = Integer.parseInt(list.get(i)); 
        }

        return answer;
    }
}