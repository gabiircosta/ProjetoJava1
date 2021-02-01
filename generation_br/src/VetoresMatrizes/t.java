/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

package VetoresMatrizes;

import java.util.Scanner;

public class t {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int limite=3, mat[][] = new int [limite][limite], l, c,soma=0, somageral=0;
		
		for(l=0;l<limite;l++) {
			
			for(c=0;c<limite;c++) {
				
				System.out.println("Informe os números da matriz: ");
				mat[l][c] = ler.nextInt();
				
				somageral = somageral +mat[l][c];
				if(l==c) {
					
					soma = soma+mat[l][c]; 
				}
			}
				
			}
		System.out.println("A soma de toda matriz é: "+somageral);
		System.out.println("A soma da primeira diagonal é: "+soma);
			
		}
	}

