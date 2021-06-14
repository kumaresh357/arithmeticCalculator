package myFirstJavaProject;
import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number1");
		float a = num.nextFloat();
		System.out.println("Enter number2");
		float b = num.nextFloat();
		System.out.println("sum of number1 and number2");
		float sum = a+b;
		System.out.println(sum);
		System.out.println("diffrence between number1 and number2");
		float subtract = a-b;
		System.out.println(subtract);
		System.out.println("product of number1 and number2");
		float product = a*b;
		System.out.println(product);
		System.out.println("division of number1 and number2");
		float division = a/b;
		System.out.println(division);
	}
}
