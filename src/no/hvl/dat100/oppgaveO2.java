package no.hvl.dat100;

import java.util.Scanner;

public class oppgaveO2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Skriv inn inntekt: ");
		double inntekt = scanner.nextInt();
		
		double totalTrinnskatt = beregnTrinnskatt(inntekt);
		
		 if (totalTrinnskatt > 0) {
			 System.out.printf("Total trinnskatt: %.2f Kr%n", totalTrinnskatt);
	      } else {
	            System.out.println("Ingen trinnskatt!");
	     }

	        scanner.close();
	    }
	public static double beregnTrinnskatt(double inntekt) {
		double trinnskatt = 0;
		
		if (inntekt > 1350000) {
			trinnskatt += (inntekt - 1350000) * 0.176;
			inntekt = 1350000;
		}
		if (inntekt > 937900) {
			trinnskatt += (inntekt - 937900) * 0.166;
			inntekt = 937900;
		}
		if (inntekt > 670000) {
			trinnskatt += (inntekt - 670000) * 0.136;
			inntekt = 670000;
		}
		if (inntekt > 292850) {
			trinnskatt += (inntekt - 292850) * 0.017;
			inntekt = 292850;
		}
		return trinnskatt;
	}

}
