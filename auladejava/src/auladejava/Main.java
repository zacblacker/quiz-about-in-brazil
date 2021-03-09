package auladejava;

import java.util.Scanner;

/*public class Main {
	 char e sring
	public char[] nome ={'N','i','c','o','l','a','s'};
	
	public Main() {
		String nomeCompleto="";
		for(int i = 0; i<nome.length; i++) {
		nomeCompleto+=nome[i];
		}
		System.out.println(nomeCompleto);
	
 				com numeros
public int[] num ={10,20,30};
	
	public Main() {
		int soma=0;
		for(int i = 0; i<num.length; i++) {
		soma+=num[i];
		}
		System.out.println(soma);
	}*/
	
	public class Main{
		
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int pontos = 0;
		System.out.println("bem vindo!Pressione S para continuar");
		String string= scanner.nextLine();
		if(string.equals("s")) {
			System.out.println("qual a capital do brasil?");
			string= scanner.nextLine();
			if(string.equals("brasilia")) {
				System.out.println("voce pontuou um ponto");
				pontos++;
				System.out.println("voce deseja continuar? (S),ou desistir? (N)");
				string = scanner.nextLine();
				if(string.equals("s")) {
					System.out.println("qual continente fica o brasil?");
					string= scanner.nextLine();
					if(string.equals("america")) {
						System.out.println("voce pontuou um ponto");
						pontos++;
						System.out.println("voce deseja continuar? (S),ou desistir? (N)");
						string = scanner.nextLine();
						if(string.equals("s")) {
							System.out.println("qual a capital de são paulo?");
							string=scanner.nextLine();
							if(string.equals("são paulo")) {
								System.out.println("voce pontuou um ponto");
								pontos++;
								System.out.println("voce deseja continuar? (S),ou desistir? (N)");
								string = scanner.nextLine();
								if(string.equals("s")) {
									System.out.println("parabens voce concluiu o jogo com um total de 3 pontos");
								}else{
									System.out.println("acabou o jogo,voce pontuou:"+pontos);
								}
							}else{
								System.out.println("acabou o jogo,voce pontuou:"+pontos);
							}
						}else{
							System.out.println("acabou o jogo,voce pontuou:"+pontos);
						}
						
					}else {
						System.out.println("acabou o jogo,voce pontuou:"+pontos);
					}
				}else {
					System.out.println("acabou o jogo,voce pontuou:"+pontos);
				}
				
			}else {
				System.out.println("acabou o jogo,voce pontuou:"+pontos);
			}
		}else {
			System.out.println("acabou o jogo,voce fez zero pontos");
		}

				
	}
	}

