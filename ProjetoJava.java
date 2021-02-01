package Turma15;

import java.util.Scanner;
public class ProjetoJava1 {

	
	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int x;
		String nome;
		
		System.out.println("Bem-vinde ao Mundo Melhor!\n");
		System.out.print("Informe seu nome: ");
		nome= ler.nextLine();

		System.out.println("\n");
		
		System.out.println("Os Objetivos de Desenvolvimento Sustent�vel (ODS) da Organiza��o das Na��es Unidas (ONU)  \npertecem a uma agenda mundial de prop�sitos estabelecidos durante a C�pula das Na��es Unidas sobre\no Desenvolvimento Sustent�vel, em setembro de 2015.\r\n"
				+ "Os ODS s�o formados por  17 objetivos e 169 metas que tratam das mazelas sociais em tr�s �mbitos do \ndesenvolvimento sustent�vel: econ�mico, ambiental e social.\r\n"
				+ "\r\n"
				+nome+", voc� pode achar que estes objetivos e metas s�o cab�veis apenas aos governos \ne empresas, mas dentro do objetivo 12, por exemplo, h� algumas a��es que voc� pode ajudar a \ncontribuir diretamente com suas a��es di�rias. O objetivo 12 foca na produ��o e consumo sustent�veis, \nonde pode-se destacar a  utiliza��o dos 3 R's (Reduzir, Reutilizar e Reciclar). \r\n"
				+ "Pensando nisso, te pergunto: Voc� sabe quais materiais s�o ou n�o recicl�veis e qual � o seu \ndescarte correto?\r\n"
				+ "Voc� sabia que al�m dos 3 R's existem outros objetivos e metas que voc� pode ajudar a atingir? \r\n"
				+ "\r\n"
				+ "Voc� tamb�m tem o poder de mudar o mundo!\r\n"
				+ "");
		
		do {
		System.out.print(nome + ", por favor, escolha abaixo sobre o que voc� mais gostaria de saber: \n"
				           +"1 - ODS \n"
						   +"2 - Coleta seletiva\n"
				           +"0 - Sair\nR:");
		x = ler.nextInt();
		
		
		while(x<0  || x>3) {
			System.out.print(nome+", voc� digitou uma op��o inv�lida! \nEscolha abaixo sobre o que voc� mais gostaria de saber: \n"
			           +"1 - ODS \n"
					   +"2 - Coleta seletiva\n"
					   +"0 - Sair\nR:");
			x = ler.nextInt();
		}
		
		if(x==1){
		
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
		
		System.out.print(nome+", digite sua op��o: ");
		x= ler.nextInt();
		
		while (x<1 || x>17) {
			
			System.out.println(nome+", voc� digitou uma op��o inv�lida! Escolha algumas das op��es abaixo:\nMenu ODS \n\n1 - Erradica��o da Pobreza \n"
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
			
			System.out.print(nome+ ", digite sua op��o: ");
			x= ler.nextInt();
		}
		
		String vetA[]= { "","1- Acabar com a pobreza em todas as suas formas, em todos os lugares\r\n"
				+ "\r\n"
				+ "Em 2000, o mundo comprometeu-se em reduzir pela metade o n�mero de pessoas vivendo em extrema pobreza e alcan�ou ganhos not�veis no desenvolvimento humano. At� 2015, a pobreza havia sido reduzida significativamente, o acesso ao ensino b�sico e os resultados da sa�de melhoraram, bem como foram realizados progressos na promo��o da igualdade de g�nero e no empoderamento das mulheres e meninas. No entanto, a erradica��o da pobreza extrema continua a ser um desafio, com mais de 700 milh�es de pessoas vivendo, globalmente, com menos de US$ 1,90 (PPP) por dia e mais da metade da popula��o global vivendo com menos de US$ 8,00 por dia.\r\n"
				+ "\r\n"
				+ "Em um mundo confrontado pelos crescentes desafios para o desenvolvimento, a Agenda 2030 reconhece que a erradica��o da pobreza, em todas as suas formas, � o maior desafio global para atingirmos o desenvolvimento sustent�vel. Por isso, a grande prioridade do desenvolvimento sustent�vel deve ser os mais pobres e vulner�veis: ningu�m ser� deixado para tr�s!\r\n"
				+ "","2- Acabar com a fome, alcan�ar a seguran�a alimentar e melhoria da nutri��o e promover a agricultura sustent�vel\r\n"
						+ "Durante as duas �ltimas d�cadas, o r�pido crescimento econ�mico e o desenvolvimento da agricultura foram respons�veis pela redu��o pela metade da propor��o de pessoas subnutridas no mundo. Entretanto, ainda h� 795 milh�es de pessoas no mundo que, em 2014, viviam sob o espectro da desnutri��o cr�nica. O ODS 2 pretende acabar com todas as formas de fome e m�-nutri��o at� 2030, de modo a garantir que todas as pessoas - especialmente as crian�as - tenham acesso suficiente a alimentos nutritivos durante todos os anos.\r\n"
						+ "\r\n"
						+ "Para alcan�ar este objetivo, � necess�rio promover pr�ticas agr�colas sustent�veis, por meio do apoio � agricultura familiar, do acesso equitativo � terra, � tecnologia e ao mercado.\r\n"
						+ "\r\n"
						+ "ODMs relacionados: 1\r\n"
						+ "","3- Assegurar uma vida saud�vel e promover o bem-estar para todos, em todas as idades\r\n"
								+ "Desde os ODM foram registrados progressos hist�ricos na redu��o da mortalidade infantil, na melhoria da sa�de materna e na luta contra o HIV/Aids, a tuberculose, a mal�ria e outras doen�as. Em 15 anos, o n�mero de pessoas infectadas pelo HIV anualmente caiu de 3,1 milh�es para 2 milh�es e mais de 6,2 milh�es de vidas foram salvas da mal�ria.\r\n"
								+ "\r\n"
								+ "Apesar do progresso, as doen�as cr�nicas e aquelas resultantes de desastres continuam a ser os principais fatores que contribuem para a pobreza e para a priva��o dos mais vulner�veis. Atualmente, 63% de todas as mortes do mundo prov�m de doen�as n�o transmiss�veis, principalmente cardiovasculares, respirat�rias, c�ncer e diabetes. Estima-se que as perdas econ�micas para os pa�ses de renda m�dia e baixa provenientes destas doen�as ultrapassaram US$ 7 trilh�es at� 2025.\r\n"
								+ "\r\n"
								+ "Os ODS prop�em metas integradas que abordam a promo��o da sa�de e bem estar como essenciais ao fomento das capacidades humanas.\r\n"
								+ "\r\n"
								+ "ODMs relacionados: 4, 5, 6\r\n"
								+ "","4- Assegurar a educa��o inclusiva e equitativa de qualidade, e promover oportunidades de aprendizagem ao longo da vida para todos\r\n"
										+ "Desde 2000, houve enorme progresso na promo��o do acesso universal � educa��o prim�ria para as crian�as ao redor do mundo. Para al�m do foco na educa��o b�sica, todos os n�veis de educa��o est�o contemplados no objetivo de desenvolvimento sustent�vel 4, que enxerga como fundamental a promo��o de uma educa��o inclusiva, igualit�ria e baseada nos princ�pios de direitos humanos e desenvolvimento sustent�vel. A promo��o da capacita��o e empoderamento dos indiv�duos � o centro deste objetivo, que visa ampliar as oportunidades das pessoas mais vulner�veis no caminho do desenvolvimento.\r\n"
										+ "\r\n"
										+ "ODMs relacionados: 2\r\n"
										+ "","5- Alcan�ar a igualdade de g�nero e empoderar todas as mulheres e meninas\r\n"
												+ "A igualdade de g�nero n�o � apenas um direito humano fundamental, mas a base necess�ria para a constru��o de um mundo pac�fico, pr�spero e sustent�vel. O esfor�o de alcance do ODS 5 � transversal � toda Agenda 2030 e reflete a crescente evid�ncia de que a igualdade de g�nero tem efeitos multiplicadores no desenvolvimento sustent�vel.\r\n"
												+ "\r\n"
												+ "Muitos avan�os em termos de assegurar melhores condi��es de vida a mulheres e meninas s�o um importante legado dos ODM. Os Objetivos de Desenvolvimento Sustent�vel visam intensificar estas realiza��es, n�o apenas nas �reas de sa�de, educa��o e trabalho, mas especialmente no combate �s discrimina��es e viol�ncias baseadas no g�nero e na promo��o do empoderamento de mulheres e meninas para que possam atuar enfaticamente na promo��o do desenvolvimento sustent�vel, por meio da participa��o na pol�tica, na economia, e em diversas �reas de tomada de decis�o.\r\n"
												+ "\r\n"
												+ "O desenvolvimento sustent�vel n�o ser� alcan�ado se as barreiras tang�veis e intang�veis que impedem o pleno desenvolvimento e exerc�cio das capacidades de metade da popula��o n�o forem eliminadas.\r\n"
												+ "\r\n"
												+ "ODMs relacionados: 3\r\n"
												+ "","6- Assegurar a disponibilidade e a gest�o sustent�vel da �gua e saneamento para todos\r\n"
														+ "A �gua est� no centro do desenvolvimento sustent�vel e das suas tr�s dimens�es - ambiental, \necon�mica e social. Os recursos h�dricos, bem como os servi�os a eles associados, sustentam os \nesfor�os de erradica��o da pobreza, de crescimento econ�mico e da sustentabilidade ambiental. \nO acesso � �gua e ao saneamento importa para todos os aspectos da dignidade humana: da seguran�a \nalimentar e energ�tica � sa�de humana e ambiental.\r\n"
														+ "\r\n"
														+ "A escassez de �gua afeta mais de 40% da popula��o mundial, n�mero que dever� subir ainda mais como \nresultado da mudan�a do clima e da gest�o inadequada dos recursos naturais. � poss�vel trilhar um \nnovo caminho que nos leve � realiza��o deste objetivo, por meio da coopera��o internacional, \nprote��o �s nascentes, rios e bacias e compartilhamento de tecnologias de tratamento de �gua.\r\n"
														+ "\r\n"
														+ "ODMs relacionados: 7\r\n"
														+ "","7- Assegurar o acesso confi�vel, sustent�vel, moderno e a pre�o acess�vel � energia para todos\r\n"
																+ "\r\n"
																+ "De 2000 a 2013, mais de 5% da popula��o mundial obteve acesso � eletricidade (de 79,313% para 84,58%). Para os pr�ximos anos a tend�ncia � aumentar a demanda por energia barata. Contudo, combust�veis f�sseis e suas emiss�es de gases de efeito estufa provocam mudan�as dr�sticas no clima. Atender �s necessidades da economia e proteger o meio ambiente � um dos grandes desafios para o desenvolvimento sustent�vel. Nesse sentido, o ODS 7 reconhece a import�ncia e tra�a metas focadas na transi��o energ�tica, de fontes n�o renov�veis e poluidoras, para fontes renov�veis limpas, com especial aten��o �s necessidades das pessoas e pa�ses em situa��o de maior vulnerabilidade.\r\n"
																+ "\r\n"
																+ "ODMs relacionados: 7\r\n"
																+ "","8- Promover o crescimento econ�mico sustentado, inclusivo e sustent�vel, o emprego pleno e produtivo e o trabalho decente para todos\r\n"
																		+ "\r\n"
																		+ "No longo prazo, a desigualdade de renda e de oportunidades prejudica o crescimento econ�mico e o alcance do desenvolvimento sustent�vel. Os mais vulner�veis, muitas vezes, t�m menores expectativas de vida e apresentam dificuldades de se libertarem de um c�rculo vicioso de insucesso escolar, baixas qualifica��es e poucas perspectivas de empregos de qualidade.\r\n"
																		+ "\r\n"
																		+ "A revitaliza��o econ�mica contribui para criar melhores condi��es para a estabilidade e a sustentabilidade do pa�s. � poss�vel promover pol�ticas que incentivem o empreendedorismo e a cria��o de empregos de forma sustent�vel e inclusiva. O ODS 8 reconhece a urg�ncia de erradicar o trabalho for�ado e formas an�logas ao do trabalho escravo, bem como o tr�fico de seres humanos, de modo a garantir a todos e todas o alcance pleno de seu potencial e capacidades.\r\n"
																		+ "\r\n"
																		+ "ODMs relacionados: 1\r\n"
																		+ "","9- Construir infraestruturas resilientes, promover a industrializa��o inclusiva e sustent�vel e fomentar a inova��o\r\n"
																				+ "Investimentos em infraestrutura e em inova��o s�o condi��es b�sicas para o crescimento econ�mico e para o desenvolvimento das na��es. Garantir uma rede de transporte p�blico e infraestrutura urbana de qualidade s�o condi��es necess�rias para o desenvolvimento sustent�vel. Por meio da promo��o de efici�ncia energ�tica e inclus�o social, o progresso tecnol�gico � tamb�m uma das chaves para as solu��es dos desafios econ�micos e ambientais. Garantir a igualdade de acesso � tecnologias � crucial para promover a informa��o e conhecimento para todos. O ODS 9 lista metas que visam � constru��o de estruturas resilientes e modernas, ao fortalecimento industrial de forma eficiente, ao fomento da inova��o, com valoriza��o da micro e pequena empresa e inclus�o dos mais vulner�veis aos sistemas financeiros e produtivos.\r\n"
																				+ "\r\n"
																				+ "ODMs relacionados: 1, 7\r\n"
																				+ "","10- Reduzir a desigualdade dentro dos pa�ses e entre eles\r\n"
																						+ "O mundo � mais desigual hoje do que em qualquer momento da hist�ria desde 1940. A desigualdade de renda e na distribui��o da riqueza dentro dos pa�ses t�m disparado, incapacitando os esfor�os de alcance dos resultados do desenvolvimento e de expans�o das oportunidades e habilidades das pessoas, especialmente dos mais vulner�veis.\r\n"
																						+ "\r\n"
																						+ "A desigualdade � um problema global que requer solu��es integradas. A vis�o estrat�gica deste objetivo se constr�i sob o objetivo da erradica��o da pobreza em todas suas dimens�es, na redu��o das desigualdades socioecon�micas e no combate �s discrimina��es de todos os tipos.\r\n"
																						+ "\r\n"
																						+ "Seu alcance depende de todos os setores na busca pela promo��o de oportunidades para as pessoas mais exclu�das no caminho do desenvolvimento. Foco importante do ODS 10 � o desafio contempor�neo das migra��es e fluxos de pessoas deslocadas entre pa�ses e regi�es devido a conflitos, eventos clim�ticos extremos ou persegui��es de quaisquer tipo. O alcance de suas metas � estruturante para a realiza��o de todos os outros 16 Objetivos de Desenvolvimento Sustent�vel.\r\n"
																						+ "\r\n"
																						+ "ODMs relacionados: 1\r\n"
																						+ "","11- Tornar as cidades e os assentamentos humanos inclusivos, seguros, resilientes e sustent�veis\r\n"
																								+ "Em 2014, 54% da popula��o mundial vivia em �reas urbanas, com proje��o de crescimento para 66% em 2050. Em 2030, s�o estimadas 41 megal�poles com mais de 10 milh�es de habitantes. Considerando que a pobreza extrema muitas vezes se concentra nestes espa�os urbanos, as desigualdades sociais acabam sendo mais acentuadas e a viol�ncia se torna uma consequ�ncia das discrep�ncias no acesso pleno � cidade. Transformar significativamente a constru��o e a gest�o dos espa�os urbanos � essencial para que o desenvolvimento sustent�vel seja alcan�ado. Temas intrinsecamente relacionados � urbaniza��o, como mobilidade, gest�o de res�duos s�lidos e saneamento, est�o inclu�dos nas metas do ODS 11, bem como o planejamento e aumento de resili�ncia dos assentamentos humanos, levando em conta as necessidades diferenciadas das �reas rurais, periurbanas e urbanas. O objetivo 11 est� alinhado � Nova Agenda Urbana, acordada em outubro de 2016, durante a III Confer�ncia das Na��es Unidas sobre Moradia e Desenvolvimento Urbano Sustent�vel.\r\n"
																								+ "\r\n"
																								+ "ODMs relacionados: 7\r\n"
																								+ "","12- Assegurar padr�es de produ��o e de consumo sustent�veis\r\n"
																										+ "Para alcan�ar as metas deste ODS, a mudan�a nos padr�es de consumo e produ��o se configuram como medidas indispens�veis na redu��o da pegada ecol�gica sobre o meio ambiente. Essas medidas s�o a base do desenvolvimento econ�mico e social sustent�vel. As metas do ODS 12 visam a promo��o da efici�ncia do uso de recursos energ�ticos e naturais, da infraestrutura sustent�vel, do acesso a servi�os b�sicos. Al�m disso, o objetivo prioriza a informa��o, a gest�o coordenada, a transpar�ncia e a responsabiliza��o dos atores consumidores de recursos naturais como ferramentas chave para o alcance de padr�es mais sustent�veis de produ��o e consumo.\r\n"
																										+ "\r\n"
																										+ "ODMs relacionados: 7\r\n"
																										+ "","13- Tomar medidas urgentes para combater a mudan�a do clima e seus impactos*\r\n"
																												+ "A mudan�a do clima � um evento transnacional, cujos impactos est�o desregulando economias nacionais e afetando pessoas em todos os lugares, principalmente aquelas em situa��o de maior vulnerabilidade nos pa�ses em desenvolvimento. Sem a a��o imediata frente � mudan�a do clima, a temperatura terrestre est� projetada para aumentar mais de 3 �C at� o final do s�culo XXI. Uma das metas para esse objetivo � mobilizar 100 milh�es de d�lares por ano at� 2020 para ajudar os pa�ses em desenvolvimento no plano de mitiga��o de desastres relacionados ao clima. O estabelecimento do ODS 13 apenas para lidar com a quest�o do clima � encarado como estrat�gico para a mobiliza��o dos atores capazes de promover as mudan�as necess�rias para impedir estas proje��es de se tornarem realidade.\r\n"
																												+ "Metas do Objetivo 13\r\n"
																												+ "","14- Conservar e promover o uso sustent�vel dos oceanos, dos mares e dos recursos marinhos para o desenvolvimento sustent�vel\r\n"
																														+ "Os oceanos tornam a vida humana poss�vel por meio da provis�o de seguran�a alimentar, transporte, fornecimento de energia, turismo, dentre outros. Al�m, por meio da regula��o da sua temperatura, qu�mica, correntes e formas de vida, os oceanos regulam muitos dos dos servi�os ecossist�micos mais cr�ticos do planeta, como ciclo do carbono e nitrog�nio, regula��o do clima, e produ��o de oxig�nio. Al�m, os oceanos representam aproximadamente US$ 3 trilh�es da economia global por ano, ou 5% do PIB global.\r\n"
																														+ "\r\n"
																														+ "40% dos oceanos est�o sendo afetados incisiva e diretamente por atividades humanas, como polui��o e pesca predat�ria, o que resulta, principalmente, em perda de habitat, introdu��o de esp�cies invasoras e acidifica��o. Nosso lixo tamb�m ajuda na degrada��o dos oceanos � h� 13.000 peda�os de lixo pl�stico em cada quil�metro quadrado. � frente a esses desafios que os Objetivos de Desenvolvimento Sustent�vel indicam metas para gerenciar e proteger a vida na �gua.\r\n"
																														+ "","15- Proteger, recuperar e promover o uso sustent�vel dos ecossistemas terrestres, gerir de forma sustent�vel as florestas, combater a desertifica��o, deter e reverter a degrada��o da terra e deter a perda\r\n"
																																+ "Os seres humanos e outros animais dependem da natureza para terem alimento, ar puro, �gua limpa e tamb�m como um meio de combate � mudan�a do clima. As florestas, que cobrem 30% da superf�cie da Terra, ajudam a manter o ar e a �gua limpa e o clima da Terra em equil�brio � sem mencionar que s�o o lar de milh�es de esp�cies. Promover o manejo sustent�vel das florestas, o combate � desertifica��o, parar e reverter a degrada��o da terra, interromper o processo de perda de biodiversidade s�o algumas das metas que o ODS 15 promove. Usar sustentavelmente os recursos naturais em cadeias produtivas e em atividades de subsist�ncia de comunidades, e integr�-los em pol�ticas p�blicas � tarefa central para o atingimento destas metas e a promo��o de todos os outros ODS.\r\n"
																																+ "","16- Promover sociedades pac�ficas e inclusivas para o desenvolvimento sustent�vel, proporcionar o acesso � justi�a para todos e construir institui��es eficazes, respons�veis e inclusivas em todos os n�vei\r\n"
																																		+ "Promover institui��es fortes, inclusivas e transparentes, a manuten��o da paz e o respeito aos direitos humanos baseados no Estado de direito s�o a base para o desenvolvimento humano sustent�vel. Estes s�o alguns dos princ�pios que sustentam as metas do ODS 16, que tamb�m inclui temas sens�veis, como o combate � explora��o sexual, ao tr�fico de pessoas e � tortura. Outros temas inclu�dos nas metas do ODS 16 s�o o enfrentamento � corrup��o, ao terrorismo, a pr�ticas criminosas, especialmente aquelas que ferem os direitos humanos.\r\n"
																																		+ "","17- Fortalecer os meios de implementa��o e revitalizar a parceria global para o desenvolvimento sustent�vel\r\n"
																																				+ "Os ODS s� ser�o realizados mediante um compromisso renovado de coopera��o entre a comunidade internacional e uma parceria global ampla que inclua todos os setores interessados e as pessoas afetadas pelos processos de desenvolvimento. Os meios de implementa��o e as parcerias para o desenvolvimento sustent�vel s�o vitais para o crescimento sustentado e para o desenvolvimento sustent�vel das na��es. O ODS 17 prop�e o caminho para a realiza��o efetiva da Agenda 2030 por todos os pa�ses, e a coordena��o de esfor�os na arena internacional � essencial para isso. A Coopera��o Sul-Sul e triangular, a transfer�ncia de tecnologia, o interc�mbio de dados e capital humano, bem como a assist�ncia oficial ao desenvolvimento s�o alguns dos principais meios para o alcance dos ODS."};

		
		System.out.println(vetA[x]);
			
	
		System.out.println("\nObrigado "+nome+", por aprender conosco sobre um Mundo Melhor!\n");
		}
		
		else if(x==2){
			System.out.println(nome+", por favor, escolha um tipo de res�duo:\n1 - Papel\r\n"
					+ "2 - Pl�stico\r\n"
					+ "3 - Madeira\r\n"
					+ "4 - Metal\r\n"
					+ "5 - Org�nico\r\n"
					+ "6 - Vidro\r\n"
					+ "7 - Res�duos Perigosos\r\n"
					+ "8 - N�o Recicl�vel\r\n"
					+ "");
			
			x=ler.nextInt();
			
			while(x<1 || x>8) {
			
				System.out.println(nome+", voc� digitou uma op��o invalida! \nEscolha um tipo de res�duo:\n1 - Papel\r\n"
						+ "2 - Pl�stico\r\n"
						+ "3 - Madeira\r\n"
						+ "4 - Metal\r\n"
						+ "5 - Org�nico\r\n"
						+ "6 - Vidro\r\n"
						+ "7 - Res�duos Perigosos\r\n"
						+ "8 - N�o Recicl�vel\r\n"
						+ "R: ");
				
				x=ler.nextInt();
			}
			
			if(x==1){
				System.out.println("= AZUL =\r\n"
						+ "Ol�,"+nome+", se voc� escolheu a op��o PAP�IS, � na minha lixeira que voc� deve dispens�-los: A Azul!\r\n"
						+ "Por aqui voc� pode jogar: jornais, revistas, sulfite, rascunhos, folhas de caderno, formul�rios, caixas de papel�o, aparas de papel, envelopes, cartazes, panfletos etc.\r\n"
						+ "Se liga, aqui eu n�o aceito: adesivos, papel carbono, celofane, guardanapos, bitucas de cigarro, pap�is plastificados, metalizados, pap�is sanit�rios, etc\r\n"
						+ "");
			}
			else if(x==2) {
				System.out.println("= VERMELHA =\r\n"
						+ "Ol�,"+nome+", se voc� escolheu a op��o PL�STICOS, � na minha lixeira que voc� deve dispens�-los: A Vermelha!\r\n"
						+ "Aqui n�s aceitamos sacolinhas, embalagens, copos, frascos, potes, tampinhas, tubos de PVC, embalagens PET (que s�o aquelas embalagens de refrigerantes, sucos, �gua, etc..).\r\n"
						+ "Mas fique esperto, aqui eu n�o engulo: cabos de panelas, adesivos, espuma, acr�lico, embalagens metalizadas (Biscoitos e Salgadinhos)!\r\n"
						+ "");
			}
			else if(x==3) {
				System.out.println("= PRETO = \r\n"
						+ "Ol�,"+nome+", se voc� escolheu a op��o MADEIRA, � na minha lixeira que voc� deve dispens�-los: A PRETA!\r\n"
						+ "\r\n"
						+ "Aqui v�o: galhos de �rvores, caixas, restos de constru��o, m�veis, artefatos e objetos, palitos de \ndente ou sorvete, res�duos industriais, etc.\r\n"
						+ "Ao descartar madeira, � necess�rio retirar todos os pregos, parafusos ou metais cortantes.\r\n"
						+ "Se liga, os outros tipos de res�duos n�o podem ser dispensados aqui.\r\n"
						+ "");
			}
			else if(x==4) {
				System.out.println("= AMARELO =\r\n"
						+ "Ol�,"+nome+", se voc� escolheu a op��o METAIS, � na minha lixeira que voc� deve dispens�-los: A Amarela!\r\n"
						+ "Aqui a gente aceita: tampinhas de garrafas, lacres de latinhas, latas, ferragens, arames, chapas, canos, pregos, parafusos, porcas, ferramentas, etc.\r\n"
						+ "Mas n�o esquece, por aqui n�o valo jogar: clipes, grampos, esponjas de a�o, aeross�is, latas de tinta ou verniz, solventes ou qu�micos, latas de inseticida, etc.\r\n"
						+ "");
			}
			else if(x==5) {
				System.out.println("= MARROM =\r\n"
						+ "Ol�,"+nome+", se voc� escolheu a op��o ORG�NICO, � na minha lixeira que voc� deve dispens�-los: A Marrom!\r\n"
						+ "Eu engulo quase tudo, se liga: cascas e restos de frutas, legumes e verduras, saquinhos de ch�, restos de p�es, biscoitos, p� e coador de caf�, esterco de animais herb�voros (Galinhas, Gado, Cavalos).\r\n"
						+ "S� que tem umas paradas que n�o descem, de jeito nenhum: produtos qu�micos, rem�dios, poeira, pap�is higi�nicos, guardanapos sujos, gorduras, �leos, graxa, leite e derivados, ossos, restos de carne, etc.\r\n"
						+ "");
			}
			else if(x==6) {
				System.out.println("= VERDE =\r\n"
						+ "Ol�,"+nome+", se voc� escolheu a op��o VIDRO, � na minha lixeira que voc� deve dispens�-los: A Verde!\r\n"
						+ "Tudo o que for garrafas, potes de conserva, embalagens, frascos vazios de rem�dios, copos, cacos dos res�duos citados, eu aceito por aqui.\r\n"
						+ "Mas se liga nisso, aqui n�o podem ser descartados os seguintes itens: espelhos, �culos, boxes temperados, pirex, cer�micas, porcelanas, tubos de TV, tampas de forno, etc.\r\n"
						+ "");
			}
			else if(x==7) {
				System.out.println("= LARANJA =\r\n"
						+ "Ol�,"+nome+", se voc� escolheu a op��o RES�DUOS PERIGOSOS, � na minha lixeira que voc� deve dispens�-los: A LARANJA!\r\n"
						+ "Aqui v�o os seguintes itens: pilhas e baterias, pneus, �leos lubrificantes, produtos eletr�nicos, l�mpadas fluorescentes, de vapor, de s�dio / merc�rio ou de luz mista, tintas, produtos qu�micos, etc.\r\n"
						+ "Lembrete: Todos os res�duos perigosos necessitam de tratamento e destina��o final especiais.\r\n"
						+ "Se liga, os outros tipos de res�duos n�o podem ser dispensados aqui.\r\n"
						+ "");
			}
			else if(x==8) {
				System.out.println("= CINZA =\r\n"
						+ "Ol�,"+nome+", se voc� escolheu a op��o N�O RECICL�VEIS, � na minha lixeira que voc� deve dispens�-los: A CINZA!\r\n"
						+ "Aqui s�o colocados os produtos que n�o podem ser reciclados... e s�o eles: pap�is higi�nicos, guardanapos sujos, pap�is metalizados ou parafinados, adesivos, papel carbono, fraldas, absorventes, fotografias, espelhos, esponjas de a�o, itens de cer�mica, isopor, EVA, vidro temperado, vidros de carro, corti�a, ampolas de rem�dio, lentes de �culos, etc.\r\n"
						+ "O que n�o descartar: res�duos que podem ser reciclados conforme orienta��o de descarte desse app\r\n"
						+ "");
			}
			
			System.out.println("\nObrigado "+nome+", por aprender conosco sobre um Mundo Melhor!\n");
		
		}
		} while(x!=0);
		
		System.out.println("\nObrigado "+nome+", por aprender conosco sobre um Mundo Melhor!\n");
		
	}
}
