import java.io.*;
import java.util.*; 
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		
		String[] arr = input.split("\\s+");
		
		if(input.equals("")){
			System.out.println(0);
		}
		
		else {
			System.out.println(arr.length);
		}

		
		

	}
}