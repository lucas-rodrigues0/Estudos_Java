package caracteristicas_linguagem.lacos_repeticao.laco_for;

public class Fors {

    /*
    A sintaxe padrão do 'for' é

    for (expressão 1; expressão 2; expressão 3) {
        // escopo do laço
    }

    sendo
    a expressão 1 --> executada uma vez antes do código no escopo do laço
    a expressão 2 --> defini a condição para execução do código no laço
    a expressão 3 --> executada sempre depois do código do laço ser executado
     */

    /*
    o laço 'for each' que itera sobre um array
    A sintaxe:

    for (tipo variavelDoLaço : arrayQueVaiIterar) {
        // escopo do laço
    }
     */

    public static void main(String[] args) {
        System.out.println("For");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        /*
        exp 1 --> primeiramente inicia o lço estabelecendo a variável i com o valor de 0,
        exp 2 --> define que a condição para o lçao continuar é que o valor de i ser menor que 5,
        exp 3 --> e a cada laço o valor de i é incrementado por 1
         */

        System.out.println("----------------");
        System.out.println("For each");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
