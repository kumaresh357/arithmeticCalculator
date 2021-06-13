package myFirstJavaProject;
import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner marks = new Scanner(System.in);
		System.out.println("Enter your marks1");
		float a = marks.nextFloat();
		System.out.println("Enter your marks2");
		float b = marks.nextFloat();
		System.out.println("Enter your marks3");
		float c = marks.nextFloat();
		System.out.println("Enter your marks4");
		float d = marks.nextFloat();
		System.out.println("Enter your marks5");
		float e = marks.nextFloat();
		System.out.println("sum of marks1 and marks2");
		float sum = a+b;
		System.out.println(sum);
		System.out.println("diffrence between marks2 and marks3");
		float subtract = b-c;
		System.out.println(subtract);
		System.out.println("product of marks3 and marks4");
		float product = c*d;
		System.out.println(product);
		System.out.println("division of marks4 and marks5");
		float division = d/e;
		System.out.println(division);
		System.out.println("total percentage");
		float percentage = (a+b+c+d+e)*100/500;
		System.out.println(percentage + "%");
	}
	

}
