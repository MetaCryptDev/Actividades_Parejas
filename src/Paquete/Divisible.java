package Paquete;

import java.util.Scanner;

public class Divisible {

	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
	System.out.println("Dime el ultimo numero");
	int numUltimo = sc.nextInt();
	
	for (int i = 1; i < numUltimo; i++) {
		if(i % 2 == 0 || i % 3 == 0) {
			System.out.println(i);
		}
		
	}

	}

}
