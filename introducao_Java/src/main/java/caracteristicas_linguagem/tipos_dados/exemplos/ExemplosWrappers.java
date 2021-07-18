package caracteristicas_linguagem.tipos_dados.exemplos;

public class ExemplosWrappers {
    public static void main(String[] args) {
        String descricao = "Segue os tipos primitivos, mas por serem objetos podemos inicia-los como 'null'";

        Byte b = null;

        Integer i = null;

        int inteiro = new Integer(3);

        System.out.println(descricao);
        System.out.println("\nByte inicializado com: " + b);
        System.out.println("\nInteger inicializado com: " + i);
        System.out.println("\nunboxing um Integer em um int com valor: " + inteiro);

    }
}