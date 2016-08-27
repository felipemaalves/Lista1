/**
 * Programação Orientada a Objetos
 * Lista de exercícios 1
 * 
 * Classe auxiliar contendo ferramentas para navegar no menu
 * 
 * @author Felipe Martins Athayde Alves
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private int option;
	private ArrayList<Integer> optionsArray;
	
	public static int MAX_OPTION = 11;
	
	/*
	 *  Construtor do Menu
	 */
	public Menu(){
		optionsArray = new ArrayList<Integer>();
		optionsArray.clear();
		for(int i = 1; i < MAX_OPTION+1; i++){
			optionsArray.add(i);
		}
	}
	
	/*
	 *  Função para mostrar opções disponíveis.
	 */
	
	public void showOptions(){
		System.out.println("\n[1] - \tLer 3 valores inteiros do usuário e mostrar o maior deles, o menor deles e a média.");
		System.out.println("[2] - \tLer 3 valores numéricos e imprimir a soma dos 2 maiores e a diferença dos 2 menores.");
		System.out.println("[3] - \tLer dois valores de hora, minuto e segundo (h1, m1, s1, h2, m2, s2)."
									+ "\n\t Em seguida imprimir o intervalo entre esses dois horários em hora, minuto e segundo.");
		System.out.println("[4] - \tLer uma temperatura em graus Celsius e transformá-la em graus Fahrenheit.");
		System.out.println("[5] - \tLer uma temperatura e a escala (C-Celsius ou F- Fahrenheit ) e convertê-la para a outra escala.");
		System.out.println("[6] - \tLer o número de horas trabalhadas e o valor da hora do professor e imprimir o salário bruto e líquido");
		System.out.println("[7] - \tLer o número de horas trabalhadas e o valor da hora e calcular o salário semanal de um trabalhador.");
		System.out.println("[8] - \tLer os valores inteiros x, y e z e determinar se estes valores podem formar os lados de um triângulo."
									+ "\n\t Em caso afirmativo, informar se o triângulo é equilátero, isósceles ou escaleno.");
		System.out.println("[9] - \tLer um número inteiro de 100 a 999 e imprimir a soma dos dígitos que compõem o número.");
		System.out.println("[10] - \tO número 3025 possui a seguinte característica: 30 + 25 = 55 => 55*55 = 3025. "
									+ "\n\tFazer um programa para ler um número inteiro de 4 dígitos e "
									+ "\n\tverificar se ele possui essa propriedade. ");
		System.out.println("[11] - \tSair");
	}
	
	/*
	 *  Função para indicar se a opção escolhida é válida.
	 */
	
	public boolean optionContain(Integer i){
		return optionsArray.contains(i);
	}
	
	/*
	 * Funções para lidar com a opção escolhida
	 */
	
	public void optionHandler(Scanner reader){
		switch(option){
		case 1:
			Exe1 exercicio1 = new Exe1(reader);
			exercicio1.handle();
			break;
		case 2:
			Exe2 exercicio2 = new Exe2(reader);
			exercicio2.handle();
			break;
		case 3:
			Exe3 exercicio3 = new Exe3(reader);
			exercicio3.handle();
			break;
		case 4:
			Exe4 exercicio4 = new Exe4(reader);
			exercicio4.handle();
			break;
		case 5:
			Exe5 exercicio5 = new Exe5(reader);
			exercicio5.handle();
			break;
		case 6:
			Exe6 exercicio6 = new Exe6(reader);
			exercicio6.handle();
			break;
		}
	}
	
	/*
	 *  Funções Set/Get
	 */
	
	public int getOption(){
		return option;
	}
	
	public void setOption(int o){
		option = o;
	}

}
