/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

package VetoresMatrizes;

import java.util.Scanner;

public class dadorefeito {
	
	public static void main (String args[]) {

		Scanner ler = new Scanner(System.in);
		
		int limite=4, vet[] = new int[limite],x;
		double media,soma=0,qtd=0,maior=0;
		
		for(x=0;x<limite;x++) {
			
			System.out.println("Anote os valores do dado lan�ado: ");
			vet[x] = ler.nextInt();
			
			
			if (vet[x] == 6) {
				
				maior++;
			}
			
			soma=soma+vet[x];
			qtd++;
		}
		
		
		for(x=0;x<limite;x++) {
			
			System.out.printf("\nOs n�meros anotados s�o: %d\n",vet[x]);
		}
		
		
		media = soma / qtd;
		
		System.out.println("\nA m�dia dos n�meros lan�ados foi: \n"+media);
		System.out.println("\nOcorreram "+qtd+" lan�amentos");
		System.out.println("\nA maior pontua��o 6 foi lan�ada: "+maior+" vezes");
	}
		
}


