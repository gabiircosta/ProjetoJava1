/*6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package LacosRepeticao;

import java.util.Scanner;
public class MediaMultiplosTres {

	
		public static void main (String args[]) {
			
			Scanner ler = new Scanner(System.in);
			
			float numero,soma=0,cont=0,media;
			
			do {
				
				System.out.println("Informe um n�mero: ");
				numero = ler.nextFloat();
				
				
				
				if(numero!=0) {
					
					
				if(numero%3 == 0) {
					
					 cont++;
					 soma = soma + numero;
				}
			}
		}
			
			while(numero!=0);
			
			media = soma/cont;
			
			System.out.println("A m�dia dos n�meros m�ltiplos de 3 � "+media);
		}
}
