import java.util.Scanner;

public class ContaTerminal{

    public static void main(String... args) throws Exception{
        //TODO:Conhecer e importar a classe Scanner

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        String convertSaldo;
        String saldoComVirgula;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scan.next();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scan.next();
        System.out.println("Por favor, digite a sua conta: ");
        numero = scan.nextInt();
        System.out.println("Por favor, digite o seu saldo: ");
        convertSaldo = scan.next();

        saldoComVirgula = convertSaldo.replace(".", ",");

        saldo = Double.parseDouble(convertSaldo.replace(",", ".")); // caso queira efetuar cálculos


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldoComVirgula +" já está disponível para saque");

    }


}