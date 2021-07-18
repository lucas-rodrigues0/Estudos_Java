package caracteristicas_linguagem.lacos_repeticao.condicionais;

public class Switchs {

    /*
    A condicional switch estabelece casos possíveis para uma expressão que é avaliada.

    a sintaxe do switch:

    switch(expressão) {
        case x:
            // caso a expressão seja x
            break;
        case y:
            // caso a expressão seja y
            break;
        default:
            // caso nenhuma satisfaça
      }

      o 'break' em cada caso irá interromper a verificação dos próximos casos

      o caso default se nenhuma condição anterior for verdadeira
     */

    public static void main(String[] args) {
        int dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}
