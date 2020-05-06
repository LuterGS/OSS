import java.util.Scanner;

public class 존_월리스{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int counter = scan.nextInt();

		double result = 1;
		double int_to_double = 0.0;


		for(int i = 1; i <= counter; i++){

			result *= (1.0- (1.0 / (4.0 * Math.pow(i,2))));
		}

		result = (1.0/result)*2.0;

		System.out.println(result);

	}
}
