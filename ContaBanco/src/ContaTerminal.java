
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao terminal do banco!");
        Conta conta = new Conta();
        System.out.println("Informe o número da conta:");
        conta.numero = Integer.parseInt(System.console().readLine());
        System.out.println("Informe a agência da conta:");
        conta.agencia = System.console().readLine();
        System.out.println("Informe o nome do cliente:");
        conta.nomeCliente = System.console().readLine();
        System.out.println("Informe o saldo da conta:");
        conta.saldo = Double.parseDouble(System.console().readLine());
        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque");
    }
}
