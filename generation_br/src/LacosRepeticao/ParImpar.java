/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

package LacosRepeticao;

import java.util.Scanner;
public class ParImpar {

		public static void main (String args[]) {
			
			Scanner ler = new Scanner(System.in);
			int numero,x,par=0,impar=0;
			
			for(x=0;x<10;x++) {
				
				System.out.println("Informe um n�mero: ");
				numero = ler.nextInt();
				
				if(numero%2==0) {
					par++;
				}
				
				else {
					impar++;
				}
				

			}
			
			System.out.println("Temos "+par+" n�meros pares e "+impar+" n�meros impares");
		}
}