/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

package VetoresMatrizes;

import java.util.Scanner;

public class dadorefeito {
	
	public static void main (String args[]) {

		Scanner ler = new Scanner(System.in);
		
		int limite=4, vet[] = new int[limite],x;
		double media,soma=0,qtd=0,maior=0;
		
		for(x=0;x<limite;x++) {
			
			System.out.println("Anote os valores do dado lançado: ");
			vet[x] = ler.nextInt();
			
			
			if (vet[x] == 6) {
				
				maior++;
			}
			
			soma=soma+vet[x];
			qtd++;
		}
		
		
		for(x=0;x<limite;x++) {
			
			System.out.printf("\nOs números anotados são: %d\n",vet[x]);
		}
		
		
		media = soma / qtd;
		
		System.out.println("\nA média dos números lançados foi: \n"+media);
		System.out.println("\nOcorreram "+qtd+" lançamentos");
		System.out.println("\nA maior pontuação 6 foi lançada: "+maior+" vezes");
	}
		
}


