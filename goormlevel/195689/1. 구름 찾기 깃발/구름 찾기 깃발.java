import java.io.*;
import java.util.*; 
class Main {
	private static final int[] x_dict = {0,0,1,-1, 1,-1 , -1 , 1} ;
	private static final int[] y_dict = {1,-1,0,0 ,1,-1 , 1 , -1} ;
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int result = Integer.parseInt(st.nextToken()); 
		
		int[][] map = new int[n][n]; 
		
		for(int i = 0 ; i< n ; i++){
			String[] str = br.readLine().split(" "); 
			for(int j = 0 ; j<str.length ; j++){
				map[i][j] = Integer.parseInt(str[j]); 
			}
		}
		List<Integer> list = new ArrayList<>(); 
		for(int i = 0 ; i<map.length ; i++){
			for(int j = 0 ; j<map[i].length ; j++){
					int count = 0 ; 
				if(map[i][j] == 1) {
					continue ; 
				}
				
				for(int k = 0 ; k<8 ; k++){
					int x = i+x_dict[k]; 
					int y = j+y_dict[k]; 
				//	System.out.println("x :" + x + "y :" + y ) ; 
					if(x<0 || y<0 || x>=n || y>=n){
						continue; 
					}
					
					if(map[x][y] == 1){
						count++; 
					}
				}
					list.add(count); 																		
			}                      

		}
		int k = 0 ; 
		for(int num : list){
			if(result == num){
				k++; 
			}
		}
		System.out.println(k); 
	}
}