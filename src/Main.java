/**
 * Programação Orientada a Objetos
 * Lista de exercícios 1
 * 
 * Classe principal contendo a lógica para acessar para acessar cada um dos exercícios
 * contidos na primeira lista de exercícios.
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.Scanner;

public class Main {
	
	/*
	 * Função principal
	 */
	public static void main(String[] args){
		Menu menu = new Menu();		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("\nProgramação Orientada a Objetos \nLista1");
		
		while(true){
			menu.showOptions();
			
			System.out.println("Digite sua opção: ");  // Lendo input do usuário com tratamento de erro
			Integer n = Support.tryParse(reader.nextLine());
			if(n == null || !menu.optionContain(n)){
				System.out.println("O valor digitado não foi um número válido.");
				continue;
			} else if(n == Menu.MAX_OPTION){ // Opção para encerrar a aplicação
				System.out.println("Saindo...");
				break;
			} else { // Tratando a opção escolhida
				menu.setOption(n); 
				menu.optionHandler(reader);
			}
		}
		reader.close();
	}
	
}
