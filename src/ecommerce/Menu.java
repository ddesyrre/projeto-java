package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.model.Cliente;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);


		int opcao, idProduto, idCliente;
		String cliente;
		float valorProduto, valorCarrinho;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            CONFEITARIA BOLO DE CAKE                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("            Digite a opção desejada:                 ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar cadastro                       ");
			System.out.println("            2 - Selecionar produtos                  ");
			System.out.println("            3 - Visualizar carrinho                  ");
			System.out.println("            4 - Realizar pagamento                   ");
			System.out.println("            5 - Excluir cadastro                     ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
	
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite o número correspondente a opção!");
				leia.nextLine();
				opcao=0;
			}

			if (opcao == 9) {
				System.out.println("\nAgradecemos por visitar nossa loja virtual!!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Criar cadastro\n\n");
				
					System.out.println("Digite seu nome e sobrenome: ");
					System.out.println("(ex: Joana da Silva) ");
					cliente = leia.nextLine();

						
					keyPress();
					break;
				case 2:
					System.out.println("Selecione os produtos\n\n");
					
					keyPress();
					break;
				case 3:
					System.out.println("Visualizar carrinho\n\n");

					keyPress();
					break;
				case 4:
					System.out.println("Realizar pagamento\n\n");
					
					System.out.println("A chave pix da loja é: ");
					System.out.println("11916002715");
					
					keyPress();
					break;
				case 5:
					System.out.println("Excluir cadastro\n\n");

//					System.out.println("Digite o número da (id) da sua conta: ");
//					idCliente = leia.nextInt();
										
					keyPress();
					break;
				
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
					break;
			}
		}
	}


    	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Desyrre Barbosa - ddesyrre@icloud.com");
		System.out.println("github.com/ddesyrre");
		System.out.println("*********************************************************");
	}
    
	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}


	}


