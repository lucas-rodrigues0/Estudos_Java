package caracteristicas_linguagem.modificadores_acesso;

public class AcessoDefault {

    // É o acesso padrão. A classe e/ou seus membros são acessíveis somente por classes do mesmo pacote,
    // na sua declaração não é definido nenhum tipo de modificador, sendo este
    // identificado pelo compilador

    String acessoDefault;

    public AcessoDefault() {
        this.acessoDefault = "Acesso padrão";
    }

    public String getAcessoDefault() {
        return acessoDefault;
    }

    public void setAcessoDefault(String acessoDefault) {
        this.acessoDefault = acessoDefault;
    }
}