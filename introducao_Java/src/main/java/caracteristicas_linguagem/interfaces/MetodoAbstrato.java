package caracteristicas_linguagem.interfaces;

public class MetodoAbstrato implements InterfaceComMetodoAbstrato {
    @Override
    public String oQueSou() {
        return "Sou uma classe que também é uma interface com método abstrato";
    }
}