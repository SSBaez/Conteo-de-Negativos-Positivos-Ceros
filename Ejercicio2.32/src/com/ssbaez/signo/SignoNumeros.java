package com.ssbaez.signo;

import java.util.Scanner;

public class SignoNumeros {
	
	public static void main(String[] args){
		
		int numeroA,
			numeroB,
			numeroC,
			numeroD,
			numeroE;
		
		//Contadores
		int cont_pos = 0,
			cont_neg = 0,
			cont_neu = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que recibe cinco números, y que determina e imprime la cantidad de números negativos, "
							+ "positivos, y la cantidad de ceros recibidos\n");
	
		System.out.print("Ingrese primer numero: ");
		numeroA = input.nextInt();
		System.out.print("Ingrese segundo numero: ");
		numeroB = input.nextInt();
		System.out.print("Ingrese tercer numero: ");
		numeroC = input.nextInt();
		System.out.print("Ingrese cuarto numero: ");
		numeroD = input.nextInt();
		System.out.print("Ingrese quinto numero: ");
		numeroE = input.nextInt();
		
		if(numeroA > 0){
			cont_pos += 1;
		}
		else if(numeroA < 0){
			cont_neg += 1;
		}
		else{
			cont_neu += 1;
		}
		
		if(numeroB > 0){
			cont_pos += 1;
		}
		else if(numeroB < 0){
			cont_neg += 1;
		}
		else{
			cont_neu += 1;
		}
		
		if(numeroC > 0){
			cont_pos += 1;
		}
		else if(numeroC < 0){
			cont_neg += 1;
		}
		else{
			cont_neu += 1;
		}
		
		if(numeroD > 0){
			cont_pos += 1;
		}
		else if(numeroD < 0){
			cont_neg += 1;
		}
		else{
			cont_neu += 1;
		}
		
		if(numeroE > 0){
			cont_pos += 1;
		}
		else if(numeroE < 0){
			cont_neg += 1;
		}
		else{
			cont_neu += 1;
		}
		
		System.out.println("\nPOSITIVOS: " + cont_pos + 
				           "\nNEGATIVOS: " + cont_neg + 
				           "\nCEROS: " 	   + cont_neu);
			
		
	}

}
