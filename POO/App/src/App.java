
import model.ContaCorrente;
import model.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        System.out.printf("Nosso Banco Digital");
        System.out.println();

        ContaCorrente conta = new ContaCorrente("0001","7542",5,100.0);

        System.out.println("Saldo atual R$: " +conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual R$: " +conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("Saldo atual R$: " + conta.getSaldo());

        ContaPoupanca conta2 = new ContaPoupanca("0001","7543",6,200.0);
        System.out.println("Saldo atual conta2 R$: " + conta2.getSaldo());
        conta2.transferir(100.0, conta);
        System.out.println("Saldo atual conta2 R$: " + conta2.getSaldo());
        System.out.println();

        System.out.println("Saldo conta de destino R$: " + conta.getSaldo());
        System.out.println();
    }
}
