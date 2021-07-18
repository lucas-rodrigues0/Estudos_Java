package caracteristicas_linguagem.interfaces;

public class HerancaMultipla implements InterfaceComHeranca{
    // A interface com herança possui os metodos de todas as interfaces.
    // aqui a implementação do método abstrato que deve ser implementado.
    @Override
    public String oQueSou() {
        return "Sou uma classe que implementa uma interface com herança de outras duas. Aqui o método abstrato";
    }

    // os métodos default não precisam implementação
    // e os métodos com o mesmo nome já foi implementado na interface com a herança. Pode ser implementada aqui também
    @Override
    public void metodoComMesmoNome() {
        System.out.println("Aqui as duas implementações das duas interfaces que foram herdadas");
        InterfaceComHeranca.super.metodoComMesmoNome();
    }
}
