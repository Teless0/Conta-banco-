import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("Bem vindo ao banco Dio, a seguir coloque as informações solicitadas: ");

        System.out.println("Insira seu nome e sobrenome");
        nomeCliente = scanner.nextLine();

        System.out.println("insira sua Agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Insira o numero da sua conta: ");
        numero = scanner.nextInt();

        System.out.println("Insira seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar sua conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo  + " já está disponivel para saque.");
        scanner.close();
    }
}
