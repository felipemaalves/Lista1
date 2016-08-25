/**
 * Programa��o Orientada a Objetos
 * Lista de exerc�cios 1
 * 
 * Classe principal contendo a l�gica para acessar para acessar cada um dos exerc�cios
 * contidos na primeira lista de exerc�cios.
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.Scanner;

public class Main {
	
	/*
	 * Fun��o principal
	 */
	public static void main(String[] args){
		Menu menu = new Menu();		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("\nPrograma��o Orientada a Objetos \nLista1");
		
		while(true){
			menu.showOptions();
			
			System.out.println("Digite sua op��o: ");  // Lendo input do usu�rio com tratamento de erro
			Integer n = Support.tryParse(reader.nextLine());
			if(n == null || !menu.optionContain(n)){
				System.out.println("O valor digitado n�o foi um n�mero v�lido.");
				continue;
			} else if(n == Menu.MAX_OPTION){ // Op��o para encerrar a aplica��o
				System.out.println("Saindo...");
				break;
			} else { // Tratando a op��o escolhida
				menu.setOption(n); 
				menu.optionHandler(reader);
			}
		}
		reader.close();
	}
	
}
