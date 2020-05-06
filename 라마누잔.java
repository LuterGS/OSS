import java.util.Scanner;

public class 라마누잔{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int counter = scan.nextInt();

		double result = Math.sqrt(8) / 9801.0;
		double calculate = 0.0;
		double a, b, c, d;

		for(int i = 0; i < counter; i++){
		    a = factorial(4*i);

		    b = Math.pow(factorial(i), 4);

		    c = (1103.0 + 26390.0 * i);
		    d = Math.pow(396, 4*i);
		    calculate += ((double)a / (double)b) * ((double)c / (double)d);
		}
        result = result * calculate;
		result = 1.0 / result;

		System.out.println(result);

	}


	public static int factorial(int input){

	    int result = 1;

	    for(int i = 1; i <= input; i++){
	        result *= i;
        }

	    return result;

    }
}
