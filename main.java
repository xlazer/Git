package lab01;

import java.util.Scanner;
import java.lang.Math;

public class main {

	public static void main(String[] args) {
		System.out.println("input operation name:");
		
		Scanner in = new Scanner(System.in);
		String operation=in.nextLine();
		
		System.out.println("input numbers:");
		double x=in.nextInt();
		double y=in.nextInt();
		
//		System.out.println(operation+" "+x+" "+y);
		double result=0;
		switch (operation) {
		case "addition":
			System.out.println("x+y="+(x+y));
			break;
		case "subtraction":
			System.out.println("x-y="+(x-y));
			break;
		case "multiplication":
			System.out.println("x*y="+(x*y));
			break;
		case "division":
			System.out.println("x/y="+(x/y));
			break;
		case "square root":
			System.out.println("sqrt(x)="+(Math.sqrt(x)));
			System.out.println("sqrt(y)="+(Math.sqrt(y)));
			break;
		case "module":
			System.out.println("|x|="+(Math.abs(x)));
			System.out.println("|y|="+(Math.abs(y)));
			break;
		default:
			System.out.println("wrong function name. available functions: addition, substraction, multiplication, division, square root, module");
			break;
		}
	}
}
