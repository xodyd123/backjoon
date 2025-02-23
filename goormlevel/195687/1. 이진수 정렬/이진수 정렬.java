import java.io.*;
import java.util.*; 
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int n = Integer.parseInt(st.nextToken()); 
		int k = Integer.parseInt(st.nextToken());
		
		String[] str = br.readLine().split(" ");
		
		Obj[] obj = new Obj[n] ; 
		
		for(int i = 0 ; i<n ; i++){
			obj[i] = new Obj(Integer.parseInt(str[i]));
			obj[i].circulate() ; 
		}
		
Arrays.sort(obj, (num1, num2) -> {
    if (num1.one != num2.one) {
        return Integer.compare(num2.one, num1.one); // 1의 개수가 많은 순으로 정렬
    }
    return Integer.compare(num2.num, num1.num); // 숫자가 큰 순으로 정렬
});

		System.out.println(obj[k-1].num);
			
	}
	
	static class Obj{
		
		int one ; 
		
		int num ; 
		
		Obj(int num) {
			this.num = num ; 
		}
		
		public void circulate(){
			int i = this.num  ; 
			
			while(i > 0){
				if(i%2 == 1){
					this.one++ ; 
				}
				
				i = i/2 ;
			}
		}
		
	}
}