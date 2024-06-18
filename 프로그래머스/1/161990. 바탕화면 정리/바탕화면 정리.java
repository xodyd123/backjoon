class Solution {
      public int[] solution(String[] wallpaper){
        int n = wallpaper.length;
        int m = wallpaper[0].length();
        int o = 0 ;
        int k = 0 ;
        char[][] arr = new char[n][m];
        int[] answer = new int[4];

        for(int i = 0 ; i< wallpaper.length ; i++){
            for(int j = 0 ; j<wallpaper[i].length() ; j++){
                arr[i][j] = wallpaper[i].charAt(j);
            }
        }

        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                if(arr[i][j] == '#'){
                    if(n> i){
                        n = i ;
                    }
                    if(m > j){
                        m = j ;
                    }
                    if(i>=o){
                        o = i+1;
                    }
                    if(j>=k){
                        k = j+1;
                    }
                }
            }
        }
        answer[0] = n ;
        answer[1] = m ;
        answer[2] = o ;
        answer[3] = k ;


        return answer ;
    }


}
