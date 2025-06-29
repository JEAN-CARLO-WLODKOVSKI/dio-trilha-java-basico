import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pelo Scanner os valores digitados no terminal

        // Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        var nome = scanner.nextLine();

        System.out.println("Informe sua agência: ");
        var agencia = scanner.nextLine();
        
        System.out.println("Informe sua conta: ");
        var conta = scanner.nextInt();

        System.out.println("Informe o seu saldo: ");
        var saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " + 
        "sua agência é %s, " + "%nconta %s e " + "seu saldo %s já está disponível para saque.",
        nome, agencia, conta, saldo);
    }
}
