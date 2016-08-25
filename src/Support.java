/**
 * Programa��o Orientada a Objetos
 * Lista de exerc�cios 1
 * 
 * Classe contendo fun��es auxiliares para clareza do c�digo
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.ArrayList;

public class Support {
	/*
	 * Fun��o auxiliar para lidar com exception em parseInt
	 */
	
	public static Integer tryParse(String text) {
		  try {
			  return Integer.parseInt(text);
		  } catch (NumberFormatException e) {
			  System.out.println("O valor digitado n�o � um n�mero");
			  return null;
		  }
	}
	
	/*
	 * Fun��o auxiliar para lidar com exception em parseDouble
	 */
	
	public static Double tryParseDouble(String text) {
		  try {
			  return Double.parseDouble(text);
		  } catch (NumberFormatException e) {
			  System.out.println("O valor digitado n�o � um n�mero");
			  return null;
		  }
	}
	
	/*
	 * Fun��o auxiliar com o algoritmo de Bubble Sort
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
