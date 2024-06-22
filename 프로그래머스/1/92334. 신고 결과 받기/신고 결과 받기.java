import java.util.*;
class Solution {

    public int[] solution(String[] id_list, String[] report, int k) {
      Set<String>[] list = new HashSet[id_list.length];
      Map<String , Integer> users = new HashMap<>();
      for(int i = 0 ; i<list.length ; i++){
          list[i] = new HashSet<>();
          users.put(id_list[i] , 0 );
      }

      for(String str : report){
          String[] strings = str.split(" ");
          for(int i = 0 ; i<id_list.length ; i++){
              if(id_list[i].equals(strings[0])){
                  list[i].add(strings[1]);
              }
          }
      }

      for(int i = 0 ; i<list.length ; i++){
          Iterator<String> it = list[i].iterator();
          while (it.hasNext()){
              String next = it.next();
              users.put(next , users.get(next)+1);
          }
      }

        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            Iterator<String> iterator = list[i].iterator();
            int num = 0 ;
            while (iterator.hasNext()){
                String next = iterator.next();
                if(users.get(next) >=k ){
                    num++;
                }
            }
            result[i] = num ;
        }

        return result ;

    }

    

}