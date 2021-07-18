package caracteristicas_linguagem.tipos_dados;

public class ExemplosTiposPrimitivos {
    public static void main(String[] args) {
        // Visualização dos tipos primitivos:

        byte b = new TiposPrimitivos().getNumerico(); // valor default
        byte b1 = 127; // valor max
        byte b2 = -128; // valor min

        short s = new TiposPrimitivos().getCurto(); // valor default
        short s1 = 32767; // valor max
        short s2 = -32768; // valor min

        int i = new TiposPrimitivos().getInteiro(); // valor default
        int i1 = 2147483647; // valor max
        int i2 = -2147483648; // valor min

        long l = new TiposPrimitivos().getLongo(); // valor default
        long l1 = 99999999l; // numero maior com a indicação do l no final

        float f = new TiposPrimitivos().getPontoFlutuante(); // valor default
        float f1 = 65f;
        float f2 = 6.5f;
        float f3 = -0.5f;

        double d = new TiposPrimitivos().getDuplo(); // valor default
        double d1 = 1024.99;
        double d2 = 10.2456;

        boolean boleano = new TiposPrimitivos().isBoleano();
        boolean boleano1 = true;

        char c = new TiposPrimitivos().getCaracter(); // valor default
        char c1 = 'A';
        char c2 = 56; // representacão numerica do caracter '8' seguindo a tabela ASCII
        String c3 = "\\u0000";

        System.out.println("Exemplos de Tipos primitivos");
        System.out.println("\ntipo byte:\n" + b + " valor default");
        System.out.println(b1 + " valor máximo");
        System.out.println(b2 + " valor mínimo");
        System.out.println("\ntipo short:\n" + s + " valor default");
        System.out.println(s1 + " valor máximo");
        System.out.println(s2 + " valor mínimo");
        System.out.println("\ntipo int:\n" + i + " valor default");
        System.out.println(i1 + " valor máximo");
        System.out.println(i2 + " valor mínimo");
        System.out.println("\ntipo long:\n" + l + " valor default");
        System.out.println(l1 + " numero maior com a indicação do l no final");
        System.out.println("\ntipo float:\n" + f + " valor default");
        System.out.println(f1 + " ou " + f2 + " ou " + f3);
        System.out.println("\ntipo double:\n" + d + " valor default");
        System.out.println(d1 + " ou " + d2);
        System.out.println("\ntipo boolean:");
        System.out.println(boleano + " ou " + boleano1);
        System.out.println("\ntipo character:\n" + c + " default value - também chamado null character");
        System.out.println(c3 + " - representação em string do valor default de char");
        System.out.println(c1);
        System.out.println(c2 + " - representacão numerica do caracter '8' seguindo a tabela ASCII");

    }

}