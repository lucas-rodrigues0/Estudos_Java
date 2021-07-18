package caracteristicas_linguagem.modificadores_acesso.exemplos;

public class ExemploClasseFinal {
    public static void main(String[] args) {
        ClasseFinal classeFinal = new ClasseFinal();

        System.out.println("Modificador final:");
        System.out.println("\nClasse final");
        System.out.println(classeFinal.classeFinalMetodo());
        System.out.println("\nMétodo final");
        System.out.println(classeFinal.metodoFinal());
        System.out.println("\nParametro de método final");
        System.out.println(classeFinal.parametroFinal("pois é final"));
        System.out.println("\nVariável final");
        System.out.println(classeFinal.getVariavelFinal());

    }
}
