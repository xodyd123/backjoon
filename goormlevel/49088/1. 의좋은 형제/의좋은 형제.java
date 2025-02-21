import java.io.*;
import java.util.*; 
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] str = input.split(" "); 
		int a = Integer.parseInt(str[0]) ;
		int b = Integer.parseInt(str[1]) ;
		
		input = br.readLine(); 
		int day = Integer.parseInt(input) ; 
		
		for(int i = 1 ; i<=day ; i++){
			if(i%2 != 0){
				if(a%2 == 0){
					b += a/2 ;
					a -= a/2 ; 
				}
				else{
					b += a/2 + 1 ; 
					a -= a/2 + 1 ; 
				}
			}
			else {
				if(b%2 == 0){
					a += b/2 ;
					b -= b/2 ; 
				}
				else{
					a += b/2 + 1 ; 
					b -= b/2 + 1 ; 
				}
			}
		}
		
		
		System.out.printf("%d %d" , a,b);
	}
}