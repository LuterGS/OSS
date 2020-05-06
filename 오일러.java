import java.util.Scanner;

public class 오일러{

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int counter = scan.nextInt();

		double result = 0.0;

		for(int i = 1; i <= counter; i++){
			result += 1/((double)i * (double)i);
		}
        result *= 6;
        result = Math.sqrt(result);

        System.out.println(result);
	}
}
