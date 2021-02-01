/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas;
o número de mulheres nervosas;
o número de homens agressivos;
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos;
o número de pessoas calmas com menos de 18 anos.*/

package LacosRepeticao;

import java.util.Scanner;
public class Caracteristicas {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int x=0,idade, sexo, fp, PessoasCalmas=0, MulheresNervosas=0,HomensAgressivos=0,OutrosCalmos=0,PessoasNervosasMais40=0,PessoasCalmasMenos18=0;
		while(x!=3) {
			
			System.out.println("Olá, vamos fazer uma breve pesquisa.\nPor favor, informe sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Qual seu sexo?\n1-feminino / 2-masculino / 3-Outros ");
			sexo = ler.nextInt();			
			
			System.out.println("Digite 1, se você é uma pessoa calma / 2, se é uma pessoa nervosa / 3 se é uma pessoa agressiva ");
			fp = ler.nextInt();		
			
			if(fp==1) {
				
				PessoasCalmas++;
			}
			
			else if(sexo==1 && fp==2) {
				MulheresNervosas++;
			}
			
			else if (sexo==2 && fp==3) {
				HomensAgressivos++;
			}
			
			else if (fp==1 && sexo==3) {
				OutrosCalmos++;
			}
			
			else if (fp==2 && idade>40) {
				PessoasNervosasMais40++;
			}
			
			else if (fp==1 && idade<18) {
				PessoasCalmasMenos18++;
			}
			
			x++;
			
		}
		
		System.out.println("Com base na pesquisa, o número de pessoas calmas é de: "+PessoasCalmas+"\nMulheres nervosas: "+MulheresNervosas+
				"\nHomens agressivos: "+HomensAgressivos+"\nOutros calmos: "+OutrosCalmos+"\nPessoas nervosas com mais de 40 anos: "+PessoasNervosasMais40+
				"\nPessoas calmas com menos de 18 anos: "+PessoasCalmasMenos18);
	}
		
}
