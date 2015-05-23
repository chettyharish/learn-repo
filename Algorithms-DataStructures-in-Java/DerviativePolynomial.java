package DataStructures;

import java.util.Scanner;

public class DerviativePolynomial {

	public static void main(String a[]) {
		int polyArray[];
		int polyArrayResult[];
		System.out.println("Enter the largest order of the polynomial");
		Scanner src = new Scanner(System.in);

		int n = src.nextInt();
		polyArray = new int[n+1];
		polyArrayResult = new int[n ];

		System.out.println("Enter the coefficients in reverse order");

		for (int i = 0; i < polyArray.length; i++) {
			polyArray[i] = src.nextInt();
		}
		
		
		for (int i = 0; i < polyArrayResult.length; i++) {			
			polyArrayResult[i]=(i+1)*polyArray[i+1];		
		}
		
		
		
		System.out.println("The entered polynomial is :");
		for (int i = 0; i < polyArray.length; i++) {
			System.out.print(polyArray[i]+"x^"+i+"+");		
		}
		System.out.println("The derivative of the polynomial is");
		for (int i = 0; i < polyArrayResult.length; i++) {
			System.out.print(polyArrayResult[i]+"x^"+i+"+");		
		}
		System.out.print("0");
		
		src.close();
		
		

	}
}
