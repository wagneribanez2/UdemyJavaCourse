/*
Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.

Entrada
3 4
10 8 15 12
21 11 23 8
14 5 13 19
8

Saida
Position 0,1:
Left: 10
Right: 15
Down: 11
Position 1,3:
Left: 23
Up: 12
Down: 19
 */

package exerciciosSecao5Matriz;

import java.util.Scanner;

public class Matriz {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int x, l, c;
		int positions[] = new int[4];
		l = Integer.parseInt(sc.next());
		c = Integer.parseInt(sc.next());

		int matriz[][] = new int[l][c];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				matriz[i][j] = Integer.parseInt(sc.next());
			}
		}
		
		x = Integer.parseInt(sc.next());
		System.out.println(matriz.length);
		
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				if(matriz[i][j] == x) {
					System.out.printf("Position %d,%d%n", i, j);
					int left,right, up, down;
					left = right = up = down =0;
					
					//left
					if(j-1 != -1 ) {
						left = matriz[i][j-1];
						System.out.println("Left: "+left);
					}					
					
					//right
					if(j+1 < matriz[i].length ) {
						right = matriz[i][j+1];
						System.out.println("Right: "+right);
					}
					
					//up
					if(i-1 != -1 ) {
						up = matriz[i-1][j];
						System.out.println("Up: "+up);
					}
					
					//down
					if(i+1 < j ) {
						down = matriz[i+1][j];
						System.out.println("Down: "+down);
					}																					
				}
			}
		}
		sc.close();
	}
}

