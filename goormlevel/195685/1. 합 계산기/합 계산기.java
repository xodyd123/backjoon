import java.io.*; 
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		int count = Integer.parseInt(st.nextToken()); 
		
		int result = 0 ;
		
		for( ; count >0 ; count --){
			st = new StringTokenizer(br.readLine());
			
			int num1 = Integer.parseInt(st.nextToken()); 
			
			String op = st.nextToken() ; 
			
			int num2 = Integer.parseInt(st.nextToken());
			
			switch(op){	
				case "+" :{
					result += (num1 + num2)  ;
					break ; 
				} 
					
				case "-" : {
				 result += (num1 - num2) ;
					break ; 
				}
					
				case "*" : {
				 result += (num1 * num2) ;
					break ; 
				}		
				case "/" : {
				 result += (num1 / num2) ;
					break ; 
				}						
					
					
			}
			
			
		}
		
		System.out.println(result);
	}
}