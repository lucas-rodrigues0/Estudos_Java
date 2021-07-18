package caracteristicas_linguagem.modificadores_acesso;

public class AcessoPrivate {

    // Metodos e atributos da classe definidos como privados não podem ser acessados
    // ou usados por nenhuma outra classe. Esses atributos e métodos também não podem ser vizualizados
    // pelas classes herdadas.

    private String acessoPrivate;

    public AcessoPrivate() {
        this.acessoPrivate = "Visivel somente pela classe";
    }

    // para a manipulação desses dados temos que criar os métodos que irão acessá-los na própria classe.
    // Esses métodos serão públicos e proverão a segurança para a manipulação dos dados privados

    public String getAcessoPrivate() {
        return acessoPrivate;
    }

    public void setAcessoPrivate(String acessoPrivate) {
        this.acessoPrivate = acessoPrivate;
    }
}