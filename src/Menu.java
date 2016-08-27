/**
 * Programa��o Orientada a Objetos
 * Lista de exerc�cios 1
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
	 *  Fun��o para mostrar op��es dispon�veis.
	 */
	
	public void showOptions(){
		System.out.println("\n[1] - \tLer 3 valores inteiros do usu�rio e mostrar o maior deles, o menor deles e a m�dia.");
		System.out.println("[2] - \tLer 3 valores num�ricos e imprimir a soma dos 2 maiores e a diferen�a dos 2 menores.");
		System.out.println("[3] - \tLer dois valores de hora, minuto e segundo (h1, m1, s1, h2, m2, s2)."
									+ "\n\t Em seguida imprimir o intervalo entre esses dois hor�rios em hora, minuto e segundo.");
		System.out.println("[4] - \tLer uma temperatura em graus Celsius e transform�-la em graus Fahrenheit.");
		System.out.println("[5] - \tLer uma temperatura e a escala (C-Celsius ou F- Fahrenheit ) e convert�-la para a outra escala.");
		System.out.println("[6] - \tLer o n�mero de horas trabalhadas e o valor da hora do professor e imprimir o sal�rio bruto e l�quido");
		System.out.println("[7] - \tLer o n�mero de horas trabalhadas e o valor da hora e calcular o sal�rio semanal de um trabalhador.");
		System.out.println("[8] - \tLer os valores inteiros x, y e z e determinar se estes valores podem formar os lados de um tri�ngulo."
									+ "\n\t Em caso afirmativo, informar se o tri�ngulo � equil�tero, is�sceles ou escaleno.");
		System.out.println("[9] - \tLer um n�mero inteiro de 100 a 999 e imprimir a soma dos d�gitos que comp�em o n�mero.");
		System.out.println("[10] - \tO n�mero 3025 possui a seguinte caracter�stica: 30 + 25 = 55 => 55*55 = 3025. "
									+ "\n\tFazer um programa para ler um n�mero inteiro de 4 d�gitos e "
									+ "\n\tverificar se ele possui essa propriedade. ");
		System.out.println("[11] - \tSair");
	}
	
	/*
	 *  Fun��o para indicar se a op��o escolhida � v�lida.
	 */
	
	public boolean optionContain(Integer i){
		return optionsArray.contains(i);
	}
	
	/*
	 * Fun��es para lidar com a op��o escolhida
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
	 *  Fun��es Set/Get
	 */
	
	public int getOption(){
		return option;
	}
	
	public void setOption(int o){
		option = o;
	}

}
