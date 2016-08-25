/**
 * Programação Orientada a Objetos
 * Lista de exercícios 1
 * 
 * Classe contendo funções para resolução do Exercício 3
 * Ler dois valores de hora, minuto e segundo (h1, m1, s1, h2, m2, s2). 
 * Em seguida imprimir o intervalo entre esses dois horários em hora, minuto e segundo.
 * Dica: converta os horários lidos para segundos, calcule a diferença e converta a diferença em hora, minuto e segundo.
 * 
 * @author Felipe Martins Athayde Alves
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exe3 {
	private ArrayList<Integer> values;
	public Scanner reader;
	
	public Exe3(Scanner r){
		values = new ArrayList<Integer>();
		reader = r;
	}
	
	public void handle(){
		System.out.println("\nDigite o primeiro horário na forma:  hh:mm:ss");
		
		values.clear();
		
		String valuesString = reader.nextLine();		
		String[] strValues = valuesString.trim().split("\\s*:\\s*");
		
		for(int i = 0; i < 3; i++){
			if(i <= strValues.length-1){
				values.add(Support.tryParse(strValues[i]));
			} else {
				values.add(0);
			}
		}
		
		System.out.println("\nDigite o segundo horário na forma:  hh:mm:ss");
		
		String valuesString2 = reader.nextLine();		
		String[] strValues2 = valuesString2.trim().split("\\s*:\\s*");
		
		for(int i = 0; i < 3; i++){
			if(i <= strValues2.length-1){
				values.add(Support.tryParse(strValues2[i]));
			} else {
				values.add(0);
			}
		}
		
		System.out.println("A diferença de tempo é: " + this.getTimeDelta());
	}
	
	public void timeToSeconds(){
		Integer h1 = values.get(0);
		h1 *= 3600;
		values.set(0,h1);
		
		Integer m1 = values.get(1);
		m1 *= 60;
		values.set(1,m1);
		
		Integer h2 = values.get(3);
		h2 *= 3600;
		values.set(3,h2);
		
		Integer m2 = values.get(4);
		m2 *= 60;
		values.set(4,m2);
	}
	
	public String getTimeDelta(){
		
		this.timeToSeconds();
		
		Integer timeInitial;
		Integer timeFinal;
		Integer timeDelta;
		
		timeInitial = values.get(0) + values.get(1) + values.get(2);
		timeFinal = values.get(3) + values.get(4) + values.get(5);
		timeDelta = timeFinal - timeInitial;
		
		if(timeDelta <= 0){
			timeDelta = timeInitial - timeFinal;
		}
		
		Double hDouble = Math.floor(timeDelta/3600);
		Integer h = hDouble.intValue();
		timeDelta -= h*3600; 
		
		Double mDouble = Math.floor(timeDelta/60);
		Integer m = mDouble.intValue();
		timeDelta -= m*60;
		
		Integer s = timeDelta;
		
		String delta;
		delta = h.toString();
		delta += ":";
		delta += (m < 10)? "0" + m : m;
		delta += ":";
		delta += (s < 10)? "0" + s : s;
		
		return delta;
	}
}
