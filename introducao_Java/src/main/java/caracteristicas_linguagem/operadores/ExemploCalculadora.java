package caracteristicas_linguagem.operadores;

public class ExemploCalculadora {
    public static void main(String[] args) {

        OperadoresAritimeticos calculadora = new OperadoresAritimeticos();

        System.out.println("Soma de 5 e 2: " + calculadora.somar(5,2));
        System.out.println("Subtração de 5 e 2: " + calculadora.subtrair(5,2));
        System.out.println("multiplicação de 5 e 2: " + calculadora.multiplicar(5,2));
        System.out.println("divisão de 5 e 2: " + calculadora.dividir(5,2));
        System.out.println("resto de 5 e 2: " + calculadora.resto(5,2));

        System.out.println("------------------");
        System.out.println("preferencia de operações");

        System.out.println("2 + 3 * 2 = " + (2 + 3 * 2));
        System.out.println("(2 + 3) * 2 = " + ((2 + 3) * 2));
    }
}
