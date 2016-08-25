/**
 * Programação Orientada a Objetos
 * Lista de exercícios 1
 * 
 * Classe contendo funções para resolução do Exercício 2
 * Ler uma temperatura e a escala (C-Celsius ou F- Fahrenheit ) e convertê-la para a outra escala. 
 * Ou seja, se o usuário informar a temperatura em Celsius esta deverá convertida para Fahrenheit e vice-versa.
 * F = 32 + ((212 - 32)/100)*C
 * C = (F - 32) * (100/(212 - 32))
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.Scanner;

public class Exe5 {
public Scanner reader;
	
	public Exe5(Scanner r){
		reader = r;
	}
	
	public void handle(){
		System.out.println("\nDigite uma temperatura em Celcius ou Fahrenheit (indique com C ou F):");
		
		String temp = reader.nextLine();
		celciusOrFahrenheit(temp);

	}
	
	public double celciusOrFahrenheit(String temp){
		boolean minus = false;
		if(temp.charAt(0) == '-'){
			minus = true;
		}
		if(temp.contains("C") || temp.contains("c")){
			temp = temp.replaceAll("\\D+","");
			double F = Support.tryParseDouble(temp);
			F *= (minus)? -1.0 : 1.0;
			F = celciusToFahrenheit(F);
			System.out.println("A temperatura em Fahrenheit é: " + String.format("%.2f", F) + "°F");
			return F;
		} else if(temp.contains("F") || temp.contains("f")){
			temp.replaceAll("\\D+","");
			double C = Support.tryParseDouble(temp);
			C *= (minus)? -1.0 : 1.0;
			C = fahrenheitToCelcius(C);
			System.out.println("A temperatura em Celcius é: " + String.format("%.2f", C) + "°C");
			return C;
		} else {
			System.out.println("C ou F não indicado.");
			return -300.0;
		}
	}
	
	public double celciusToFahrenheit(double celcius){
		double f;
		f = 32.0 + ((212.0 - 32.0)/100.0)*celcius;
		return f;
	}
	
	public double fahrenheitToCelcius(double fahr){
		double c;
		c = (fahr - 32.0) * (100.0/(212.0 - 32.0));
		return c;
	}
}
