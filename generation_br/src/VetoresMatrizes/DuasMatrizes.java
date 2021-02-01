/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

package VetoresMatrizes;

import java.util.Scanner;

public class DuasMatrizes {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int n1[][] = new int[2][2], n2[][] = new int[2][2], m1[][] = new int[2][2], m2[][] = new int[2][2], l, c, soma,
				diferenca;

		// Montando primeira matriz

		for (l = 0; l < 2; l++) {

			for (c = 0; c < 0; c++) {

				System.out.println("Informe os valores da primeira matriz: ");
				n1[l][c] = ler.nextInt();
			}
		}

		// Montando segunda matriz

		for (l = 0; l < 2; l++) {

			for (c = 0; c < 0; c++) {

				System.out.println("Informe os valores da primeira matriz: ");
				n2[l][c] = ler.nextInt();
			}
		}
		
		// Somando matrizes
		
	/*	for(l=0;l<2;l++) {
			
			for(c=0;c<2;c++) {
				
				m1[l][c] = n1[l][c] + n2[l][c];
				
			}
		}
*/
		/* Diferença matrizes
		
		for(l=0;l<2;l++) {
			
			for(c=0;c<2;c++) {
				
				m1[l][c] = n1[l][c] - n2[l][c];
			}
		}*/
		
	 //Exibindo matriz
		
		//System.out.println(m1);
	}

}
