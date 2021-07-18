package caracteristicas_linguagem.modificadores_acesso;

public class AcessoPublic {

    // pode ser acessada de qualquer lugar por qualquer entidade que possa visualizar
    // a classe a que ela pertence.

    public String acessoPublic;

    private String descricao;

    public AcessoPublic() {

        this.acessoPublic = "Visivel a todos";
        this.descricao = acessoAosExemplosModificadores();
    }

    public String acessoAosExemplosModificadores() {
        String acessoPrivate = new AcessoPrivate().getAcessoPrivate();
        String acessoProtected = new AcessoProtected().acessoProtected;
        String acessoDefault = new AcessoDefault().acessoDefault;
        descricao = "Acesso:" +
                "\nPublic: " + acessoPublic +
                "\nPrivate: " + acessoPrivate +
                "\nProtected: " + acessoProtected +
                "\nDefault: " + acessoDefault;

        return descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}