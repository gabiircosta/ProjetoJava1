/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package LacosCondicionais;

import java.util.Scanner;
public class ParImpar {

		public static void main (String args[]) {
			
			Scanner ler = new Scanner(System.in);
			
			double numero, raiz, elevado;
			
			System.out.println("Ol�, informe um n�mero: ");
			numero = ler.nextDouble();
			
			if (numero%2==0) {
				
				raiz = Math.sqrt(numero);
				System.out.printf("O n�mero informado � par e sua raiz quadrada � %2.2f",raiz);
			}
			else {
				
				elevado = Math.pow(numero, 2);
				System.out.printf("O n�mero informado � impar e elevado ao quadrado temo %2.2f ",elevado);
			
		}
	}  
} 
		
