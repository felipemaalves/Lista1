/**
 * Programação Orientada a Objetos
 * Lista de exercícios 1
 * 
 * Classe contendo funções para resolução do Exercício 1
 * Ler 3 valores inteiros do usuário e mostrar o maior deles, o menor deles e a média.
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exe1 {
	private ArrayList<Integer> values;
	public Scanner reader;
	
	public Exe1(Scanner r){
		values = new ArrayList<Integer>();
		reader = r;
	}
	
	public void handle(){
		System.out.println("\nDigite 3 inteiros separados por vírgula:");
		
		values.clear();
		
		String valuesString = reader.nextLine();		
		String[] strValues = valuesString.trim().split("\\s*,\\s*");
		
		for(int i = 0; i < 3; i++){
			values.add(Support.tryParse(strValues[i]));
		}
		
		System.out.println("O maior número é: " + this.getHighestValue());
		System.out.println("O menor número é: " + this.getLowestValue());
		System.out.println("A média entre os 3 valores é: " + this.getAvarageValue());		
	}
	
	public int getHighestValue(){
		return Collections.max(values);
	}
	
	public int getLowestValue(){
		return Collections.min(values);
	}
	
	public int getAvarageValue(){
		int avarage;
		avarage = (values.get(0) + values.get(1) + values.get(2))/3;
		return avarage;
	}

}
