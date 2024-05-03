import java.util.Scanner;
public class Usuario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String agencia, nomeCliente;
		int numeroConta;
		double saldo;
		
		System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        numeroConta = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");

        scanner.close();
	}
}
