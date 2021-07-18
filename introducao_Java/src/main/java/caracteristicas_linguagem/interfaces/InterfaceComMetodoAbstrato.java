package caracteristicas_linguagem.interfaces;

public interface InterfaceComMetodoAbstrato {
    // Devem ser implementados por todas as classes que também são essa interface
    // o metodo da interface herda o modificador de acesso da própria interface - aqui no caso public
    // ao adicionar novo método abstrato, todas as classes forem esta interface quebrará
    // até que o novo método seja implementado em todos
    String oQueSou();

    default void metodoComMesmoNome() {
        // caso dois metodos possuam o mesmo nome, a classe devera sobrescrever o método para dizer qual será utilizado
        System.out.println("Mesmo nome, métodos diferentes!");
    }
}
