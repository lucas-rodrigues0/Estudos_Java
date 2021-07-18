package caracteristicas_linguagem.interfaces;

public interface InterfaceComMetodoDefault {
    // Não precisa implementar nas classes que são esta interface
    // herda o modificador de acesso da própria interface
    // ao adicionar novos métodos, todas as classes vão herdar o método

    default void descreverInterface() {
        System.out.println("Sou um método Default de uma interface!");
    }

    default void metodoComMesmoNome() {
        // caso dois metodos possuam o mesmo nome, a classe devera sobrescrever o método para dizer qual será utilizado
        System.out.println("Métodos diferentes, mesmo nome!");
    }
}
