import java.util.Scanner;

public class Pi{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int counter = scan.nextInt();
		
		double result = 1.0;

		for(int i = 1; i <= counter; i++){
			
			if(i % 2 == 1){
				result -= 1.0/(2.0 * i + 1.0);
			}else{
				result += 1.0/(2.0 * i + 1.0);
			}
		}

		System.out.println(result*4.0);
		
	}
}
