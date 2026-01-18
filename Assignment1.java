import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		
		int input = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please input an integer: ");
		input = scanner.nextInt();


		result = fib(input);
		System.out.print("The " + input + "th term of the Fibonacci sequence is " + result + ".");

		scanner.close();
	}
	
	public static int fib(int nth) {
		int n = nth;
		if(n <= 1){
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

}
