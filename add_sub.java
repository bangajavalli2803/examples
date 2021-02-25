import java.math.BigInteger;
import java.util.Scanner;

public class add_sub {
	public static void main(String args[]) {
		String input1, input2;
		BigInteger sum,diff;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Two Numbers : ");
		input1 = scanner.nextLine();
		input2 = scanner.nextLine();
		BigInteger a = new BigInteger(input1);
		BigInteger b = new BigInteger(input2);
		sum = a.add(b);
		diff = a.subtract(b);

		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + diff);
	}
}
