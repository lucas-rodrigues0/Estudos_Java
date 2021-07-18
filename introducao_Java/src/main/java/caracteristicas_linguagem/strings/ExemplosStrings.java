package caracteristicas_linguagem.strings;

public class ExemplosStrings {
    public static void main(String[] args) {
        // Alguns exemplos de métodos com strings
        var nome = "Lucas";
        var sobreNome = "Rodrigues";
        final var nomeCompleto = nome + " " + sobreNome;

        System.out.println(nome);
        System.out.println("Nome usuário: " + nome);
        System.out.println("Nome completo: " + nomeCompleto);

        var string = new String(" Um Exemplo de uma String! ");
        System.out.println("Caracter na posição 4: " + string.charAt(4));
        System.out.println("Quantidade de caracteres: " + string.length());
        System.out.println("Sem Trim [" + string + "]");
        System.out.println("Com Trim [" + string.trim() + "]");
        System.out.println("Lower case" + string.toLowerCase());
        System.out.println("Upper case" + string.toUpperCase());
        System.out.println("Comtém 'x'? - " + string.contains("x"));
        System.out.println("Contém 'X'? - " + string.contains("X"));
        System.out.println("Replace S por $ -" + string.replace("S", "$"));
        System.out.println("Equals? - " + string.equals("Um Exemplo de uma String!"));
        System.out.println("Equals ignore case? - " + string.equalsIgnoreCase("Um eXeMPlo dE uma STRiNg!"));
        System.out.println("Substring(1, 7) - " + string.substring(1, 7));
        System.out.println("ABCDEFG".toCharArray());
        final var parteString = "Aula de Java".split(" ");
        System.out.println(parteString[0]);
        System.out.println(parteString[2]);
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 sem numeros".replaceAll("[0-9]", "#"));

        // outras formas de concatenação de strings:

        // String.format
        System.out.println("\nUsando String.format:");
        final var message = String.format("O nome completo de %s é %s ", nome, nomeCompleto);
        System.out.println(message);

        System.out.println(String.format("numero %.2f ", 1.29384d));

        //StringBuilder
        System.out.println("\nUsando StringBuilder:");
        var ultimoNome = " de Castro";
        final var builder = new StringBuilder(nome);
        System.out.println(builder.append(ultimoNome));

        final var reverse = builder.reverse();
        System.out.println(reverse);

        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);
    }
}
