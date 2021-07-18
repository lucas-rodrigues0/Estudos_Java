package caracteristicas_linguagem.tipos_dados.exemplos;

public class ExemploTiposNaoPrimitivos {
    public static void main(String[] args) {
        String texto = "Eu sou uma string!";
        Number numero = Integer.valueOf("100");
        Void v;
        Object o = new Object();

        System.out.println("\ntipo String:");
        System.out.println(texto);

        System.out.println("\ntipo Number:");
        System.out.println(numero);

        System.out.println("\ntipo Void: tipo vazio que não retorna nada");

        System.out.println("\ntipo Object: referencia ao objeto 'o' --> " + o);
    }
}