package caracteristicas_linguagem.modificadores_acesso.exemplos;

public class ExemploClasseAbstrata {
    public static void main(String[] args) {
        // final ClasseAbstrata classeAbstrata = new ClasseAbstrata(); (ERROR --> abstract não pode ser instanciado)

        final ClasseAbstrata tipoClasse = new AlgumaClasseQueEstendeAbstrata("algumNome", 100);

        System.out.println("As classes abstratas e métodos abstratos podem ter os retornos:");
        System.out.println("\npelo metodo toString -");
        System.out.println(tipoClasse);
        System.out.println("\nou pelos metodos abstratos -");
        System.out.println("nome: " + tipoClasse.nome());
        System.out.println("numeral: " + tipoClasse.numeral());
    }
}
