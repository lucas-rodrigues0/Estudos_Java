package caracteristicas_linguagem.modificadores_acesso;

public class AcessoProtected {

    // Torna o membro acessível às classes do mesmo pacote ou através de herança,
    // seus membros herdados não são acessíveis a outras classes fora do pacote
    // em que foram declarados.

    protected String acessoProtected;

    public AcessoProtected() {
        this.acessoProtected = "Somente visivel no pacote modificadores_acesso";
    }

    public String getAcessoProtected() {
        return acessoProtected;
    }
}