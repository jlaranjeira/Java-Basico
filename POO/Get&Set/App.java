

public class App {
    public static void main(String[] args) {
        System.out.println("Apredendo POO com Java");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("José");
        pessoa1.setIdade(43);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        

        Carro meuCarro = new Carro();
        meuCarro.setMarca("FIAT");
        meuCarro.setModelo("Estrada ELX");
        meuCarro.setCor("Preto");
        meuCarro.setAno("2022");

        System.out.println(meuCarro.getMarca());
        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getCor());
        System.out.println(meuCarro.getAno());
    }
}