/*
Na contagem de votos de uma eleição, são gerados vários registros
de votação contendo o nome do candidato e a quantidade de votos
(formato .csv) que ele obteve em uma urna de votação. Você deve
fazer um programa para ler os registros de votação a partir de um
arquivo, e daí gerar um relatório consolidado com os totais de cada
candidato.

Input file example:
Alex Blue,15
Maria Green,22
Bob Brown,21
Alex Blue,30
Bob Brown,15
Maria Green,27
Maria Green,22
Bob Brown,25
Alex Blue,31

Execution:
Alex Blue: 76
Maria Green: 71
Bob Brown: 61
 */
package Secao14Map.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
	public static void main(String[] args) {
		Map<String, Integer> votes = new HashMap<>();
		try(FileReader fr = new FileReader("C:\\Users\\Wagner\\Desktop\\ws-eclipse\\course\\bin\\Secao14Map\\application\\in.csv");
			BufferedReader br = new BufferedReader(fr)){
			
			String line = br.readLine();
			
			while(line != null) {
				String[] string = line.split(",");
				
				//verifica se o candidato já está no conjunto
				//se verdadeiro soma os votos e atualiza
				if(votes.containsKey(string[0])) {
					int sum = 0;
					sum = votes.get(string[0]) + Integer.parseInt(string[1]);
					votes.put(string[0], sum);
				}else {
					votes.put(string[0], Integer.parseInt(string[1]));
				}
				
				line = br.readLine();
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String key : votes.keySet()) {
			System.out.println(key + ": " +  votes.get(key));
		}
	}
}
