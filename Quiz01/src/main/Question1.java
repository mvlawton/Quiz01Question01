package main;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		
		System.out.println("Number of passing attempts?");
		Scanner sc = new Scanner(System.in);
		int ATT = sc.nextInt();
		System.out.println("Number of completions?");
		int COMP = sc.nextInt();
		System.out.println("Number of passing yards?");
		int YDS = sc.nextInt();
		System.out.println("Number of touchdown passes?");
		int TD = sc.nextInt();
		System.out.println("Number of interceptions?");
		int INT = sc.nextInt();
		sc.close();
		
		double a = ((COMP/ATT) - .3) * 5;
		double b = ((YDS/ATT) - 3) * .25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - ((INT/ATT) * 25);
		
		double pr = ((a+b+c+d)/6) * 100;
		System.out.println("The quarterback's Passer Rating is:");
		System.out.println(pr);
	}

}
