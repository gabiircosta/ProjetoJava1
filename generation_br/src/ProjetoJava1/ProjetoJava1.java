package ProjetoJava1;

import java.util.Scanner;
public class ProjetoJava1 {

	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int x;

		System.out.println("Os Objetivos de Desenvolvimento Sustentável (ODS) da Organização das Nações Unidas (ONU)  pertecem uma agenda mundial de propósitos estabelecidos  durante a Cúpula das Nações Unidas sobre o Desenvolvimento Sustentável, em setembro de 2015.\r\n"
				+ "Os ODS são formados por  17 objetivos e 169 metas que tratam das mazelas sociais em três âmbitos do desenvolvimento sustentável: econômico, ambiental e social.\r\n"
				+ "\r\n"
				+ "Algumas vezes pode parar que estes objetivos e metas são cabíveis apenas aos governos e empresas, mas dentro do objetivo 12, por exemplo, há algumas ações que você pode ajudar a contribuir diretamente com suas ações diárias. O objetivo 12 foca na produção e consumo sustentáveis, onde pode-se destacar a  utilização dos 3 R's (Reduzir, Reutilizar e Reciclar). \r\n"
				+ "Pensando nisso, te pergunto: Você sabe quais materiais são ou não recicláveis e qual é o seu descarte correto?\r\n"
				+ "Você sabia que além dos 3 R's existem outros objetivos e metas que você pode ajudar a atingir? \r\n"
				+ "\r\n"
				+ "Você também tem o poder de mudar o mundo e se quiser\r\n"
				+ "Os Objetivos de Desenvolvimento Sustentável (ODS) da Organização das Nações Unidas (ONU)  pertecem uma agenda mundial de propositos estabelecidos  durante a Cúpula das Nações Unidas sobre o Desenvolvimento Sustentável, em setembro de 2015.\r\n"
				+ "Os ODS são formados por  17 objetivos e 169 metas que tratam das mazelas sociais em três âmbitos do desenvolvimento sustentável: econômico, ambiental e social.\r\n"
				+ "\r\n"
				+ "Algumas vezes pode achar que estes objetivos e metas são cabíveis apenas aos governos e empresas, mas dentro do objetivo 12, por exemplo, há algumas ações que você pode ajudar a contribuir diretamente com suas ações diárias. O objetivo 12 foca na produção e consumo sustentáveis, onde pode-se destacar a a utilização dos 3 R's (Reduzir, Reutilizar e Reciclar). \r\n"
				+ "Pensando nisso, te pergunto: Você sabe quais materiais são ou não reciclavéis e qual é o seu descarte correto?\r\n"
				+ "Você sabia que além dos 3 R's existem outros objetivos e metas que você pode ajudar a atingir? \r\n"
				+ "\r\n"
				+ "Você também tem o poder de mudar o mundo e se quiser\r\n e se quiser saber como, vem aqui no nosso Menu :)\r\n"
				+ ""
				);
		
		
		System.out.println("Escolha abaixo sobre o que você mais gostaria de saber: \n"
				           +"1 - ODS \n"
						   +"2 - Coleta seletiva\n");
		x = ler.nextInt();
		
		
		while(x<1  || x>2) {
			System.out.println("Você digitou uma opção inválida! \nEscolha abaixo sobre o que você mais gostaria de saber: \n"
			           +"1 - ODS \n"
					   +"2 - Coleta seletiva\n");
			x = ler.nextInt();
		}
		
		
		System.out.println("\nMenu ODS \n\n1 - Erradicação da Pobreza \n"
				+ "2 - Fome Zero e Agricultura Sustentável \n"
				+ "3 - Saúde e Bem-Estar \n"
				+ "4 - Educação de Qualidade \n"
				+ "5 - Igualdade de Gênero \n"
				+ "6 - Água Potável e Saneamento\r\n"
				+ "7 - Energia Acessível e Limpa \n"
				+ "8 - Trabalho Decente e Crescimento Econômico\r\n"
				+ "9 - Indústria, Inovação e Infraestrutura\r\n"
				+ "10 - Redução da Desigualdades\n"
				+"11 - Cidades e Comunidades Sustentáveis\r\n"
				+ "12 - Consumo e Produção Responsáveis\r\n"
				+ "13 - Ação Contra a Mudança Global do Clima\r\n"
				+ "14 - Vida na Água\r\n"
				+ "15 - Vida Terrestre\r\n"
				+ "16 - Paz, Justiça e Instituições Eficazes\r\n"
				+ "17 - Parcerias e Meios de Implementação\r\n");
		
		System.out.print("Digite sua opção: ");
		x= ler.nextInt();
		
		while (x<1 || x>17) {
			
			System.out.println("Você digitou uma opção inválida! Escolha algumas das opções abaixo:\nMenu ODS \n\n1 - Erradicação da Pobreza \n"
					+ "2 - Fome Zero e Agricultura Sustentável \n"
					+ "3 - Saúde e Bem-Estar \n"
					+ "4 - Educação de Qualidade \n"
					+ "5 - Igualdade de Gênero \n"
					+ "6 - Água Potável e Saneamento\r\n"
					+ "7 - Energia Acessível e Limpa \n"
					+ "8 - Trabalho Decente e Crescimento Econômico\r\n"
					+ "9 - Indústria, Inovação e Infraestrutura\r\n"
					+ "10 - Redução da Desigualdades\n"
					+"11 - Cidades e Comunidades Sustentáveis\r\n"
					+ "12 - Consumo e Produção Responsáveis\r\n"
					+ "13 - Ação Contra a Mudança Global do Clima\r\n"
					+ "14 - Vida na Água\r\n"
					+ "15 - Vida Terrestre\r\n"
					+ "16 - Paz, Justiça e Instituições Eficazes\r\n"
					+ "17 - Parcerias e Meios de Implementação\r\n");
			
			System.out.print("Digite sua opção: ");
			x= ler.nextInt();
		}
		
		
		
		
	}
}
