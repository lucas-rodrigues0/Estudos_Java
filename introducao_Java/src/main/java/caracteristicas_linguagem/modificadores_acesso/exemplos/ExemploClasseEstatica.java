package caracteristicas_linguagem.modificadores_acesso.exemplos;

public class ExemploClasseEstatica {
    public static void main(String[] args) {
        final ClasseEstatica naoEstatico1 = new ClasseEstatica();
        ClasseEstatica estatico = new ClasseEstatica();

        final ClasseEstatica estatico1 = new ClasseEstatica();
        System.out.println("nao estatico 1: " + naoEstatico1.getNaoEstatico());
        System.out.println("estatico 1: " + estatico1.getEstatico());

        final ClasseEstatica naoEstatico2 = new ClasseEstatica();
        naoEstatico2.setNaoEstatico("não estatico modificado");
        final ClasseEstatica estatico2 = new ClasseEstatica();
        estatico2.setEstatico("Estatico modificado");

        System.out.println("\nCom modificação em uma das instancias\n");
        System.out.println("nao estatico 1: " + naoEstatico1.getNaoEstatico());
        System.out.println("nao estatico 2: " + naoEstatico2.getNaoEstatico());
        System.out.println("estatico 1: " + estatico1.getEstatico());
        System.out.println("estatico 2: " + estatico2.getEstatico());

        System.out.println("\nMetodo estatico:\n");
        System.out.println(ClasseEstatica.metodoEstatico());
    }
}
