/**
 * Programação Orientada a Objetos
 * Lista de exercícios 1
 * 
 * Classe contendo funções auxiliares para clareza do código
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.ArrayList;

public class Support {
	/*
	 * Função auxiliar para lidar com exception em parseInt
	 */
	
	public static Integer tryParse(String text) {
		  try {
			  return Integer.parseInt(text);
		  } catch (NumberFormatException e) {
			  System.out.println("O valor digitado não é um número");
			  return null;
		  }
	}
	
	/*
	 * Função auxiliar para lidar com exception em parseDouble
	 */
	
	public static Double tryParseDouble(String text) {
		  try {
			  return Double.parseDouble(text);
		  } catch (NumberFormatException e) {
			  System.out.println("O valor digitado não é um número");
			  return null;
		  }
	}
	
	/*
	 * Função auxiliar com o algoritmo de Bubble Sort
	 */
	
	public static void bubbleSort(ArrayList<Integer> intList){
		Integer aux;
		for(int i=intList.size()-1; i >= 1; i--){  
			for( int j=0; j < i ; j++){
				if(intList.get(j)>intList.get(j+1)){
					aux = intList.get(j);
					intList.set(j, intList.get(j+1));
					intList.set(j+1, aux);
				}
			}
		}
		
	}
}
