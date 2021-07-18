package caracteristicas_linguagem.operadores;

public class OperadoresLogicos {
    /*
    Os Operdaores lógicos são utilizados para realização de condicionais.

    mais detalhes no pacote de lacos_repeticao há uma parte sobre condicionais.
     */

    public static void main(String[] args) {
        final int a = 4;
        final int b = 9;
        final boolean t = true;
        final boolean f = false;

        if (t) {
            System.out.println("t == a true e isso será exibido!");
            System.out.println("A próxima operação não será executada!");
            if (f) {
                System.out.println("Não será exibido!!!");
            }
        }

        System.out.println("---------------");
        System.out.println("Através dos operadores lógicos:");
        if (a < b) {
            System.out.println("4 é menor que 9! Será exibido!");
        }

        System.out.println("As próximas operações não serão executadas!");
        if (a > b) {
            System.out.println("4 não é maior que 9! Não será exibido!");
        }

        if (a == b) {
            System.out.println("4 não é igual a 9! Não será exibido!");
        }

        if (a != b) {
            System.out.println("4 é diferente de 9! Será exibido!");
        }

        System.out.println("---------------");
        if (t) System.out.println("Condicionais podem ser escritas em uma linha");

        if (f) {
            System.out.println("Não será exibido!!!");
        } else {
            System.out.println("A palavra reservada 'else' será executada caso o 'if' seja negativo!");
        }

        if (f) {
            System.out.println("Não será exibido!!!");
        } else if (t) {
            System.out.println("Pode-se aninhar outro 'if' após um 'else' para gerar outras condicionantes");
        } else {
            System.out.println("Não será exibido!!!");
        }

        System.out.println("---------------");
        if (t && a < b) {
            System.out.println("Com os operadores lógicos");
        }
        if (t || a > b) {
            System.out.println("Uma condição não é verdadeira e Não será exibido");
        }
    }

    /*
    Os operadores lógicos seguem a relação da tabela de verdade do raciocinio lógico:

          |-------|-------|-------|
          |   P   |   Q   |P <-> Q|
          |-------|-------|-------|
          |   V   |   V   |   V   |
          |-------|-------|-------|
          |   V   |   F   |   F   |
          |-------|-------|-------|
          |   F   |   V   |   F   |
          |-------|-------|-------|
          |   F   |   F   |   V   |
          |-------|-------|-------|

     */

    /*
    Short circuit e Non short circuit:

    os operadores lógicos quando estão duplicados (&& ou ||) são chamados de Short circuit
    e caso a primeira condição já negar a relação a segunda condição não será nem executada.

    Caso não sejam duplicados ( | ou & ) são chamados de Non short circuit. Nesse caso as duas condições
    serão executadas mesmo que a primeira já tenha definido a negação
     */
}
