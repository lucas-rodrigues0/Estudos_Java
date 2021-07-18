package caracteristicas_linguagem.modificadores_acesso.exemplos;

public class AlgumaClasseQueEstendeAbstrata extends ClasseAbstrata {

    private String nome;
    private Integer numeral;

    public AlgumaClasseQueEstendeAbstrata(final String nome, final Integer numeral) {
        this.nome = nome;
        this.numeral = numeral;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Integer numeral() {
        return numeral;
    }

    @Override
    public String toString() {
        return "AlgumaClasse{" +
                "nome='" + nome + '\'' +
                ", numeral=" + numeral +
                '}';
    }
}
