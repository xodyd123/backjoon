import java.util.*; 
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String , Integer> Item = new HashMap<>();
        //int days = 0 ;
        for(int i  = 0 ; i<want.length ; i++){
           // days += number[i]; 
            Item.put(want[i] , Item.getOrDefault(want[i] , 0) +number[i]);
        }
       
        int i = 0 ;
        int range = 10;
        int count = 0 ;
            while(range<=discount.length){
            Map<String, Integer>compareItem  = new HashMap<>();
            Set<String> itemKey = Item.keySet();
            for(int j = i; j<range ; j++){
                if (!itemKey.contains(discount[j])) {
                    break;
                }
                compareItem.put(discount[j] , compareItem.getOrDefault(discount[j] , 0)+1);
            }

            if(Item.equals(compareItem)){
                count++;
            }

            i++;
            range++;

        }
    return count;}
}