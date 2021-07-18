package caracteristicas_linguagem.lacos_repeticao.laco_while;

public class Whiles {
    /*
    O laço 'while' executa iteração enquanto a condição for verdadeira

    sintaxe:
    while (condicao) {
        // escopo do laço
     }

     A condição sempre será examinada antes da execução.

     A variação 'do while' iŕa primeiramente executar o código dentro do laço e em seguida verificar a condição

     sintaxe:
     do {
        // code block to be executed
      } while (condition);
     */

    public static void main(String[] args) {
        System.out.println("While");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("----------------");
        System.out.println("Do While");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);
    }
}
