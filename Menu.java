import java.util.Scanner;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;
import java.util.Collections;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		ArrayList alternativasmula = new ArrayList();

		int inicio, nome;
		String nomeP, simnao, personagem, floresta, regiao, caminho, respostamula;
		boolean menu = true, menu2 = true, menu3 = true, menu4 = true, menu5 = true, menu6 = true;
		String respostalobisomem; //essa vari�vel string vai receber o valor que o usu�rio digitar ao tentar resolver o desafio do lobo na floresta.
		boolean lobisomem = true; //boolean utilizada para sair do loop while na fase do lobisomem.
		boolean curupira = false; //boolean utilizada para sair do loop while no desafio para se aliar ao curupira.
		boolean escolhaajuda = true; //boolean utilizada para sair do loop while quando o usuario tem a op�ao de se aliar ao curupira ou n�o.
		String respostacurupira; //essa vari�vel string vai receber o valor que o usu�rio digitar ao tentar resolver o desafio do curupira para se aliar a ele.
		ArrayList questaocurupira = new ArrayList<String>(); //array list utilizada para "embaralhar" as perguntas do desafio do curupira.
		ArrayList questaolobisomem = new ArrayList<String>(); //array list utilizada para "embaralhar" as perguntas do desafio do lobisomem.
		int escolha; //int criado para receber o valor do usu�rio referente a resposta dele ao querer se aliar com o curupira.
		boolean ervamate = false; // boolean para sair do looping do desafio da erva-mate
		ArrayList alternativaservamate = new ArrayList();
		String respostaervamate;
		boolean cuca = false;
		ArrayList alternativascuca = new ArrayList();
		String respostacuca;
		

		System.out.println("   				   * A Floresta Criptografada * \n   ");
		System.out.println(
				" 	    A Floresta Criptografada � um mundo cultural brasileiro de RPG, gratuito e em tempo real. ");
		System.out.println(
				"   Mundo baseado na cultura popular brasileira, expressando a identidade social da comunidade atrav�s de cria��es.");
		System.out.println(
				"          Jogo criado por: Caue Angelo, Gabriel Angeli, Gabriel Borges, Leonardo Lorena e Rafael Gomes.\n");

		do {
			System.out.println("  Escolha uma das op��es abaixo: ");
			System.out.println("       1 � Jogar ");
			System.out.println("       2 � Intru��es ");
			System.out.println("       3 � Cr�ditos ");
			System.out.println("       4 - Sair");
			System.out.println("  Digite a op��o escolhida: ");
			inicio = entrada.nextInt();

			switch (inicio) {
			case 1:

				System.out.println("  Iniciando o jogo...\n");

				break;
			case 2:
				System.out.println(
						"  Crie seu personagem e fa�a suas pr�prias caracter�sticas de acordo com seu modo de jogo.\n"
								+ "  Suas escolhas interferem diretamente no seu destino, pense bem antes de fazer sua escolha.\n "
								+ " Selecione apenas os valores v�lidos.\n");

				break;
			case 3:
				System.out.println(
						"  Jogo criado por: Caue Angelo, Gabriel Angeli, Gabriel Borges, Leonardo Lorena e Rafael Gomes.\n"
								+ "  Projeto Integrador: Desenvolvimento de L�gica.\n"
								+ "  Centro Universit�rio Senac - Grupo 6.\n ");
				break;
			case 4:
				System.out.println("  Saindo do jogo...");
				System.exit(0);
				break;

			default:
				System.out.println("  Valor Inv�lido, digite novamente.\n");

			}
		} while (inicio > 1);

		System.out.print("  Digite o nome do seu personagem: \n");
		nomeP = entrada.next();

		System.out.println("  Deseja que seu nome seja " + nomeP + "?");
		System.out.println("  Digite SIM ou NAO ");
		simnao = entrada.next();

		while (menu = true) {
			if (simnao.equalsIgnoreCase("SIM")) {
				System.out.println("  Que belo nome " + nomeP + "!!!\n");
				menu = false;
				break;
			} else if (simnao.equalsIgnoreCase("NAO")) {
				System.out.println("  Que pena que n�o deseja ser " + nomeP + ", � um excelente nome.");
				System.out.println("  Digite o nome do seu personagem novamente:\n ");
				nomeP = entrada.next();
				System.out.println("  Agora sim " + nomeP + ", esse nome � realmente melhor.");
				System.out.println("  Deseja que seu nome seja " + nomeP + "?\n");
				System.out.println("  Digite SIM ou NAO ");
				simnao = entrada.next();

			} else {
				System.out.println("  Valor Inv�lido, digite novamente.");
				System.out.println("  Deseja que seu nome seja " + nomeP + "?\n");
				System.out.println("  Digite SIM ou NAO ");
				simnao = entrada.next();

			}
		}

		System.out.println("  Seu personagem ser� Homem ou Mulher? ");
		System.out.println("  Digite HOMEM ou MULHER\n");
		personagem = entrada.next();

		while (menu2 = true) {

			if (personagem.equalsIgnoreCase("Homem")) {
				menu2 = false;
				break;

			} else if (personagem.equalsIgnoreCase("Mulher")) {
				menu2 = false;
				break;

			} else {
				System.out.println("  Comando inv�lido.\n ");
				System.out.println("  Seu personagem ser� Homem ou Mulher? ");
				System.out.println("  Digite HOMEM ou MULHER\n");
				personagem = entrada.next();

			}

		}

		System.out.println("  Escolha uma das regi�es abaixo:\n");
		System.out.println("  *Norte\n" + "  *Nordeste\n" + "   \n  Digite o nome da regi�o para ler mais a respeito.");
		regiao = entrada.next();
		while (menu3 = true) {
			if (regiao.equalsIgnoreCase("Nordeste")) {
				System.out.println(" " + "     A Regi�o Nordeste do Brasil apresenta diversas configura��es quanto\r\n"
						+ "  aos aspectos naturais dos principais elementos da natureza tais como\r\n"
						+ "  relevo, vegeta��o, clima, hidrografia, devido a essas varia��es essa regi�o foi regionalizada\r\n"
						+ "  ou dividida em sub-regi�es, s�o elas zona da mata, meio-norte, agreste e sert�o.\r\n"
						+ "  Clima tropical que possui caracter�sticas de temperaturas elevadas e altos �ndices pluviom�tricos.\r\n"
						+ "  \n " + "  Voc� deseja que essa seja sua regi�o natal??\n   "
						+ "Digite SIM para escolher esta regi�o ou N�O para consultar outras: ");

				simnao = entrada.next();
				if ((simnao.equalsIgnoreCase("SIM"))) {
					menu3 = false;
					break;
				} else if ((simnao.equalsIgnoreCase("NAO"))) {
					System.out.println("  Escolha uma das regi�es abaixo:\n");
					System.out.println("  *Norte\n" + "  *Nordeste\n"
							+ "   \n  Digite o nome da regi�o para ler mais a respeito.");
					regiao = entrada.next();

				}

				else {
					System.out.println("  Digite um valor v�lido.\n");

				}
			} else if (regiao.equalsIgnoreCase("Norte")) {
				System.out.println(" "
						+ "     A regi�o Norte � bastante conhecida por dois aspectos principais: � a maior regi�o do Brasil\r\n"
						+ "  em termos de extens�o territorial e � a que concentra a maior biodiversidade\r\n"
						+ "  gra�as � exist�ncia da Floresta Amaz�nica. Mais da metade dessa floresta est� localizada no territ�rio brasileiro.\r\n"
						+ "  Devido � presen�a da floresta, � na regi�o Norte que percebemos a grande influ�ncia que a\r\n"
						+ "  paisagem natural possui sobre as ocupa��es humanas no espa�o geogr�fico. \r\n" + "  \n "
						+ "  Voc� deseja que essa seja sua regi�o natal??\n   "
						+ "Digite SIM para escolher esta regi�o ou N�O para consultar outras: ");

				simnao = entrada.next();
				if ((simnao.equalsIgnoreCase("SIM"))) {
					menu3 = false;
					break;
				} else if ((simnao.equalsIgnoreCase("NAO"))) {

					System.out.println("  Escolha uma das regi�es abaixo:\n");
					System.out.println("  *Norte\n" + "  *Nordeste\n"
							+ "   \n  Digite o nome da regi�o para ler mais a respeito.");
					regiao = entrada.next();

				}

			}

			else {
				System.out.println("  Digite um valor v�lido.\n");
				System.out.println("  Escolha uma das regi�es abaixo:\n");
				System.out.println(
						"  *Norte\n" + "  *Nordeste\n" + "   \n  Digite o nome da regi�o para ler mais a respeito.");
				regiao = entrada.next();
			}

		}
		System.out.println("    Seja bem vindo " + nomeP + " � nossa Floresta, voc� est� no centro do " + regiao + "."
				+ " O centro do " + regiao + " � um lugar extremante encantador.\n" + "    \n    Habilidades: \n"
				+ "    For�a = 0 || Intelig�ncia = 0 || Coragem = 0 || Sabedoria = 0 || Flexibilidade = 0\n");
		System.out.println("\n" + nomeP + "-  Essa floresta me encanta mais cada dia que passa!  ");
		System.out.println(nomeP + "-  Hoje o c�u est� t�o lindo... O que voc� acha filha?  ");
		System.out.println("Iara-  �... o dia ta lindo e o clima ensolarado.");
		System.out.println(nomeP + "-  Voc� t� bem? To te achando meio pra baixo esses dias  ");
		System.out.println(
				"Iara-  Pai, eu n�o me sinto bem nessa floresta. De dia, ela � um lugar maravilhoso, mas a noite,"
						+ " n�o sei o que acontece, vira um lugar cabreiro.");
		System.out.println(nomeP + "-  Isso � coisa da sua cabe�a, s� existe n�s dois nessa floresta  ");
		System.out.println(
				nomeP + "-  E o mais importante de tudo, enquanto eu estiver aqui, nada de mal acontecer� com voc�  ");
		System.out.println("Iara-  S� n�s?? N�o � isso que eu vejo  ");
		System.out.println("Iara-  Quando voc� vai dormir, eu ou�o vozes e vejo coisas nesta floresta ");
		System.out.println("Iara-  Eu acho, n�o, eu n�o acho, eu tenho certeza que tem algo nessa floresta ");
		System.out.println("Iara-  S� voc� n�o ve... ");
		System.out.println(nomeP + "-  Isso � sua imagina��o  ");
		System.out.println(nomeP + "-  Posso provar que voc� est� errada, a noite vamos explorar esse mato  ");
		System.out.println("\n  A noite fica fria nesta madrugada, como se algo estivesse por vir...");
		System.out.println("  Mas como promessa � compromisso, " + nomeP + " e sua filha sa�ram na madrugada.\n");
		System.out.println(nomeP + "- Juntou tudo o que precisa? Pegarei a vela e poderemos partir ");
		System.out.println("Iara-  Sim, estou pronta.  ");
		System.out.println("Iara-  Tem certeza pai? Quer realmente fazer isso?  ");
		System.out.println(nomeP + "- Sim filha, as vezes precisamos mostrar o que � real e o que n�o �.\n ");
		System.out.println(" ''Por vezes as pessoas n�o querem ouvir a verdade ");
		System.out.println("   porque n�o desejam que as suas ilus�es sejam destru�das.'' ");
		System.out.println("                                      -Friedrich Nietzsche.\n");
		System.out.println("  Voc� e sua filha finalmente chega ao centro da floresta.");
		System.out.println("  Est� tudo muito calmo, at� demais...\n");
		System.out.println(nomeP + "- Pronto, at� que enfim chegamos ");
		System.out.println(nomeP + "- Vamos arrumar nossas coisas para passar a noite aqui ");
		System.out.println("Iara-  Esse lugar me da arrepios, acho que foi uma p�ssima ideia dormir aqui  ");
		System.out.println(
				nomeP + "- Relaxa filha, aqui vai ser bom pra voc�, faz bem descontrair um pouco com a natureza\n ");
		System.out.println("  Com toda calmaria da floresta, voc� e sua filha acaba adormecendo r�pido");
		System.out.println("  Que noite calma! � t�o bom dormir sem barulho nenhu... CRACCC CRACCC!!\n");
		System.out.println(nomeP + "- Filha, que barulho � esse? ");
		System.out.println(nomeP + "- Iara? Pode parar com essa brincadeira de mal gosto ");
		System.out.println(nomeP + "- Iara? Iaraaa???????????? ");
		System.out.println(nomeP + "- Pela mor de deus, algu�m me ajuda!!\n ");
		System.out.println("  Parece que sua filha estava certa...");
		System.out.println("  O seu desespero come�ou a bater, at� que uma luz no meio da floresta surge ");
		System.out.println("  Vindo lentamente em seu cavalo, o negrinho do pastoreio aparece para te ajudar\n");
		System.out.println(nomeP + "- Quem � voc�? ");
		System.out.println("Negrinho do Pastoreio- Parece que voc� est� procurando algo, vim aqui para te ajudar.");
		System.out.println(nomeP + "- Como posso confiar ? Voc� n�o me diz seu nome ");
		System.out.println(
				"Negrinho do Pastoreio- Sua filha foi envenenada e levada pela Cuca, eu vi tudo enquanto voc� estava dormindo");
		System.out.println(nomeP + "- E voc� n�o fez nada?? que tipo de pessoa vc � ?! ");
		System.out.println(
				"Negrinho do Pastoreio- Voc� precisa encontrar a Erva Ca�-Yar�i, ela ir� salvar a sua filha. ");
		System.out.println(
				"Negrinho do Pastoreio- Siga � frente na floresta, e voc� encontrar� uma pessoa que te guiar� at� sua filha.\n ");

		while (menu = true) {

			System.out.println("  Voc� possui tr�s caminhos em sua frente:");
			System.out.println("  Escolha com cuidado e sabedora\n");
			System.out.println("  CAMINHOS: ESQUERDA/MEIO/DIREITA");
			caminho = entrada.next();

			if (caminho.equalsIgnoreCase("esquerda")) {
				menu = false;
				break;
			}

			else if (caminho.equalsIgnoreCase("meio")) {
				menu = false;
				break;
			} else if (caminho.equalsIgnoreCase("direita")) {
				menu = false;
				break;
			} else {
				System.out.println("  Digite um comando v�lido.\n");

			}

		}
		
		System.out.println("\nSaci- Ora ora, o que temos por aqui!");
		System.out.println("Saci- � muito dificil encontrar alguem nesse bosque");
		System.out.println("Saci- Por que andas por aqui?");
		System.out.println(nomeP + "- Estou a procura da Cuca, ela envenenou e levou minha filha");
		System.out.println("Saci- Essa Cuca viu, sempre causando problemas");
		System.out.println(nomeP + "- Voc� conhece ela? ");
		System.out.println("Saci- Sim, por�m voc� precisa passar pelo caminho da mula sem cabe�a");
		System.out.println("Saci- Se voc� quiser, eu posso te ajudar\n");
		while (menu = true) {
			System.out.println("  Voc� aceita a ajuda do Saci?");
			System.out.println("  Digite SIM ou NAO");
			simnao = entrada.next();

			if (simnao.equalsIgnoreCase("sim")) {
				System.out.println("Saci- �tima escolha, voc� n�o conseguiria passar sozinho...\n");
				System.out.println("  Escolher aliados � uma �tima forma de estrat�gia!");
				System.out.println(
						"   For�a = 0 || Intelig�ncia = +20 || Coragem = 0 || Sabedoria = +10 || Flexibilidade = 0");
				int aliados = 1;
				int inteligencia = 20;
				int sabedoria = 10;
				System.out.println("Saci- Antes que a gente chegue na mula sem cabe�a, preciso te avisar...");
				System.out.println(
						"Saci- ...A mula � s� o primeiro de muitos que voc� ir� enfrentar na sua trajet�ria\n");
				System.out.println("    Voc� est� seguindo o Saci pela floresta e encontra a Mula sem cabe�a\n ");
				System.out.println("\nMula - Saci? Voc� aqui novamente? e pelo visto trouxe algu�m");
				System.out.println("Saci- Mula, preciso da sua ajuda para encontrar a crian�a perdida");
				System.out.println("Saci- Poderia me dizer qual caminho � o correto?");
				System.out.println("Mula - As coisas n�o s�o f�ceis assim, eu necessito de uma ajuda");
				System.out.println("Mula - Encontrei um pergaminho encriptado contendo informa��es que eu preciso");
				System.out.println("Mula - Decifre o c�digo e eu deixarei voc�s prosseguirem.\n");

				alternativasmula.add("6");
				alternativasmula.add("5");
				alternativasmula.add("7");
				alternativasmula.add("3");
				alternativasmula.add("2");

				do {
					Collections.shuffle(alternativasmula);
					System.out.println("   RESOLVA A EQUA��O A SEGUIR");
					System.out.println("   DETERMINE O VALOR DE X");
					System.out.println("   *  18x - 43 = 65  * \n");
					System.out.println("A- " + alternativasmula.get(0));
					System.out.println("B- " + alternativasmula.get(1));
					System.out.println("C- " + alternativasmula.get(2));
					System.out.println("D- " + alternativasmula.get(3));
					System.out.println("E- " + alternativasmula.get(4));
					System.out.println("  \n*POR VOC� TER ACEITADO A AJUDA DO SACI, ELE TE AJUDAR� COM O DESAFIO*");
					System.out.println("  * SACI DICA  -  X>5*\n");
					respostamula = entrada.next();
					switch (respostamula.toLowerCase()) {
					case "a":
						if (alternativasmula.get(0).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "b":
						if (alternativasmula.get(1).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "c":
						if (alternativasmula.get(2).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "d":
						if (alternativasmula.get(3).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "e":
						if (alternativasmula.get(4).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +30 || Coragem = +10 || Sabedoria = 10 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					default:
						System.out.println("  Digite um valor v�lido.\n");
						menu = true;
					}

				} while (menu == true);

				menu = false;
				break;
			} else if (simnao.equalsIgnoreCase("nao")) {
				System.out.println("Saci- Bom, te desejo boa sorte!");
				System.out.println("Saci- Mas j� te aviso, n�o ser� nada f�cil...");
				int aliados = 0;
				int inteligencia = 0;
				int sabedoria = 0;

				System.out.println("\n   N�o aceitar ajuda � uma p�ssima forma de estrat�gia!");
				System.out.println(
						"   For�a = 0 || Intelig�ncia = 0 || Coragem = 0 || Sabedoria = 0 || Flexibilidade = 0\n");

				System.out.println("Saci- Antes que a gente chegue na mula sem cabe�a, preciso te avisar...");
				System.out.println(
						"Saci- ...A mula � s� o primeiro de muitos que voc� ir� enfrentar na sua trajet�ria\n");
				System.out.println("    Voc� est� seguindo pela floresta e encontra a Mula sem cabe�a\n ");
				System.out.println("\nMula - Quem � voc� ? Como ousa vir aqui sozinho?");
				System.out.println(nomeP + "- Mula, preciso da sua ajuda para encontrar minha filha");
				System.out.println(nomeP + "- Poderia me dizer qual caminho � o correto?");
				System.out.println("Mula - As coisas n�o s�o f�ceis assim, eu necessito de uma ajuda");
				System.out.println("Mula - Encontrei um pergaminho encriptado contendo informa��es que eu preciso");
				System.out.println("Mula - Decifre o c�digo e eu deixarei voc� prosseguir.\n");

				alternativasmula.add("6");
				alternativasmula.add("5");
				alternativasmula.add("7");
				alternativasmula.add("3");
				alternativasmula.add("2");

				do {
					Collections.shuffle(alternativasmula);
					System.out.println("   RESOLVA A EQUA��O A SEGUIR");
					System.out.println("   DETERMINE O VALOR DE X");
					System.out.println("   *  18x - 43 = 65  * \n");
					System.out.println("A- " + alternativasmula.get(0));
					System.out.println("B- " + alternativasmula.get(1));
					System.out.println("C- " + alternativasmula.get(2));
					System.out.println("D- " + alternativasmula.get(3));
					System.out.println("E- " + alternativasmula.get(4));

					respostamula = entrada.next();
					switch (respostamula.toLowerCase()) {
					case "a":
						if (alternativasmula.get(0).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "b":
						if (alternativasmula.get(1).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "c":
						if (alternativasmula.get(2).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "d":
						if (alternativasmula.get(3).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					case "e":
						if (alternativasmula.get(4).equals("6")) {
							System.out.println("Mula- At� que voc� � inteligente...");
							System.out.println("Mula- N�o conseguia de jeito nenhum!\n");
							System.out.println(
									"   Voc� recebeu +10 de Coragem e +10 de inteligencia por enfrentar e ajudar a Mula");
							System.out.println(
									"   For�a = 0 || Intelig�ncia = +10 || Coragem = +10 || Sabedoria = 0 || Flexibilidade = 0");
							menu = false;

						} else {
							System.out.println("Mula- Acho que o nome Mula tem que ser pra outro tamb�m...\n");

						}
						break;

					default:
						System.out.println("  Digite um valor v�lido.\n");
						menu = true;
					}

				} while (menu == true);

				break;
			} else {
				System.out.println("  Digite um comando v�lido.\n");
			}
		}		
		
		System.out.println("\n         Seguindo adiante, " + nomeP + " sabe que seu pr�ximo desafio se encontra na Floresta. Em seu caminho ele encontra mais uma criatura peculiar (fala as caracteristicas do curupira). Ao se aproximar ele diz: \n");
		System.out.println(nomeP + "- Eae ? Qual o seu nome ? Pode me ajudar ? Voc� sabe o caminho mais curto da floresta para chegar at� a cuca ? Minha filha foi sequestrada, preciso chegar o mais r�pido poss�vel!");
		System.out.println("Criatura misteriosa- Meu nome � curupira, sou o guardi�o das nossas florestas. Eu sei sim um caminho mais curto, por�m voc� precisar� passar pelo Lobisomem. Caso contr�rio demorar� 4 dias para atravessar a floresta.");
		System.out.println("Curupira- O lobisomem � uma dos monstros mais perigosos da regi�o, pense bem na sua escolha.");
		System.out.println(nomeP+"- Estou vendo que voc� possui algumas armas, pode me empresta-las ?");
		System.out.println("Curupira- J� que mencionou, eu posso te ajudar a derrota-lo, j� fiz isso uma vez. Mas antes preciso de um favor em troca. O que acha ?\n");
		//dialogo entre curupira e personagem principal
		do {
			System.out.println("          Voc� aceita a ajuda de Curupira ? Lembre-se que voc� n�o o conhece...\n");
			System.out.println("1 - Aceitar ajuda.");
			System.out.println("2 - N�o aceitar ajuda. \n");
			escolha = entrada.nextInt();
			//momento em que o usuario pode opter entre se aliar com curupira ou n�o
			switch (escolha) {

			case 1:
				System.out.println("Curupira- �tima escolha. A alguns dias atr�s eu encontrei um ca�ador tentando abater um veado. "
								+ "Depois de derrota-lo e amarrar ele, eu roubei seus pertences e peguei esse celular, s� que ele parece usar uma tecnologia mais avan�ada para mim."
								+ "Pode desbloquear ele para mim conseguir resetar e vender ? Se fizer isso eu te ajudo com o problema da floresta...\n");
				
				questaocurupira.add("1110(decimal)"); //resposta correta curupira
				questaocurupira.add("1000(decimal)");//adicionando as questoes atraves de array list.
				questaocurupira.add("15000(decimal)");
				questaocurupira.add("1200(decimal)");
				questaocurupira.add("1310(decimal)");
				
				do { //inicio de um loop do while para o desafio do curupira.
					Collections.shuffle(questaocurupira);//collections usado para perguntas sempre serem embaralhadas ao executar o codigo.
					Collections.shuffle(questaocurupira);
					
					System.out.println("Resolva o seguinte problema: 1000010001(binario) + 226(octal) + 14B(hexa) + 100(decimal) = x(decimal)");
					System.out.println("A - " + questaocurupira.get(0));//usando as questoes que foram adicionadas e dando valor a elas.
					System.out.println("B - " + questaocurupira.get(1));
					System.out.println("C - " + questaocurupira.get(2));
					System.out.println("D - " + questaocurupira.get(3));
					System.out.println("E - " + questaocurupira.get(4) + "\n");
					System.out.println("Qual o valor de X em decimal ?");
					respostacurupira = entrada.next();
					
					switch (respostacurupira.toLowerCase()) { //switch para respostas do desafio do curupira.
					
					case "a": 
						if (questaocurupira.get(0).equals("1110(decimal)")) { //caso o usuario acerte a questao e ela seja a letra a.
							
							System.out.println("Curupira- Nossa, n�o acredito que voc� conseguiu, vou te ajudar na floresta... \n");
							System.out.println("       Voc� est� seguindo sua jornada para floresta...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto, voc� olha para o Curupira e percebe que sua fei��o n�o muda, parece at� que eles est� acostumado com aquilo. \n");
							System.out.println(nomeP+"- Voc� disse que ja tinha derrotado o Lobisomem, como foi isso ?");
							System.out.println("Curupira- H� alguns anos tivemos um problema em comum, depois batalhar com ele sei que ele ficou muito fraco. Hoje em dia s� ou�o boatos que ele voltou para floresta e est� mais forte do que antes."
											+ "Mas desde ent�o decidimos n�o entrarmos no caminho um do outro, por isso nunca mais nos encontramos...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala: \n");
							System.out.println("Lobisomem- Quanto tempo em Curupira, pensei que voc� ja tivesse desistido desse lugar...");
							System.out.println("Curupira- Eu que pensei que voc� n�o iria mais voltar depois de eu te expulsar, mas pelo visto da pra perceber que voc� n�o mudou mesmo.");
							System.out.println("Curupira- Mas enfim, n�o quero problemas com voc�, a gente sabe como isso termina... Queria pedir para voc� deixar esse rapaz passar, a filha dele foi sequestrada pela cuca e ele precisa encontrar a Eva mate o quanto antes"
											+ "para derrotar a cuca e recuperar sua filha.");
							System.out.println("Lobisomem- HAHAHAHAHA! A Cuca j� havia me avisado que ele viria por aqui... E ela me pagou muito mais para leva-lo para ela tamb�m, ent�o pe�o que n�o entre no meu caminho novamente, P� torto!!");
							System.out.println("Curupira- �... voc� n�o aprendeu nada mesmo.");
							System.out.println(nomeP+"- Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem- Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("Curupira- Vou fazer voc� se arrepender de sua escolha seu lobo mimado. \n");
							System.out.println("      A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."
											+ "Lembre-se que voc� aceitou ajudar o curupira, ent�o voc� possui uma dica para resolver o problema.");
							System.out.println("      PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");
							//dialogo entre curupira, lobisomem e personagem principal caso o personagem acerte o desafio do curupira e se alie a ele.
							
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");//adicionando as questoes atraves de array list.
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do { //inicio do loop do while para o desafio do lobisomem caso o usario tenha conseguido se aliar ao curupira.
								Collections.shuffle(questaolobisomem);//embaralhando as alternativas do desafio do lobisomem.
								Collections.shuffle(questaolobisomem);
								
								System.out.println("DESAFIO: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");
								System.out.println("   DICA 1 DO CURUPIRA!!!!! Lembre-se que uma equa��o de 2�grau pode possuir um x negativo e uma x positivo, o desafio pede apenas a soma dos resultados positivos.");
								System.out.println("   DICA 2 DO CURUPIRA!!! Lembre-se do que � MMC (m�nimo m�ltiplo comum) que � o menor n�mero, tamb�m inteiro, que � m�ltiplo de todos esses n�meros ao mesmo tempo. "
												+ "Por exemplo, o MMC entre 2 e 12 � 12, pois os m�ltiplos de 2 s�o 2, 4, 6, 8, 10, 12� e os de 12 s�o: 12, 24, �"
												+ "Isso pode ser �til para resolver essa quest�o...\n");	//desafio do lobisomem com a dica do curupira caso o personagem principal tenha se aliado.		
								System.out.println("A - " + questaolobisomem.get(0));//collections usado para perguntas sempre serem embaralhadas ao executar o codigo.
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { //switch para repostas do desafio do lobisomem
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja a letra a.
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso n�o seja.
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b": //caso sej a aletra b
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) {
										System.out.println("     Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("     Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c": //caso seja a letra c
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) {
										System.out.println("     Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("     Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0); //fun��o utilizada caso o usuario erre a resposta ele ter� que iniciar o codigo denovo pois deu gamer over.
									}
									break;
								case "d": //caso seja a letra d
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) {
										System.out.println("     Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("     Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e": //caso seja a letra e
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) {
										System.out.println("     Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("     Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default: //se o usuario digitar alguma op�ao sem ser a, b, c, d ou e
									System.out.println("         Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true);
												
							curupira = true;				
						} else { //caso nao seja a letra a
							
							System.out.println("\n   Curupira- Pensei que voc� fosse mais inteligente. Vou pedir a ajuda de outra pessoa, pode seguir seu caminho sozinho. \n");
							System.out.println("       Voc� est� seguindo sua jornada para floresta sozinho...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto. \n");
							System.out.println(nomeP+"- Isso n�o me cheira nada bem...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala: \n");
							System.out.println("Lobisomem- Eu estava esperando por voc�! HAHAHAHA...");
							System.out.println(nomeP+"- Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que est� com a Cuca.");
							System.out.println("Lobisomem- HAHAHAHAHA! A Cuca j� havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho voc� a ir do jeito mais fac�l para n�o se machucar...");
							System.out.println(nomeP+"- Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem- Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela! \n");
							System.out.println("       O que o Lobisomem n�o sabe � que " +nomeP+" tem habilidades especiais. \n");
							System.out.println(nomeP+"- Eu n�o quero confus�o, mas farei de tudo para chegar at� minha menina... Nem voc� vai me parar!\n");
							System.out.println("       A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."); 
							System.out.println("       PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo do personagem principal com o lobisomem mas sem o curupira pois ele nao conseguiu se aliar
											
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhar alternativas
								Collections.shuffle(questaolobisomem);
								
								System.out.println("DESAFIO: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");	//desafio sem a dica do curupira		
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { 
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja a letra a
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso seja a letra b
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso seja a letra c
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja a letra d
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja a letra e
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default: //se o usuario digitar alguma alternativa que nao tenha sido apresentada
									System.out.println("           Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true);
												
							curupira = true;		
						} break;
						
					case "b": 
						if (questaocurupira.get(1).equals("1110(decimal)")) { //caso seja a letra b ele vai se aliar ao curupira
							
							System.out.println("Curupira- Nossa, n�o acredito que voc� conseguiu, vou te ajudar na floresta... \n ");
							System.out.println("       Voc� est� seguindo sua jornada para floresta...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto, voc� olha para o Curupira e percebe que sua fei��o n�o muda, parece at� que eles est� acostumado com aquilo. \n");
							System.out.println(nomeP+"- Voc� disse que ja tinha derrotado o Lobisomem, como foi isso ?");
							System.out.println("Curupira- H� alguns anos tivemos um problema em comum, depois batalhar com ele sei que ele ficou muito fraco. Hoje em dia s� ou�o boatos que ele voltou para floresta e est� mais forte do que antes."
											+ "Mas desde ent�o decidimos n�o entrarmos no caminho um do outro, por isso nunca mais nos encontramos...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala: \n");
							System.out.println("Lobisomem- Quanto tempo em Curupira, pensei que voc� ja tivesse desistido desse lugar...");
							System.out.println("Curupira- Eu que pensei que voc� n�o iria mais voltar depois de eu te expulsar, mas pelo visto da pra perceber que voc� n�o mudou mesmo.");
							System.out.println("Curupira- Mas enfim, n�o quero problemas com voc�, a gente sabe como isso termina... Queria pedir para voc� deixar esse rapaz passar, a filha dele foi sequestrada pela cuca e ele precisa encontrar a Eva mate o quanto antes"
											+ "para derrotar a cuca e recuperar sua filha.");
							System.out.println("Lobisomem- HAHAHAHAHA! A Cuca j� havia me avisado que ele viria por aqui... E ela me pagou muito mais para leva-lo para ela tamb�m, ent�o pe�o que n�o entre no meu caminho novamente, P� torto!");
							System.out.println("Curupira- �... voc� n�o aprendeu nada mesmo.");
							System.out.println(nomeP+"- Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem- Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("Curupira- Vou fazer voc� se arrepender de sua escolha seu lobo mimado. \n");
							System.out.println("      A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."
											+ "Lembre-se que voc� aceitou ajudar o curupira, ent�o voc� possui uma dica para resolver o problema.");
							System.out.println("      PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo entra os tres personagens depois que o usuario conseguiu se aliar ao lobisomem
							
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhando questoes
								Collections.shuffle(questaolobisomem);
								
								System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");
								System.out.println("      DICA 1 DO CURUPIRA!!!!! Lembre-se que uma equa��o de 2�grau pode possuir um x negativo e uma x positivo, o desafio pede apenas a soma dos resultados positivos.");
								System.out.println("      DICA 2 DO CURUPIRA!!! Lembre-se do que � MMC (m�nimo m�ltiplo comum) que � o menor n�mero, tamb�m inteiro, que � m�ltiplo de todos esses n�meros ao mesmo tempo. "
												+ "Por exemplo, o MMC entre 2 e 12 � 12, pois os m�ltiplos de 2 s�o 2, 4, 6, 8, 10, 12� e os de 12 s�o: 12, 24, �"
												+ "Isso pode ser �til para resolver essa quest�o...\n");//desafio com dica do curupira			
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { //switch do desafio do lobisomem
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja a letra a
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso seja a letra b
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso seja a letra c
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja a letra d
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e":
									if (questaolobisomem.get(4).equals("Resultado da soma: 24")) { //caso seja a letra e
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default: //se o usuario digitar aluma alternativa inexistente
									System.out.println("          Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true);
												
							curupira = true;				
						} else { //caso nao seja a letra b
							
							System.out.println("\n Curupira: Pensei que voc� fosse mais inteligente. Vou pedir a ajuda de outra pessoa, pode seguir seu caminho sozinho.");
							System.out.println("       Voc� est� seguindo sua jornada para floresta sozinho...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto.");
							System.out.println(nomeP+": Isso n�o me cheira nada bem...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala:");
							System.out.println("Lobisomem: Eu estava esperando por voc�! HAHAHAHA...");
							System.out.println(nomeP+": Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que est� com a Cuca.");
							System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho voc� a ir do jeito mais fac�l para n�o se machucar...");
							System.out.println(nomeP+": Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("       O que o Lobisomem n�o sabe � que Fulano tem habilidades especiais.");
							System.out.println(nomeP+": Eu n�o quero confus�o, mas farei de tudo para chegar at� minha menina... Nem voc� vai me parar!\n");
							System.out.println("       A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."); 
							System.out.println("       PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo sem o curupira
											
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhando questoes
								Collections.shuffle(questaolobisomem);
								
								System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");	//desafio sem dica do curupira		
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { //switch do desafio do lobisomem
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja letra a
										System.out.println("        Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("        Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso seja letra b
										System.out.println("        Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("        Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso seja letra c
										System.out.println("        Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("        Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja letra d
										System.out.println("        Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("        Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja letra e
										System.out.println("        Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("        Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default: //se o usario digitar alguma alternativa que nao existe
									System.out.println("            Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true); //saira do loop quando a boolean lobisomem for verdadeira
												
							curupira = true;		
						} break;
						
					case "c": 
						if (questaocurupira.get(2).equals("1110(decimal)")) { //caso a alternativa do desafio do curupira seja a letra c
							
							System.out.println("Curupira: Nossa, n�o acredito que voc� conseguiu, vou te ajudar na floresta... ");
							System.out.println("       Voc� est� seguindo sua jornada para floresta...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto, voc� olha para o Curupira e percebe que sua fei��o n�o muda, parece at� que eles est� acostumado com aquilo.");
							System.out.println(nomeP+": Voc� disse que ja tinha derrotado o Lobisomem, como foi isso ?");
							System.out.println("Curupira: H� alguns anos tivemos um problema em comum, depois batalhar com ele sei que ele ficou muito fraco. Hoje em dia s� ou�o boatos que ele voltou para floresta e est� mais forte do que antes."
											+ "Mas desde ent�o decidimos n�o entrarmos no caminho um do outro, por isso nunca mais nos encontramos...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala: ");
							System.out.println("Lobisomem: Quanto tempo em Curupira, pensei que voc� ja tivesse desistido desse lugar...");
							System.out.println("Curupira: Eu que pensei que voc� n�o iria mais voltar depois de eu te expulsar, mas pelo visto da pra perceber que voc� n�o mudou mesmo.");
							System.out.println("Curupira: Mas enfim, n�o quero problemas com voc�, a gente sabe como isso termina... Queria pedir para voc� deixar esse rapaz passar, a filha dele foi sequestrada pela cuca e ele precisa encontrar a Eva mate o quanto antes"
											+ "para derrotar a cuca e recuperar sua filha.");
							System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que ele viria por aqui... E ela me pagou muito mais para leva-lo para ela tamb�m, ent�o pe�o que n�o entre no meu caminho novamente, P� torto!\n");
							System.out.println("Curupira: �... voc� n�o aprendeu nada mesmo.");
							System.out.println(nomeP+": Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("Curupira: Vou fazer voc� se arrepender de sua escolha seu lobo mimado. \n");
							System.out.println("      A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."
											+ "Lembre-se que voc� aceitou ajudar o curupira, ent�o voc� possui uma dica para resolver o problema.");
							System.out.println("      PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo com curupira lobisomem e personagem principal
							
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhar respostas
								Collections.shuffle(questaolobisomem);
								
								System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");
								System.out.println("       DICA 1 DO CURUPIRA!!!!! Lembre-se que uma equa��o de 2�grau pode possuir um x negativo e uma x positivo, o desafio pede apenas a soma dos resultados positivos.");
								System.out.println("       DICA 2 DO CURUPIRA!!! Lembre-se do que � MMC (m�nimo m�ltiplo comum) que � o menor n�mero, tamb�m inteiro, que � m�ltiplo de todos esses n�meros ao mesmo tempo. "
												+ "Por exemplo, o MMC entre 2 e 12 � 12, pois os m�ltiplos de 2 s�o 2, 4, 6, 8, 10, 12� e os de 12 s�o: 12, 24, �"
												+ "Isso pode ser �til para resolver essa quest�o...\n");//desafio com dica do curupira			
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { //switch desafio do lobisomem
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja letra a
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso seja letra b
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso seja letra c
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja letra d
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja letra e
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default://se o usario digitar alguma alternativa que nao existe
									System.out.println("           Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true);//para sair do looping da fase do lobisomem a boolean lobisomem deve ser false
												
							curupira = true;				
						} else { //caso nao seja a letra c na resposta para se aliar ao curupira
							
							System.out.println("\n Curupira: Pensei que voc� fosse mais inteligente. Vou pedir a ajuda de outra pessoa, pode seguir seu caminho sozinho.");
							System.out.println("       Voc� est� seguindo sua jornada para floresta sozinho...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto.");
							System.out.println(nomeP+": Isso n�o me cheira nada bem...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala:");
							System.out.println("Lobisomem: Eu estava esperando por voc�! HAHAHAHA...");
							System.out.println(nomeP+": Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que est� com a Cuca.");
							System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho voc� a ir do jeito mais fac�l para n�o se machucar...");
							System.out.println(nomeP+": Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("       O que o Lobisomem n�o sabe � que Fulano tem habilidades especiais.");
							System.out.println(nomeP+": Eu n�o quero confus�o, mas farei de tudo para chegar at� minha menina... Nem voc� vai me parar!\n");
							System.out.println("       A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."); 
							System.out.println("       PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo sem o curupira
											
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhando respostas
								Collections.shuffle(questaolobisomem);
								
								System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");	//desafio sem a dica do curupira		
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { //switch para desafio do lobisomem
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja a letra a
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso seja a letra b
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso seja a letra c
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja a letra d
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja letra e
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false; //boolean para sair do la�o de repeti��o
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default: //caso o usario tenha digitar alguma alternativa que nao exite
									System.out.println("          Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true);//para sair do looping do lobisomem a boolean deve ser declarada falsa
												
							curupira = true;		
						} break;
						
					case "d": 
						if (questaocurupira.get(3).equals("1110(decimal)")) { //caso a resposta seja a letra d
							
							System.out.println("Curupira: Nossa, n�o acredito que voc� conseguiu, vou te ajudar na floresta... ");
							System.out.println("       Voc� est� seguindo sua jornada para floresta...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto, voc� olha para o Curupira e percebe que sua fei��o n�o muda, parece at� que eles est� acostumado com aquilo.");
							System.out.println(nomeP+": Voc� disse que ja tinha derrotado o Lobisomem, como foi isso ?");
							System.out.println("Curupira: H� alguns anos tivemos um problema em comum, depois batalhar com ele sei que ele ficou muito fraco. Hoje em dia s� ou�o boatos que ele voltou para floresta e est� mais forte do que antes."
											+ "Mas desde ent�o decidimos n�o entrarmos no caminho um do outro, por isso nunca mais nos encontramos...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala: ");
							System.out.println("Lobisomem: Quanto tempo em Curupira, pensei que voc� ja tivesse desistido desse lugar...");
							System.out.println("Curupira: Eu que pensei que voc� n�o iria mais voltar depois de eu te expulsar, mas pelo visto da pra perceber que voc� n�o mudou mesmo.");
							System.out.println("Curupira: Mas enfim, n�o quero problemas com voc�, a gente sabe como isso termina... Queria pedir para voc� deixar esse rapaz passar, a filha dele foi sequestrada pela cuca e ele precisa encontrar a Eva mate o quanto antes"
											+ "para derrotar a cuca e recuperar sua filha.");
							System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que ele viria por aqui... E ela me pagou muito mais para leva-lo para ela tamb�m, ent�o pe�o que n�o entre no meu caminho novamente, P� torto!\n");
							System.out.println("Curupira: �... voc� n�o aprendeu nada mesmo.");
							System.out.println(nomeP+": Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("Curupira: Vou fazer voc� se arrepender de sua escolha seu lobo mimado. \n");
							System.out.println("      A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."
											+ "Lembre-se que voc� aceitou ajudar o curupira, ent�o voc� possui uma dica para resolver o problema.");
							System.out.println("      PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo com o curupira lobisomem e personagem principal ao conseguir se aliar ao curupira
							
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhando respostas
								Collections.shuffle(questaolobisomem);
								
								System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");
								System.out.println("     DICA 1 DO CURUPIRA!!!!! Lembre-se que uma equa��o de 2�grau pode possuir um x negativo e uma x positivo, o desafio pede apenas a soma dos resultados positivos.");
								System.out.println("     DICA 2 DO CURUPIRA!!! Lembre-se do que � MMC (m�nimo m�ltiplo comum) que � o menor n�mero, tamb�m inteiro, que � m�ltiplo de todos esses n�meros ao mesmo tempo. "
												+ "Por exemplo, o MMC entre 2 e 12 � 12, pois os m�ltiplos de 2 s�o 2, 4, 6, 8, 10, 12� e os de 12 s�o: 12, 24, �"
												+ "Isso pode ser �til para resolver essa quest�o...\n");	//desafio com dica do curupira		
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { //switch do desafio do lobisomem
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja a letra a
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso seja letra a
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso seja letra c
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja letra d
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja letra e
										System.out.println("     Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else {  //caso nao seja
										System.out.println("     Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default: //caso o usario digite alguma alternativa que nao existe
									System.out.println("         Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true);//para sair do looping do desaifo do lobisomem a boolean lobisomem deve ser false
												
							curupira = true;				
						} else { //caso nao seja a letra d
							
							System.out.println("\n Curupira: Pensei que voc� fosse mais inteligente. Vou pedir a ajuda de outra pessoa, pode seguir seu caminho sozinho.");
							System.out.println("       Voc� est� seguindo sua jornada para floresta sozinho...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto.");
							System.out.println(nomeP+": Isso n�o me cheira nada bem...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala:");
							System.out.println("Lobisomem: Eu estava esperando por voc�! HAHAHAHA...");
							System.out.println(nomeP+": Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que est� com a Cuca.");
							System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho voc� a ir do jeito mais fac�l para n�o se machucar...");
							System.out.println(nomeP+": Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("       O que o Lobisomem n�o sabe � que Fulano tem habilidades especiais.");
							System.out.println(nomeP+": Eu n�o quero confus�o, mas farei de tudo para chegar at� minha menina... Nem voc� vai me parar!\n");
							System.out.println("       A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."); 
							System.out.println("       PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo sem o curupira porque o usario nao consegiu se aliar a ele
											
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhando respostas
								Collections.shuffle(questaolobisomem);
								
								System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");		//desafio sem a dica do curupira	
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { 
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja a letra a
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso seja a letra b
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso seja a letra c
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja a letra d
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao  seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e": 
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso seja a letra e
										System.out.println("      Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("      Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default: //caso o usario digite alguma alternativa que nao exista
									System.out.println("          Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true);//para sair do looping do desafio do lobisomem a boolean lobisomem deve ser false
												
							curupira = true;		
						} break;
						
					case "e":
						
						if (questaocurupira.get(4).equals("1110(decimal)")) { //caso seja a letra e
							
							System.out.println("Curupira: Nossa, n�o acredito que voc� conseguiu, vou te ajudar na floresta... ");
							System.out.println("       Voc� est� seguindo sua jornada para floresta...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto, voc� olha para o Curupira e percebe que sua fei��o n�o muda, parece at� que eles est� acostumado com aquilo.");
							System.out.println(nomeP+": Voc� disse que ja tinha derrotado o Lobisomem, como foi isso ?");
							System.out.println("Curupira: H� alguns anos tivemos um problema em comum, depois batalhar com ele sei que ele ficou muito fraco. Hoje em dia s� ou�o boatos que ele voltou para floresta e est� mais forte do que antes."
											+ "Mas desde ent�o decidimos n�o entrarmos no caminho um do outro, por isso nunca mais nos encontramos...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala: ");
							System.out.println("Lobisomem: Quanto tempo em Curupira, pensei que voc� ja tivesse desistido desse lugar...");
							System.out.println("Curupira: Eu que pensei que voc� n�o iria mais voltar depois de eu te expulsar, mas pelo visto da pra perceber que voc� n�o mudou mesmo.");
							System.out.println("Curupira: Mas enfim, n�o quero problemas com voc�, a gente sabe como isso termina... Queria pedir para voc� deixar esse rapaz passar, a filha dele foi sequestrada pela cuca e ele precisa encontrar a Eva mate o quanto antes"
											+ "para derrotar a cuca e recuperar sua filha.");
							System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que ele viria por aqui... E ela me pagou muito mais para leva-lo para ela tamb�m, ent�o pe�o que n�o entre no meu caminho novamente, P� torto!\n");
							System.out.println("Curupira: �... voc� n�o aprendeu nada mesmo.");
							System.out.println(nomeP+": Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("Curupira: Vou fazer voc� se arrepender de sua escolha seu lobo mimado. \n");
							System.out.println("      A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."
											+ "Lembre-se que voc� aceitou ajudar o curupira, ent�o voc� possui uma dica para resolver o problema.");
							System.out.println("      PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo com o curupira apos o personagem principal se aliar ao cuurpira
							
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhando respostas 
								Collections.shuffle(questaolobisomem);
								
								System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");
								System.out.println("     DICA 1 DO CURUPIRA!!!!! Lembre-se que uma equa��o de 2�grau pode possuir um x negativo e uma x positivo, o desafio pede apenas a soma dos resultados positivos.");
								System.out.println("     DICA 2 DO CURUPIRA!!! Lembre-se do que � MMC (m�nimo m�ltiplo comum) que � o menor n�mero, tamb�m inteiro, que � m�ltiplo de todos esses n�meros ao mesmo tempo. "
												+ "Por exemplo, o MMC entre 2 e 12 � 12, pois os m�ltiplos de 2 s�o 2, 4, 6, 8, 10, 12� e os de 12 s�o: 12, 24, �"
												+ "Isso pode ser �til para resolver essa quest�o...\n");		//desafio do lobisomem com a dica do curupira	
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { //switch do desafio do lobisomem 
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso seja a letra seja a correta
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso a letra b seja a correta
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso a letra c seja correta 
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso a letra d seja a correta 
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso a letra e seja a correta 
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else {  //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default: //caso usario digite alguma alternativa que nao existe
									System.out.println("       Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
									lobisomem = true;
								}
							} while (lobisomem == true);//para sair do la�o de repeti��o referente ao desafio do lobisomem a boolean lobisomem deve ser false
												
							curupira = true;				
						} else { //caso nao seja a letra e
							
							System.out.println("\n Curupira: Pensei que voc� fosse mais inteligente. Vou pedir a ajuda de outra pessoa, pode seguir seu caminho sozinho.");
							System.out.println("       Voc� est� seguindo sua jornada para floresta sozinho...");
							System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
							System.out.println("       O barulho fica cada vez mais alto.");
							System.out.println(nomeP+": Isso n�o me cheira nada bem...\n");
							System.out.println("SCRHHHHH!!!!!!\n");
							System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala:");
							System.out.println("Lobisomem: Eu estava esperando por voc�! HAHAHAHA...");
							System.out.println(nomeP+": Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que est� com a Cuca.");
							System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho voc� a ir do jeito mais fac�l para n�o se machucar...");
							System.out.println(nomeP+": Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
							System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
											+ "Eu devo a ela!");
							System.out.println("       O que o Lobisomem n�o sabe � que Fulano tem habilidades especiais.");
							System.out.println(nomeP+": Eu n�o quero confus�o, mas farei de tudo para chegar at� minha menina... Nem voc� vai me parar!\n");
							System.out.println("       A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio."); 
							System.out.println("       PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo sem o curupira pq o usario noa conseguiu se aliar
										
							questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
							questaolobisomem.add("Resultado da soma: 26");
							questaolobisomem.add("Resultado da soma: 28");
							questaolobisomem.add("Resultado da soma: 21");
							questaolobisomem.add("Resultado da soma: 22");

							do {
								Collections.shuffle(questaolobisomem);//embaralhar respostas 
								Collections.shuffle(questaolobisomem);
								
								System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
												+ "Equa��o1 2�grau: 3x� - 27 = 0"
												+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
												+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");		//desafio sem a dica do curupira	
								System.out.println("A - " + questaolobisomem.get(0));
								System.out.println("B - " + questaolobisomem.get(1));
								System.out.println("C - " + questaolobisomem.get(2));
								System.out.println("D - " + questaolobisomem.get(3));
								System.out.println("E - " + questaolobisomem.get(4) + "\n");
								System.out.println("O resultado da soma das equa��es �: ");
								respostalobisomem = entrada.next();

								switch (respostalobisomem.toLowerCase()) { 
								
								case "a":
									if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso a letra a seja a correta
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja a correta
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									} 
									break;
								case "b":
									if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso a letra correta seja a b
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja a correta
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "c":
									if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso a letra correta seja a c
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja a correta
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "d":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso a letra correta seja a d
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);
									}
									break;
								case "e":
									if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso a letra correta seja a e
										System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
										lobisomem = false;
									} else { //caso nao seja a correta
										System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
										System.exit(0);	
									}
									break;	
								default:
									System.out.println("           Op��o invalida. Responda o desafio apenas com as op��es indicadas.");
									lobisomem = true;
								}
							} while (lobisomem == true);//para sair do la�o de repeti��o referente  fase do lobisomem a boolean lobisomem deve ser false 
												
							curupira = true;		
						} break;
						
						default: 
							System.out.println("         Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
							curupira = false;	
					}
					
				} while (curupira == false);
				escolhaajuda = false;	
				break;	
				
			case 2:   //caso ele optar por n�o ter ajuda do curupira 
				System.out.println("\n Curupira: OK, � voc� quem sabe... espero que tenha muita for�a e coragem para enfrentar o Lobisomem.");
				System.out.println("       Voc� est� seguindo sua jornada para floresta sozinho...");
				System.out.println("       A floresta � densa e escura, ao ouvir alguns barulhos estranhos voc� j� sente calafrios e um arrepio na nuca. Mas o medo nunca ir� vencer sua esperan�a e f� de encontrar sua filha...");
				System.out.println("       O barulho fica cada vez mais alto.");
				System.out.println(nomeP+": Isso n�o me cheira nada bem...\n");
				System.out.println("SCRHHHHH!!!!!!\n");
				System.out.println("       Derepente da escurid�o surge uma criatura enorme (fala as caracter�sticas do lobisomem) e fala:");
				System.out.println("Lobisomem: Eu estava esperando por voc�! HAHAHAHA...\n");
				System.out.println(nomeP+": Voce deve ser o Lobisomem do qual me avisaram... Pode me ajudar ? Preciso encontrar Eva mate para resgatar minha filha que est� com a Cuca.");
				System.out.println("Lobisomem: HAHAHAHAHA! A Cuca j� havia me avisado que viria por aqui... E ela me pagou muito mais para leva-lo para ela, eu aconselho voc� a ir do jeito mais fac�l para n�o se machucar...");
				System.out.println(nomeP+": Por favor Sr.Lobisomem, me deixe passar, preciso encontrar minha filha!");
				System.out.println("Lobisomem: Calado seu insolente, vou te levar junto comigo para a mestre Cuca!"
						+ "Eu devo a ela!");
				System.out.println("       O que o Lobisomem n�o sabe � que Fulano tem habilidades especiais.");
				System.out.println(nomeP+": Eu n�o quero confus�o, mas farei de tudo para chegar at� minha menina... Nem voc� vai me parar! \n");
				System.out.println("      A batalha com o Lobisomem ir� acontecer, prepare-se para resolver o desafio.");
				System.out.println("      PARA DERROTAR O LOBISOMEM RESOLVA O SEGUINTE DESAFIO: \n");//dialogo sem o curupira pq o usario escolheu nao se aliar

				questaolobisomem.add("Resultado da soma: 24"); //resposta correta lobisomem
				questaolobisomem.add("Resultado da soma: 26");
				questaolobisomem.add("Resultado da soma: 28");
				questaolobisomem.add("Resultado da soma: 21");
				questaolobisomem.add("Resultado da soma: 22");

				do {
					Collections.shuffle(questaolobisomem);//embaralhar perguntas
					Collections.shuffle(questaolobisomem);
					
					System.out.println("Desafio: Fa�a a soma apenas do resultado positivo da seginte equa��o de 2�grau com o resultado da equa��o de 1�grau."
									+ "Equa��o1 2�grau: 3x� - 27 = 0"
									+ "Equa��o2 1�grau: x(x - 14) + (x/3 + 7) = 42"
									+ "Resposta = Resultado positivo equa��o1 + resultado equa��o2\n");	//desafio sem dica do curupira 		
					System.out.println("A - " + questaolobisomem.get(0));
					System.out.println("B - " + questaolobisomem.get(1));
					System.out.println("C - " + questaolobisomem.get(2));
					System.out.println("D - " + questaolobisomem.get(3));
					System.out.println("E - " + questaolobisomem.get(4) + "\n");
					System.out.println("O resultado da soma das equa��es �: ");
					respostalobisomem = entrada.next();

					switch (respostalobisomem.toLowerCase()) { //switch referente ao desafio do lobisomem 
					
					case "a":
						if (questaolobisomem.get(0).equals("Resultado da soma: 24")) { //caso a correta seja a letra a
							System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
							lobisomem = false;
						} else { //caso nao seja
							System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
							System.exit(0);
						} 
						break;
					case "b":
						if (questaolobisomem.get(1).equals("Resultado da soma: 24")) { //caso a correta seja a letra a
							System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
							lobisomem = false;
						} else { //caso nao seja
							System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
							System.exit(0);
						}
						break;
					case "c":
						if (questaolobisomem.get(2).equals("Resultado da soma: 24")) { //caso a correta seja a letra a
							System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
							lobisomem = false;
						} else { //caso nao seja
							System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
							System.exit(0);
						}
						break;
					case "d":
						if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso a correta seja a letra a
							System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
							lobisomem = false;
						} else { //caso nao seja
							System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
							System.exit(0);
						}
						break;
					case "e":
						if (questaolobisomem.get(3).equals("Resultado da soma: 24")) { //caso a correta seja a letra e
							System.out.println("       Voc� acertou e conseguiu passar do Lobisomem e pode prosseguir de fase!");
							lobisomem = false;
						} else { //caso nao seja
							System.out.println("       Voc� errou, volte para o inicio do jogo e tente novamente!");
							System.exit(0);	
						}
						break;	
					default:
						System.out.println("       Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
						lobisomem = true;
					}
				} while (lobisomem == true); //para sair do looping do desafio do lobisomem a boolean lobisomem precisa ser false

				escolhaajuda = false;
				break;
			default: //caso ele digite alguma op��o que nao exista 
				System.out.println("       Op��o invalida. Responda apenas com as op��es apresentadas.\n");
				escolhaajuda = true;//a boolean da op�ao de escolha de ajuda do curupira precisa ser false para sair do looping

			}
		} while (escolhaajuda == true);	
		
		System.out.println("          \n Logo ap�s muito sacrif�cio e muito esfor�o, voc� conseguiu passar pelo monstro mais temido da floresta. Agora est� continuando sua jornada em busca da Erva mate para ela te ajudar a encontrar "
				+ "sua filha e derrotar a cuca.");
		System.out.println("       Como o Neguinho do Pastoreiro te contou, a Erva est� nessa regi�o da floresta, basta voc� se concentrar e orar para encontra-la.");
		System.out.println(nomeP+": Por favor, que eu receba algum sinal para encontrar a Erva, eu preciso encontrar minha filha, POR FAVOR!!!!");
		System.out.println("       De repente ele ve uma luz forte vindo ao lado de uma �rvore, se aproxima e percebe que o sinal que havia pedido foi atendido. Era o Negrinho do Pastoreiro mais uma vez, vindo o ajudar.");
		System.out.println("Negrinho do Pastoreiro: Sou eu novamente, eu ouvi o seu pedido, estou aqui para te mostrar onde a Erva est� localizada. Ande 30 metros para o leste e encontrar� a guardi� da folha, Ca�-Yari e pe�a para ela o poder m�stico da Erva.");
		System.out.println("       Voc� est� seguindo para o leste da floresta...");
		System.out.println(nomeP+": Ol�, voc� � a Ca�-Yari ?");
		System.out.println("Ca�-Yari: Sim... quem � voc� ?");
		System.out.println(nomeP+": Meu nome � (personagem), me disseram que voc� poderia me ajudar a recuperar minha filha das m�os da cuca. Eu preciso do poder da Erva para conseguir derrota-la.");
		System.out.println("Ca�-Yari: Minha apari��o acontece apenas para pessoas e motivos dignos, ent�o se eu estou aqui falando com voc�, significa que est� destinado a receber o poder da folha. Irei d�-lo a voc�... Mas lembre-se, "
				+ "use-o com sabedoria, esse poder � sagrado e sua hist�ria tamb�m. Por isso deve passar por um desafio para provar que � merecedor dessa divindade.\n");
		System.out.println("       PARA RECEBER O PODER RESOLVA O SEGUINTE DESAFIO: \n");

		alternativaservamate.add("1001(binario)");
		alternativaservamate.add("1000(binario)");
		alternativaservamate.add("1010(binario)");
		alternativaservamate.add("100(binario)");
		alternativaservamate.add("101(binario)"); // respostas correta

		do {
			Collections.shuffle(alternativaservamate);
			Collections.shuffle(alternativaservamate);
			Collections.shuffle(alternativaservamate);
			System.out.println("1� ETAPA DESAFIO: 101110100(binario) x 4E(hexa) = x(decimal)");
	System.out.println("2� ETAPA DESAFIO: x(decimal) / 132(octal) = y(binario) \n");
	System.out.println("A - " + alternativaservamate.get(0));
	System.out.println("B - " + alternativaservamate.get(1));
	System.out.println("C - " + alternativaservamate.get(2));
	System.out.println("D - " + alternativaservamate.get(3));
	System.out.println("E - " + alternativaservamate.get(4) + "\n");
	System.out.println("Qual � o valor de Y em bin�rio ?");
	respostaervamate = entrada.next();

	switch (respostaervamate) {
	case "a":
	case "A":
		if (alternativaservamate.get(0).equals("101(binario)")) {
			System.out.println("Ca�-Yari: Voc� se provou merecedor do poder da Erva-Mate. Parab�ns!!!!\n");
			ervamate = true;
		} else {
			System.out.println("Ca�-Yari: Eu sinto que voc� pode fazer melhor para merecer o poder, vamos l�!!!\n");
		}
		break;
	case "b":
	case "B":
		if (alternativaservamate.get(1).equals("101(binario)")) {
			System.out.println("Ca�-Yari: Voc� se provou merecedor do poder da Erva-Mate. Parab�ns!!!!\n");
			ervamate = true;
		} else {
			System.out.println("Ca�-Yari: Eu sinto que voc� pode fazer melhor para merecer o poder, vamos l�!!!\n");
		}
		break;
	case "c":
	case "C":
		if (alternativaservamate.get(2).equals("101(binario)")) {
			System.out.println("Ca�-Yari: Voc� se provou merecedor do poder da Erva-Mate. Parab�ns!!!!\n");
			ervamate = true;
		} else {
			System.out.println("Ca�-Yari: Eu sinto que voc� pode fazer melhor para merecer o poder, vamos l�!!!\n");
		}
		break;
	case "d":
	case "D":
		if (alternativaservamate.get(3).equals("101(binario)")) {
			System.out.println("Ca�-Yari: Voc� se provou merecedor do poder da Erva-Mate. Parab�ns!!!!\n");
			ervamate = true;
		} else {
			System.out.println("Ca�-Yari: Eu sinto que voc� pode fazer melhor para merecer o poder, vamos l�!!!\n");
		}
		break;
	case "e":
	case "E":
		if (alternativaservamate.get(4).equals("101(binario)")) {
			System.out.println("Ca�-Yari: Voc� se provou merecedor do poder da Erva-Mate. Parab�ns!!!!\n");
			ervamate = true;
		} else {
			System.out.println("Ca�-Yari: Eu sinto que voc� pode fazer melhor para merecer o poder, vamos l�!!!\n");
		}
		break;
	default:
		System.out.println("Computador: Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
		ervamate = false;
		}
		} while (ervamate == false);

		System.out.println("       Agora que conseguiu obter a Erva-Mate, voc� recebeu um buff de 100% de vida e 50% de intelig�ncia. Isso ir� te ajudar no seu desafio final contra a cuca... Prepare-se!\n");
		System.out.println("       Agora, mais destemido do que nunca, voc� j� sabe que o esconderijo da cuca est� pr�ximo.");
		System.out.println(nomeP+": Eu sei que estou perto, cheguei at� aqui e n�o vou desistir de jeito nenhum...");
		System.out.println("       Ao se aproximar do esconderijo seu corpo j� come�a a sentir calafrios, sente que o perigo est� proximo.\n");
		System.out.println("   SCRHHH!!!!!!!\n");
		System.out.println("       Na escurid�o da floresta voc� avista uma criatura esquisita, parecendo um lacoste e fala:");
		System.out.println(nomeP+": CUCA ? Eu sei que � voc�, pode sair da escurid�o e devolva minha filha, eu n�o saio daqui sem ela!!!!");
		System.out.println("Cuca: HAHAHAHAHAHA!!!! Em poucos minutos os preparativos estar�o prontos e o meu plano finalmente poder� acontecer!!! Sua filha � a pe�a chave para tudo isso dar certo, n�o existe mais volta!");
		System.out.println(nomeP+": NADA DISSO! Eu n�o saio daqui sem ela, j� sei como te derrotar e n�o vou desistir!");
		System.out.println("Cuca: Voc� acha mesmo que tem chances contra mim ? Eu tenho as trevas como minha aliada!");
		System.out.println(nomeP+": N�o me importo, os poderes divinos est�o do meu! \n");
		System.out.println("       A batalha final com a cuca ir� acontecer... PREPARE-SE!!!");
		System.out.println("       PARA DERROTAR A CUCA RESOLVA O SEGUINTE DESAFIO: \n");
		System.out.println("*---- LEMBRE-SE: VOC� EST� COM O PODER DIVINO DA ERVA MATE, COM 100% A MAIS DE VIDA N�O PODE SER DERROTADO. 50% A MAIS DE INTELIG�NCIA VOC� TEM DIREITO A UMA DICA. \n");

		alternativascuca.add("1,35"); // resposta correta
		alternativascuca.add("2,00");
		alternativascuca.add("1,30");
		alternativascuca.add("1,40");
		alternativascuca.add("1,50");

		do {
			Collections.shuffle(alternativascuca);
			Collections.shuffle(alternativascuca);
			Collections.shuffle(alternativascuca);

			System.out.println("DICA 1: A raiz quadrada de 484 � igual a 22. ");
			System.out.println("1� ETAPA DESAFIO: 10000000(bin�rio) + resultado positivo da equa��o (2x�- 6x - 56 = 0) = x(decimal) \n");
			System.out.println("2� ETAPA DESAFIO: x / E9(hexadecimal) = y(decimal)");

			System.out.println("A - " + alternativascuca.get(0));
			System.out.println("B - " + alternativascuca.get(1));
			System.out.println("C - " + alternativascuca.get(2));
			System.out.println("D - " + alternativascuca.get(3));
			System.out.println("E - " + alternativascuca.get(4) + "\n");
			System.out.println("Qual o valor de Y em decimal ?");
			respostacuca = entrada.next();

			switch (respostacuca) {

			case "a":
			case "A":
				if (alternativascuca.get(0).equals("1,35")) {
					System.out.println("       Esse ataque foi certeiro, parabens!!! Voc� conseguiu derrota-l�. Pegue sua filha e v� embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("       Dessa vez voc� teve sorte!! O poder da Erva-mate fez voc� aguentar o tranco!! Preste aten��o na dica e tente novamente. Voc� � capaz!!!\n");
				}
				break;
			case "b":
			case "B":
				if (alternativascuca.get(1).equals("1,35")) {
					System.out.println("       Esse ataque foi certeiro, parabens!!! Voc� conseguiu derrota-l�. Pegue sua filha e v� embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("       Dessa vez voc� teve sorte!! O poder da Erva-mate fez voc� aguentar o tranco!! Preste aten��o na dica e tente novamente. Voc� � capaz!!!\n");
				}
				break;
			case "c":
			case "C":
				if (alternativascuca.get(2).equals("1,35")) {
					System.out.println("       Esse ataque foi certeiro, parabens!!! Voc� conseguiu derrota-l�. Pegue sua filha e v� embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("       Dessa vez voc� teve sorte!! O poder da Erva-mate fez voc� aguentar o tranco!! Preste aten��o na dica e tente novamente. Voc� � capaz!!!\n");
				}
				break;
			case "d":
			case "D":
				if (alternativascuca.get(3).equals("1,35")) {
					System.out.println("       Esse ataque foi certeiro, parabens!!! Voc� conseguiu derrota-l�. Pegue sua filha e v� embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("       Dessa vez voc� teve sorte!! O poder da Erva-mate fez voc� aguentar o tranco!! Preste aten��o na dica e tente novamente. Voc� � capaz!!!\n");
				}
				break;
			case "e":
			case "E":
				if (alternativascuca.get(4).equals("1,35")) {
					System.out.println("       Esse ataque foi certeiro, parabens!!! Voc� conseguiu derrota-l�. Pegue sua filha e v� embora desse lugar!\n");
					cuca = true;
				} else {
					System.out.println("       Dessa vez voc� teve sorte!! O poder da Erva-mate fez voc� aguentar o tranco!! Preste aten��o na dica e tente novamente. Voc� � capaz!!!\n");
				}
				break;
			default:
				System.out.println("       Op��o invalida. Responda o desafio apenas com as op��es indicadas.\n");
				cuca = false;
			}
		} while (cuca == false);			
	} 
}