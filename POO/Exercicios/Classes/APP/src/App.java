public class App {
    public static void main(String[] args) {
        System.out.println("Apredendo POO com Java");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Jose");
        pessoa1.setIdade(46);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        /*
        * Class carro
        * */


        Carro meuCarro = new Carro();
        meuCarro.setModelo("Palio");
        meuCarro.setAno(2005);
        meuCarro.setCor("Preto");

        System.out.println(meuCarro.getModelo());
        System.out.println(meuCarro.getAno());
        System.out.println(meuCarro.getCor());


    }
}
