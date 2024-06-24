class Solution {
    
    static Route[] route ;

    static char[][] map;

    Node node ;
    public int[] solution(String[]park, String[]routes) {
        map = new char[park.length][park[0].length()];
        route = new Route[routes.length];
        int num= 0 ;
        for (String str : routes) {
            String[] split = str.split(" ");

            route[num++] = new Route(split[0] , Integer.parseInt(split[1]));

        }


        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                map[i][j] =  park[i].charAt(j);
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j] == 'S'){
                    node = new Node(i, j , 0);
                    break ;
                }
            }
        }
        dfs();
        int[] result = {node.x , node.y};
        return result;


    }

    private void dfs() {
        Node before = node ;
        for (int i = 0; i < route.length; i++) {
            if (route[i].direction.equals("E")) {
                for(int j = 0 ; j<route[i].dict ; j++){
                    int x_range = before.x  ;
                    int y_range = before.y +1;


                    if (x_range < 0 || y_range < 0 || x_range >= map.length || y_range >= map[0].length) {
                        before = node ;
                        break;
                    }
                    if (map[x_range][y_range] == 'X') {
                        before = node ;
                        break;
                    }

                     before = new Node(x_range, y_range, before.dict + 1);
                }
                node = before ;
            }
            else if (route[i].direction.equals("W")) {
                for(int j = 0 ; j<route[i].dict ; j++){
                    int x_range = before.x  ;
                    int y_range = before.y -1;


                    if (x_range < 0 || y_range < 0 || x_range >= map.length || y_range >= map[0].length) {
                        before = node ;
                        break;
                    }
                    if (map[x_range][y_range] == 'X') {
                        before = node ;
                        break;
                    }

                    before = new Node(x_range, y_range, before.dict - 1);
                }
                node = before ;

            }else if (route[i].direction.equals("S")) {
                for(int j = 0 ; j<route[i].dict ; j++){
                    int x_range = before.x +1 ;
                    int y_range = before.y  ;


                    if (x_range < 0 || y_range < 0 || x_range >= map.length || y_range >= map[0].length) {
                        before = node ;
                        break;
                    }
                    if (map[x_range][y_range] == 'X') {
                        before = node ;
                        break;
                    }

                    before = new Node(x_range, y_range, before.dict + 1);
                }
                node = before ;


            }else if (route[i].direction.equals("N")) {
                for(int j = 0 ; j<route[i].dict ; j++){
                    int x_range = before.x -1 ;
                    int y_range = before.y  ;


                    if (x_range < 0 || y_range < 0 || x_range >= map.length || y_range >= map[0].length) {
                        before = node ;
                        break;
                    }
                    if (map[x_range][y_range] == 'X') {
                        before = node ;
                        break;
                    }

                    before = new Node(x_range, y_range, before.dict - 1);
                }
                node = before ;


            }
        }
    }

    static class Route{
        String direction ;
        int dict ;

        public Route(String direction, int dict) {
            this.direction = direction;
            this.dict = dict;
        }
    }

    static class Node{
        int x ;
        int y ;
        int dict ;

        public Node(int x, int y, int dict) {
            this.x = x;
            this.y = y;
            this.dict = dict;
        }
    }


}

