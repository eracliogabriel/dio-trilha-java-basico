package iphone;
import java.util.Scanner;
public class Aplicativos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Iphone celular = new Iphone();
		System.out.println("BEM VINDO AO IPHONE");
		
		
	
		while (true) {
			System.out.println("Selecione a opção desejada");
			System.out.println("1. Aplicativo de música");
			System.out.println("2. Operações telefônicas");
			System.out.println("3. Navegador Web");
			System.out.println("4. Sair e bloquear aparelho");
			int opcao = scanner.nextInt();
		 switch(opcao) {
         case 1:
             System.out.println("Abrindo o aplicativo de Música...");
             celular.tocar();
             celular.pausar();
             celular.selecionarMusica();
             break;
         case 2:
             System.out.println("Abrindo operações do Telefone...");
             celular.ligar();
             celular.atender();
             celular.iniciarCorrerioVoz();
             break;
         case 3:
             System.out.println("Abrindo o aplicativo de Internet...");
             celular.exibirPagina();
             celular.adicionarNovaAba();
             celular.atualizarPagina();
             break;
         case 4:
             System.out.println("Saindo do Menu...");
             System.out.println("Bloqueando aparelho");
             return;
         default:
             System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
             break;
		 	}
		}
		
	}

}
