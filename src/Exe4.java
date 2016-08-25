/**
 * Programação Orientada a Objetos
 * Lista de exercícios 1
 * 
 * Classe contendo funções para resolução do Exercício 2
 * Ler uma temperatura em graus Celsius e transformá-la em graus Fahrenheit, segundo a fórmula:
 * F = 32 + ((212 - 32)/100)*C
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.Scanner;

public class Exe4 {
	public Scanner reader;
	
	public Exe4(Scanner r){
		reader = r;
	}
	
	public void handle(){
		System.out.println("\nDigite uma temperatura em Celcius:");
		
		String tempString = reader.nextLine();		
		double temp = Support.tryParseDouble(tempString);
		
		System.out.println("A temperatura em Fahrenheit é: " + String.format("%.2f", this.celciusToFahrenheit(temp)) + "°F");	
	}
	
	public double celciusToFahrenheit(double celcius){
		double f;
		f = 32.0 + ((212.0 - 32.0)/100.0)*celcius;
		return f;
	}

}
