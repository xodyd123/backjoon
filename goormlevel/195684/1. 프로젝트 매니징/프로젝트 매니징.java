import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		st  = new StringTokenizer(br.readLine());
		int t =  Integer.parseInt(st.nextToken()) , m = Integer.parseInt(st.nextToken()) ; 
		
		Time time = new Time(t , m) ; 
		
		for(int i = 0 ; i<n ; i++){
			st  = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken()) ;
			time.plus(m) ; 
		}
		
		System.out.printf("%d %d" , time.t , time.m); 
		
	}
	
	static class Time{
		int t ; 
		int m ; 
		
		Time(int t , int m){
			this.t = t ;
			this.m = m ; 
		}
		
		public void plus(int m){
			this.m += m ; 
			
			if(this.m>=60){
				t += this.m/60 ; 
				this.m = this.m%60 ;
			}
			
			if(this.t>=12){
				this.t = this.t%24 ; 
			}
			
		
		}
		
		
	}
}