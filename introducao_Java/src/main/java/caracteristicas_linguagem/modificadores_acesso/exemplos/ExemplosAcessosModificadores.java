package caracteristicas_linguagem.modificadores_acesso.exemplos;

import caracteristicas_linguagem.modificadores_acesso.AcessoDefault;
import caracteristicas_linguagem.modificadores_acesso.AcessoPrivate;
import caracteristicas_linguagem.modificadores_acesso.AcessoProtected;
import caracteristicas_linguagem.modificadores_acesso.AcessoPublic;

public class ExemplosAcessosModificadores {
    public static void main(String[] args) {
        String descricao = new AcessoPublic().getDescricao();
        String publica = new AcessoPublic().acessoPublic;
        String privado = new AcessoPrivate().getAcessoPrivate();
//        String protegido = new AcessoProtected().acessoProtected;    (ERROR --> Não podem ser acessados estando em outro pacote)
//        String padrao = new AcessoDefault().acessoDefault;    (ERROR --> Não podem ser acessados estando em outro pacote)
        String protegido = new AcessoProtected().getAcessoProtected();
        String padrao = new AcessoDefault().getAcessoDefault();

        System.out.println("Modificadores acessados pelas respectivas classes:\n");
        System.out.println("public: " + publica + "\n" + "private: " + privado + "\n" + "protected: " + protegido + "\n" + "default: " + padrao);
        System.out.println("\nOu buscados pelo metodo na classe AcessoPublic:\n");
        System.out.println(descricao);
    }
}