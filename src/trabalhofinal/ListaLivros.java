package trabalhofinal;

public class ListaLivros {

    public static void main(String[] args) throws Exception {
        int opc = 0;
        int tipo = 0;

        GerenciaListaLivros g = new GerenciaListaLivros();
        BancoDadosLivros bd = new BancoDadosLivros();

        LivroParticular livroparticular = new LivroParticular();
        LivroEstudos livroestudos = new LivroEstudos();
        LivroProfissional livroprofissional = new LivroProfissional();

        bd.conectaBanco();

        do {
            opc = g.menu(opc);
            switch (opc) {
                case 1:
                    tipo = g.tipoDeLivroCadastro(tipo, "Qual o tipo de livro que deseja cadastrar?");
                    if (tipo == 1) {
                        livroparticular.cadastrar(bd);
                    } else if (tipo == 2) {
                        livroestudos.cadastrar(bd);
                    } else if (tipo == 3) {
                        livroprofissional.cadastrar(bd);
                    }
                    break;
                case 2:
                    tipo = g.tipoDeLivroCadastro(tipo, "Qual o tipo de livro que deseja exibir?");
                    if (tipo == 1) {
                        livroparticular.excluir(bd);
                    } else if (tipo == 2) {
                        livroestudos.excluir(bd);
                    } else if (tipo == 3) {
                        livroprofissional.excluir(bd);
                    }
                    break;
                case 3:
                    tipo = g.tipoDeLivroCadastro(tipo, "Qual o tipo de livro que deseja atualizar?");
                    if (tipo == 1) {
                        livroparticular.atualizar(bd);
                    } else if (tipo == 2) {
                        livroestudos.atualizar(bd);
                    } else if (tipo == 3) {
                        livroprofissional.atualizar(bd);
                    }
                    break;
                case 4:
                    tipo = g.tipoDeLivroCadastro(tipo, "Qual o tipo de livro que deseja buscar pelo título?");
                    if (tipo == 1) {
                        livroparticular.buscarTitulo(bd);
                    } else if (tipo == 2) {
                        livroestudos.buscarTitulo(bd);
                    } else if (tipo == 3) {
                        livroprofissional.buscarTitulo(bd);
                    }
                    break;
                case 5:
                    tipo = g.tipoDeLivroCadastro(tipo, "Qual o tipo de livro que deseja buscar pelo autor?");
                    if (tipo == 1) {
                        livroparticular.buscarAutor(bd);
                    } else if (tipo == 2) {
                        livroestudos.buscarAutor(bd);
                    } else if (tipo == 3) {
                        livroprofissional.buscarAutor(bd);
                    }
                    break;
                case 6:
                    break;
            }
        } while (opc != 6);
    }
}
