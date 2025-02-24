import java.io.*; 
import java.util.*; 
class Main {
	
	private static int[][] result ; 
	
	private static final int[] X_D = {0,0,1,-1} ; 
	private static final int[] Y_D = {1,-1,0,0} ;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int n= Integer.parseInt(st.nextToken()) , k = Integer.parseInt(st.nextToken()); 
		
		String[][] map = new String[n][n] ; 
		
		result = new int[n][n] ; 
		
		
		for(int i = 0 ; i<n ; i++){
			String[] str = br.readLine().split(" ") ;
			for(int j = 0 ; j<str.length ; j++){
				map[i][j] = str[j]; 
			}
		}
		
	  for(int j = 0 ; j<k ; j++){
			st = new StringTokenizer(br.readLine()); 
			int x_dict = Integer.parseInt(st.nextToken())-1 , y_dict = Integer.parseInt(st.nextToken())-1; 
			
			if(map[x_dict][y_dict].equals("0")){
				result[x_dict][y_dict] = result[x_dict][y_dict] + 1 ; 
				
			}
			
		   else if(map[x_dict][y_dict].equals("@")){
				result[x_dict][y_dict] = result[x_dict][y_dict] + 2 ; 
				
			}
			
			for(int i = 0 ; i<4 ; i++){
				int after_x = x_dict + X_D[i]; 
				int after_y = y_dict + Y_D[i];
				
				if(after_x<0 || after_y<0 || after_x >=n || after_y >=n || map[after_x][after_y].equals("#")){
					continue ;                           
				}
				
		
			if(map[after_x][after_y].equals("0")){
				result[after_x][after_y] = result[after_x][after_y] + 1 ; 
				
			}
			
		   else if(map[after_x][after_y].equals("@")){
		    result[after_x][after_y] = result[after_x][after_y] + 2; 
			}
				
			
			}
			
		}
		int max = -1 ;
		
		for(int[] arr : result){
			for(int num : arr){
				max = Math.max(max , num); 
			}
		}
		System.out.println(max);
	}
}