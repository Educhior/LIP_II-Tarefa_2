class Livro {
    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do livro");
    }
}

class LivroDigital extends Livro {
    @Override
    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do livro digital: formato PDF ou ePub.");
    }
}

class LivroFisico extends Livro {
    @Override
    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do livro físico: capa dura, páginas impressas.");
    }
}

public class Polimorfismo_em_Tempo_de_Execucao {
    public static void main(String[] args) {
        Livro meuLivro1 = new LivroDigital();  
        Livro meuLivro2 = new LivroFisico();

        meuLivro1.exibirDetalhes();
        meuLivro2.exibirDetalhes();
    }
}
