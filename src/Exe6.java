/**
 * Programa��o Orientada a Objetos
 * Lista de exerc�cios 1
 * 
 * Classe contendo fun��es para resolu��o do Exerc�cio 6
 * Ler o n�mero de horas trabalhadas e o valor da hora do professor e imprimir 
 * o sal�rio bruto e l�quido, sabendo que o desconto do IR segue a f�rmula:
 * Sal�rio menor ou igual a R$ 1200,00 - desconto ZERO
 * Sal�rio maior que R$1200,00 e menor ou igual a R$ 1800,00 - desconto de 10%
 * Sal�rio maior que R$1800,00 e menor ou igual a R$ 2200,00 - desconto de 15%
 * Sal�rio maior que R$2200,00 - desconto de 27,5%
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.Scanner;

public class Exe6 {
    public Scanner reader;
	
    public Exe6(Scanner r){
        reader = r;
    }
    
    public void handle(){
        System.out.println("\nDigite o n�mero de horas trabalhadas e o valor da hora do professor\n"
                + " separando os valores com espa�o: ");

        String temp = reader.nextLine();
        String[] values = temp.trim().split(" ");
        
        System.out.println("O valor do sal�rio bruto �: R$" 
                + String.format("%.2f", bruteSalary(
                        Support.tryParse(values[0]),
                        Support.tryParseDouble(values[1])
                )
            )
        );
        System.out.println("O valor do sal�rio l�quido �: R$"
                + String.format("%.2f", liquidSalary(
                        bruteSalary(
                        Support.tryParse(values[0]),
                        Support.tryParseDouble(values[1])
                        )
                )
            )
        );
    }
    
    public double bruteSalary(int time, double value){
        double salary;
        salary = value*time;
        return salary;
    }
    
    public double liquidSalary(double salary){
        if(salary >= 1200.00 && salary < 1800.00){
            salary *= 0.9;
        } else if (salary >= 1800.00 && salary < 2200.00){
            salary *= 0.85;
        } else if (salary >= 2200.00){
            salary *= 0.725;
        }
        return salary;
    }
}
