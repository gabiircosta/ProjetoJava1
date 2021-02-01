/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

package VetoresMatrizes;

import java.util.Scanner;

public class Dado {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);

		int limite = 4, vezes[] = new int[limite], x, maior=0;
		double lanc = 0, soma = 0, media;

		System.out.println("Um dado foi lan�ado 10 vezes, vamos anotar seus valores ");

		for (x = 0; x < limite; x++) {

			System.out.printf("Informe o valor do %d� lan�amento: ", (x + 1));
			vezes[x] = ler.nextInt();
				
			if(vezes[x]==6) {
				maior++;
			}
			
			soma = soma + vezes[x];
			lanc++;
		}

		for (x = 0; x < limite; x++) {

			System.out.printf("\nO valor anotado no primeiro %d� lan�amento foi: %d ", (x + 1), vezes[x], "\n");

		}
		

		
		media = soma / lanc;
		System.out.println("\n\nA m�dia dos lan�amentos foi: " + media);
		System.out.println("\n\nA maior pontua��o teve: " + maior+" ocorr�ncias!");
	}
}
