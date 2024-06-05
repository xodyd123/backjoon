import java.util.*;
import java.io.*;
class Solution {
    static Map<String , Integer> map = new HashMap<>();

    public int[] solution(String[] genres, int[] plays) {
        Music[] music = new Music[genres.length];
        for (int i = 0; i < genres.length; i++) {
            music[i] = new Music(i , genres[i] , plays[i]);
             if(map.containsKey(genres[i])){
                map.put(genres[i] , map.get(genres[i])+plays[i]);
            }

            else{
                map.put(genres[i] , plays[i]);
            }
        }

        Arrays.sort(music, new Comparator<Music>() {
            @Override
            public int compare(Music o1, Music o2) {
                if (!o1.name.equals(o2.name)) {
                    if (map.get(o2.name) > map.get(o1.name)) {
                        return 1;
                    }
                    else{
                        return -1 ;
                    }


                } else {
                    if (o2.count > o1.count) {
                        return 1 ;
                    } else if (o1.count > o2.count) {
                        return -1 ;
                    }
                    else {
                        if (o1.idx > o2.idx) {
                            return 1 ;
                        }
                        else{
                            return -1 ;
                        }
                    }

                }
            }
        });
        
        Map<String , Integer> result = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i<music.length ; i++){
            result.put(music[i].name , result.getOrDefault(music[i].name, 0) + 1);     
            if(result.get(music[i].name) > 2){
                continue ; 
            }
          
            list.add(music[i].idx); 
           
        }
        
       int[] answer = new int[list.size()];
       for(int i = 0 ; i<list.size() ; i++){
           answer[i] = list.get(i);
       }
        
       return answer ;


    }


    static class Music {
        int idx  ;

        String name ;

        int count ;

        public Music(int idx, String name, int count) {
            this.idx = idx;
            this.name = name;
            this.count = count;
        }
    }

}

