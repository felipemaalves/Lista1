/**
 * Programa��o Orientada a Objetos
 * Lista de exerc�cios 1
 * 
 * Classe contendo fun��es para resolu��o do Exerc�cio 2
 * Ler 3 valores num�ricos e imprimir a soma dos 2 maiores e a diferen�a dos 2 menores.
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exe2 {
	private ArrayList<Integer> values;
	public Scanner reader;
	
	public Exe2(Scanner r){
		values = new ArrayList<Integer>();
		reader = r;
	}
	
	public void handle(){
		System.out.println("\nDigite 3 inteiros separados por v�rgula:");
		
		values.clear();
		
		String valuesString = reader.nextLine();		
		String[] strValues = valuesString.trim().split("\\s*,\\s*");
		
		for(int i = 0; i < 3; i++){
			values.add(Support.tryParse(strValues[i]));
		}
		
		Support.bubbleSort(values);
		
		System.out.println("A soma dos dois maiores n�meros �: " + this.getHighestSum());
		System.out.println("A diferen�a entre os 2 menores n�meros �: " + this.getLowestDiff());	
	}
	
	public int getHighestSum(){
		int sum;
		sum = values.get(1) + values.get(2);
		return sum;
	}
	
	public int getLowestDiff(){
		int diff;
		diff = values.get(1) - values.get(0);
		return diff;
	}
}
