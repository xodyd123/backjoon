import java.util.*;
class Solution {
      public int[] solution(String today, String[] terms, String[] privacies) {

        String[] split = today.split("\\.");
        Map<String , Integer> termMap = new HashMap<>() ;
        for (String term : terms) {
            String[] strings = term.split(" ");
            termMap.put(strings[0] ,  Integer.parseInt(strings[1]));
        }
        Today[] days = new Today[privacies.length];
        Map<Today , Character> daysMap = new HashMap<>();
        for(int i = 0 ; i< privacies.length ; i++){
            String[] strings = privacies[i].split("\\.");
            String[] str = strings[2].split(" ");
            days[i] = new Today(Integer.parseInt(strings[0]) ,Integer.parseInt(strings[1]) , Integer.parseInt(str[0]));
            daysMap.put(days[i],privacies[i].charAt(privacies[i].length()-1));
        }
        List<Character> list  =  new ArrayList<>(daysMap.values());
       // System.out.println(list);
        for (int i = 0 ; i<days.length ; i++) {
            days[i].circulate(termMap.get(String.valueOf(daysMap.get(days[i]))));
        }
       
        List<Integer> answer = new ArrayList<>();
        Today thisDay = new Today(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        for (int i = 0 ; i<days.length ; i++ ) {
            if (days[i].year > thisDay.year){
                continue;
            }else if(days[i].year == thisDay.year && days[i].month > thisDay.month){
                continue;
            } else if (days[i].year ==  thisDay.year && days[i].month == thisDay.month && days[i].day >= thisDay.day) {
                continue;
            }
            answer.add(i+1);
        }
        int[] result = new int[answer.size()];
        for (int i = 0 ; i<answer.size() ; i++) {
            result[i] = answer.get(i);
        }
        return result;
    }

    static class Today {
        private int year ;
        private int month ;
        private int day ;

        public Today(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public void circulate(int month) {
            this.month += month ;
            this.day -- ;
            if(day == 0){
                day = 28 ;
                this.month --;
            }
             if (this.month > 12) {
                year += this.month / 12 ;
                this.month = this.month % 12 ;

            }

            if(this.month == 0){
                this.month = 12 ;
                this.year -- ;
            }


        }

    }
}

