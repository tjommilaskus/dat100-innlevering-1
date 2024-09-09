package no.hvl.dat100;

import java.util.Scanner;

public class oppgaveO3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Skriv inn ett tall: ");
		int n = scanner.nextInt();

		int result = factorial(n);
		System.out.println("The factorial of " + n + " is " + result);

	}

	public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
	}
}
