package no.hvl.dat100;

import java.util.Scanner;

public class oppgaveO2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Skriv inn inntekt: ");
		double inntekt = scanner.nextInt();
		
		
		
		if(inntekt >= 208051 && inntekt <= 292850) {
			double trinn1 = ((inntekt / 100) * 1.7);
			System.out.println("Trinnskatt: " + trinn1 + "Kr");
		}
		if(inntekt >= 292850 && inntekt <= 670000) {
			double trinn2 = ((inntekt / 100) * 4.0);
			System.out.println("Trinnskatt: " + trinn2 + "Kr");
		}
		if(inntekt >= 670001 && inntekt <= 937900) {
			double trinn3 = ((inntekt / 100) * 13.6);
			System.out.println("Trinnskatt: " + trinn3 + "Kr");
		}
		if(inntekt >= 937901 && inntekt <= 1350000) {
			double trinn4 = ((inntekt / 100) * 16.6);
			System.out.println("Trinnskatt: " + trinn4 + "Kr");
		}
		if(inntekt >= 135001) {
			double trinn5 = ((inntekt / 100) * 17.6);
			System.out.println("Trinnskatt: " + trinn5 + "Kr");
		}
		else if(inntekt <= 20850){
			System.out.println("Ingen trinnskatt!");
		}

	}

}
