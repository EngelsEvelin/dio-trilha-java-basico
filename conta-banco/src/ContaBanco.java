public class ContaBanco {
    // atributos da conta
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    // Função para mostrar os dados da conta
    public void mostrarDadosConta() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }
}