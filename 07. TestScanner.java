import java.lang.*;     //optional
import java.util.*;

class TestScanner {

	public static void main( String[] args ) {
		Scanner input = new Scanner(System.in);
				int type = input.nextInt();
				if (type == 1)
		  			readProcess1();
				else 
					readProcess2();
		 
	}

	public static void readProcess1() {
		Scanner read1 = new Scanner(System.in);
		double sum = 0.0;
		int NumOfInput = read1.nextInt();
		for (int i = 0; i < NumOfInput; i++) 
			sum += read1.nextInt();
		System.out.println("Average is " + sum/NumOfInput);
	}

	public static void readProcess2() {
		Scanner read2 = new Scanner(System.in);
		double sum = 0.0;
		int count = 0;
		while (read2.hasNext()) {
			sum += read2.nextInt();
			count++;
		}
		System.out.println("Average is " + sum/count);
	}
}

/* keyboard inputs work but file redirections don't
 *
 * line 7: scanner object takes the entire test file as (System.in) argument
 * so scanners read1 and read2 in the methods called will not receive
 * any inputs.
 *
 * however for keyboard input, scanner input reads 1 line at a time so 
 * as long as inputs are not separated by spaces in 1 line or something it will
 * work. */
