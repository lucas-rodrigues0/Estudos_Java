package caracteristicas_linguagem.lacos_repeticao.condicionais;

public class Ifs {
    /*
    A palavra reservada 'if' e 'else' serão utilizadas para estbelecer essas condicionais, que devem sempre retornar um
    valor booleano para assim executar (true) ou não (false) o que estiver no escopo da condicional.

    A expressão lógica pode ser simpes ou composta. Sendo composta com a utilização dos operadores
    lógicos apresentados no pacote operadores.

    A sintaxe:
    if, else if, else

    if(expressão lógica que retorna um booleano) {
        // escopo da condicional
    } else if (expressão lógica) {
        // escopo da segunda condicional
    } else {
        // caso nenhuma condicional anterior seja verdadeira
    }

     */

    /*
    O 'If ternário' simplifica a sintaxe da condicional e tem o mesmo efeito.

    A sintaxe:
    () ? :

    var variavel = (expressão lógica) ? 'Caso seja verdadeira' : 'caso seja falsa';
     */

    public static void main(String[] args) {
        String exemplo1;
        if (4 > 9) {
            exemplo1 = "Sou verdadeiro";
        } else {
            exemplo1 = "Sou falso";
        }
        System.out.println(exemplo1);

        String exemplo2 = (4 < 9) ? "Sou verdadeiro" : "Sou falso";
        System.out.println(exemplo2);
    }
}
