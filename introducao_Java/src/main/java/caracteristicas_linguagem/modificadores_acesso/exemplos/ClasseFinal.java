package caracteristicas_linguagem.modificadores_acesso.exemplos;

public final class ClasseFinal {
    final String variavelFinal = "Não pode modificar a variavel!";

    public ClasseFinal() {
    }

    public String classeFinalMetodo() {
        return "Classe não pode ser estendida!";
    }

    public final String metodoFinal() {
        return "Não pode ser sobrescrito!";
    }

    public String parametroFinal(final String str) {
        return "Não pode modificar parametro " + str + "!";
    }

    public String getVariavelFinal() {
        return variavelFinal;
    }
}