package no.hvl.dat100;

import java.util.Scanner;

public class oppgaveO1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		for (int i = 1; i <= 10; i++) {
			System.out.print("Skriv inn en poengscore: ");
			int n = scanner.nextInt();
			if (n <= 0 || n > 100) {
				System.out.println("Feil poengsum skrevet inn, prøv på nytt!");
				i--;
			} else if (n < 40) {
				System.out.println("F");
			} else if (n >= 40 && n < 50) {
				System.out.println("E");
			} else if (n >= 50 && n < 60) {
				System.out.println("D");
			} else if (n >= 60 && n < 80) {
				System.out.println("C");
			} else if (n >= 70 && n < 90) {
				System.out.println("B");
			} else if (n > 90 && n < 100) {
				System.out.println("A");
			}

		}

	}

}
