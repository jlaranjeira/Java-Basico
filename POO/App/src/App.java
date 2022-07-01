import model.ContaBancaria;

public class App {
    public static void main(String[] args) {
        System.out.printf("Nosso Banco Digital");
        System.out.println();

        ContaBancaria conta = new ContaBancaria("0001","123456",1,100.00);
        System.out.println(conta.getSaldo());
    }
}
