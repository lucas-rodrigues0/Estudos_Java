package caracteristicas_linguagem.interfaces;

public interface InterfaceComHeranca extends InterfaceComMetodoAbstrato, InterfaceComMetodoDefault {
    // Essa inteface irá estender os métodos das duas interfaces.
    // Como as duas possuem métodos com o mesmo nome, há de implemntar qual código será usado.
    // no caso utilizando as duas implementações

    @Override
    default void metodoComMesmoNome() {
        InterfaceComMetodoAbstrato.super.metodoComMesmoNome();
        InterfaceComMetodoDefault.super.metodoComMesmoNome();
    }
}
