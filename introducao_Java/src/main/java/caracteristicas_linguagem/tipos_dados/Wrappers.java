package caracteristicas_linguagem.tipos_dados;

public class Wrappers {
    // São objetos que representam os tipos primitivos
    // estão dentro do pacote java.lang
    // por serem um objeto podem ser atribuidos a nulo (null)

    // possuem a mesma capacidade de armazenamento dos tipos primitivos a que representam
    // seguindo os tipos primitivos temos as seguintes denominações

    // Autoboxing -> há uma auto inicialização desses objetos
    private Byte numerico;

    private Short curto;

    private Integer inteiro;

    private Long longo;

    private Float pontoFlutuante;

    private Double duplo;

    // valores não numéricos
    private Boolean boleano;

    private Character caracter;

    // Unboxing -> dado um tipo primitivo que irá receber a atribuição através do construtor do objeto wrapper que representa tal dado.
    // ex: int i = new.Integer(3); ou int inteiro = Integer.valueOf(5);
    //     boolean b1 = Boolean.TRUE; ou boolean b1 = Boolean.getBoolean(false);


    public Wrappers() {
    }

    public Byte getNumerico() {
        return numerico;
    }

    public void setNumerico(Byte numerico) {
        this.numerico = numerico;
    }

    public Short getCurto() {
        return curto;
    }

    public void setCurto(Short curto) {
        this.curto = curto;
    }

    public Integer getInteiro() {
        return inteiro;
    }

    public void setInteiro(Integer inteiro) {
        this.inteiro = inteiro;
    }

    public Long getLongo() {
        return longo;
    }

    public void setLongo(Long longo) {
        this.longo = longo;
    }

    public Float getPontoFlutuante() {
        return pontoFlutuante;
    }

    public void setPontoFlutuante(Float pontoFlutuante) {
        this.pontoFlutuante = pontoFlutuante;
    }

    public Double getDuplo() {
        return duplo;
    }

    public void setDuplo(Double duplo) {
        this.duplo = duplo;
    }

    public Boolean getBoleano() {
        return boleano;
    }

    public void setBoleano(Boolean boleano) {
        this.boleano = boleano;
    }

    public Character getCaracter() {
        return caracter;
    }

    public void setCaracter(Character caracter) {
        this.caracter = caracter;
    }
}