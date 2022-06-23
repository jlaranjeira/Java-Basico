import java.nio.channels.ClosedSelectorException;

public class App {
    public static void main(String[] args) {
        System.out.println("Apredendo POO com Java");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "José";
        pessoa1.idade = 43;

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "João";
        pessoa2.idade = 37;

        System.out.println(pessoa2.nome);
        System.out.println(pessoa2.idade);

        Carro meuCarro = new Carro();
        meuCarro.marca = "FIAT";
        meuCarro.modelo = "Estrada ELX";
        meuCarro.cor = "Preto";
        meuCarro.ano = "2022";

        System.out.println(meuCarro.marca);
        System.out.println(meuCarro.modelo);
        System.out.println(meuCarro.cor);
        System.out.println(meuCarro.ano);
    }
}