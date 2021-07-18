package caracteristicas_linguagem.operadores;

public class OperadoresAritimeticos {
    // Os operadores matemáticos apresentados pelos métodos a seguir

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        return a / b;
    }

    public int resto(int a, int b) {
        return a % b;
    }

    /*
    A ordem de preceddencia dos operadores é:

    () , [] --> para agrupar expressões
    * , / --> multiplicação e divisão
    + , - --> adição e subtração
    = --> atribuição
    ==, <, >, <=, >=, != --> relacionais
    ! --> lógico de negação
    && --> lógico 'e'
    || --> lógico 'ou'

     */
    /*
    Formas simplificadas de operações com variáveis:

    var variavel;
    variavel -= 1 é igual a operação variavel = variavel - 1
    variavel *= 2 é igual a operação variavel = variavel * 2

    incremento e decremento de uma unidade:
    há uma leve diferença em
    variavel++  --> primeiro verifica-se a variável e depois incrementa
    variavel--  --> primeiro verifica-se a variável e depois decrementa
    ++variavel  --> primeiro incrementa e depois  verifica-se a variável
    __variavel  --> primeiro decrementa e depois  verifica-se a variável
     */
}
