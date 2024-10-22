import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler os dados que o usuário digitar no terminal
Scanner scanner = new Scanner(System.in);

        // nova conta bancária
        ContaBanco conta = new ContaBanco();

        // usuário digitar o número da conta
        System.out.println("Por favor, digite o numero da conta: ");
        conta.numero = scanner.nextInt();
        
        scanner.nextLine();  // Limpa o buffer (caixa temporária para guardar os dados que o usuário digitar) do scanner (isso evita problemas com a leitura de strings)
        //estava pulando depois de digitar a conta (nextLine serve pra ler uma linha inteira de texto até o usuário digitar enter)

        // usuário digitar a agência
        System.out.println("Digite o número da agência: ");
        conta.agencia = scanner.nextLine();

        // usuário digitar o nome do cliente
        System.out.println("Digite o nome do cliente: ");
        conta.nomeCliente = scanner.nextLine();

        // usuário digitar o saldo da conta
        System.out.println("Digite o saldo da conta: ");
        conta.saldo = scanner.nextDouble();

        // dados da conta bancária
        System.out.println("Olá " + conta.nomeCliente + ", obrigada por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");
        //conta.mostrarDadosConta();
    }
}