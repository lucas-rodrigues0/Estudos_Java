package caracteristicas_linguagem.tipos_dados;

public class Tipagem {

    // Tipagem estática:
    // tipos são verificados em tempo de compilação e previne erros de tipos atribuidos aos dados.

    // exemplo:
    // Integer inteiro = 'abcdefgh'  (ERROR --> compilação)


    // Tipagem forte:
    // o tipo atribuido a uma variável não pode ser modificadp posteriormente.

    // exempĺo:
    // String texto = '12345'; (OK --> inicializado com texto numérico)
    // texto = 12345; (ERROR --> tentar modificar o tipo string para o numérico não é permitido)


    // Tipagem Inferida:
    // apartir da versão Java 10 podemos utilizar a palavra reservada 'var' que irá atribuir o tipo
    // de acordo com o valor de sua inicialização.

    // exemplo:
    // var numero = Integer.valueOf("12345");
    // var texto = "Atribui automaticamente o tipo string";
}

