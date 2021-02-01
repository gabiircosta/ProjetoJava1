package ProjetoJava1;

import java.util.Scanner;
public class ProjetoJava1 {

	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int x;

		System.out.println("Os Objetivos de Desenvolvimento Sustent�vel (ODS) da Organiza��o das Na��es Unidas (ONU)  pertecem uma agenda mundial de prop�sitos estabelecidos  durante a C�pula das Na��es Unidas sobre o Desenvolvimento Sustent�vel, em setembro de 2015.\r\n"
				+ "Os ODS s�o formados por  17 objetivos e 169 metas que tratam das mazelas sociais em tr�s �mbitos do desenvolvimento sustent�vel: econ�mico, ambiental e social.\r\n"
				+ "\r\n"
				+ "Algumas vezes pode parar que estes objetivos e metas s�o cab�veis apenas aos governos e empresas, mas dentro do objetivo 12, por exemplo, h� algumas a��es que voc� pode ajudar a contribuir diretamente com suas a��es di�rias. O objetivo 12 foca na produ��o e consumo sustent�veis, onde pode-se destacar a  utiliza��o dos 3 R's (Reduzir, Reutilizar e Reciclar). \r\n"
				+ "Pensando nisso, te pergunto: Voc� sabe quais materiais s�o ou n�o recicl�veis e qual � o seu descarte correto?\r\n"
				+ "Voc� sabia que al�m dos 3 R's existem outros objetivos e metas que voc� pode ajudar a atingir? \r\n"
				+ "\r\n"
				+ "Voc� tamb�m tem o poder de mudar o mundo e se quiser\r\n"
				+ "Os Objetivos de Desenvolvimento Sustent�vel (ODS) da Organiza��o das Na��es Unidas (ONU)  pertecem uma agenda mundial de propositos estabelecidos  durante a C�pula das Na��es Unidas sobre o Desenvolvimento Sustent�vel, em setembro de 2015.\r\n"
				+ "Os ODS s�o formados por  17 objetivos e 169 metas que tratam das mazelas sociais em tr�s �mbitos do desenvolvimento sustent�vel: econ�mico, ambiental e social.\r\n"
				+ "\r\n"
				+ "Algumas vezes pode achar que estes objetivos e metas s�o cab�veis apenas aos governos e empresas, mas dentro do objetivo 12, por exemplo, h� algumas a��es que voc� pode ajudar a contribuir diretamente com suas a��es di�rias. O objetivo 12 foca na produ��o e consumo sustent�veis, onde pode-se destacar a a utiliza��o dos 3 R's (Reduzir, Reutilizar e Reciclar). \r\n"
				+ "Pensando nisso, te pergunto: Voc� sabe quais materiais s�o ou n�o reciclav�is e qual � o seu descarte correto?\r\n"
				+ "Voc� sabia que al�m dos 3 R's existem outros objetivos e metas que voc� pode ajudar a atingir? \r\n"
				+ "\r\n"
				+ "Voc� tamb�m tem o poder de mudar o mundo e se quiser\r\n e se quiser saber como, vem aqui no nosso Menu :)\r\n"
				+ ""
				);
		
		
		System.out.println("Escolha abaixo sobre o que voc� mais gostaria de saber: \n"
				           +"1 - ODS \n"
						   +"2 - Coleta seletiva\n");
		x = ler.nextInt();
		
		
		while(x<1  || x>2) {
			System.out.println("Voc� digitou uma op��o inv�lida! \nEscolha abaixo sobre o que voc� mais gostaria de saber: \n"
			           +"1 - ODS \n"
					   +"2 - Coleta seletiva\n");
			x = ler.nextInt();
		}
		
		
		System.out.println("\nMenu ODS \n\n1 - Erradica��o da Pobreza \n"
				+ "2 - Fome Zero e Agricultura Sustent�vel \n"
				+ "3 - Sa�de e Bem-Estar \n"
				+ "4 - Educa��o de Qualidade \n"
				+ "5 - Igualdade de G�nero \n"
				+ "6 - �gua Pot�vel e Saneamento\r\n"
				+ "7 - Energia Acess�vel e Limpa \n"
				+ "8 - Trabalho Decente e Crescimento Econ�mico\r\n"
				+ "9 - Ind�stria, Inova��o e Infraestrutura\r\n"
				+ "10 - Redu��o da Desigualdades\n"
				+"11 - Cidades e Comunidades Sustent�veis\r\n"
				+ "12 - Consumo e Produ��o Respons�veis\r\n"
				+ "13 - A��o Contra a Mudan�a Global do Clima\r\n"
				+ "14 - Vida na �gua\r\n"
				+ "15 - Vida Terrestre\r\n"
				+ "16 - Paz, Justi�a e Institui��es Eficazes\r\n"
				+ "17 - Parcerias e Meios de Implementa��o\r\n");
		
		System.out.print("Digite sua op��o: ");
		x= ler.nextInt();
		
		while (x<1 || x>17) {
			
			System.out.println("Voc� digitou uma op��o inv�lida! Escolha algumas das op��es abaixo:\nMenu ODS \n\n1 - Erradica��o da Pobreza \n"
					+ "2 - Fome Zero e Agricultura Sustent�vel \n"
					+ "3 - Sa�de e Bem-Estar \n"
					+ "4 - Educa��o de Qualidade \n"
					+ "5 - Igualdade de G�nero \n"
					+ "6 - �gua Pot�vel e Saneamento\r\n"
					+ "7 - Energia Acess�vel e Limpa \n"
					+ "8 - Trabalho Decente e Crescimento Econ�mico\r\n"
					+ "9 - Ind�stria, Inova��o e Infraestrutura\r\n"
					+ "10 - Redu��o da Desigualdades\n"
					+"11 - Cidades e Comunidades Sustent�veis\r\n"
					+ "12 - Consumo e Produ��o Respons�veis\r\n"
					+ "13 - A��o Contra a Mudan�a Global do Clima\r\n"
					+ "14 - Vida na �gua\r\n"
					+ "15 - Vida Terrestre\r\n"
					+ "16 - Paz, Justi�a e Institui��es Eficazes\r\n"
					+ "17 - Parcerias e Meios de Implementa��o\r\n");
			
			System.out.print("Digite sua op��o: ");
			x= ler.nextInt();
		}
		
		
		
		
	}
}
