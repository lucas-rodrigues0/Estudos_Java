package caracteristicas_linguagem.tipos_dados;

public class TiposPrimitivos {

    // Tipos primitivos não podem ser atribuidos a nulo (null)
    // exemplo - private int nullInt = null; <erro de compilação>
    // Possuem valores default caso não seja atribuido nenhum valor

    // Primitivos podem ser usados diretamente ou como atributos a um objeto ou classe

    // Segue a lista de tipos primitivos e suas capacidades de armazenação em memória

    // valores numéricos

    private byte numerico;
    // valores de até 8 bits
    // default 0

    private short curto;
    // valores de até 16 bits
    // default 0

    private int inteiro;
    // valores de até 32 bits
    // default 0

    private long longo;
    // valores de até 64 bits
    // default 0L

    private float pontoFlutuante;
    // valores de até 32 bits
    // default 0.0f

    private double duplo;
    // valores de até 64 bits
    // default 0.0d

    // valores não numéricos
    private boolean boleano;
    // valores de 1 bit (true ou false)
    // default false

    private char caracter;
    // valores alfanuméricos de "a-z, A-Z, 0-9 e caracteres especiais"
    // valores de até 16 bits
    // default '\u0000"

    // palavre reservada 'void' indicando que não há retorno - não é um tipo, apenas a indicação de não ter retorno

    // Construtor:

    public TiposPrimitivos() {
    }

    // Getters and Setters:

    public byte getNumerico() {
        return numerico;
    }

    public void setNumerico(byte numerico) {
        this.numerico = numerico;
    }

    public short getCurto() {
        return curto;
    }

    public void setCurto(short curto) {
        this.curto = curto;
    }

    public int getInteiro() {
        return inteiro;
    }

    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

    public long getLongo() {
        return longo;
    }

    public void setLongo(long longo) {
        this.longo = longo;
    }

    public float getPontoFlutuante() {
        return pontoFlutuante;
    }

    public void setPontoFlutuante(float pontoFlutuante) {
        this.pontoFlutuante = pontoFlutuante;
    }

    public double getDuplo() {
        return duplo;
    }

    public void setDuplo(double duplo) {
        this.duplo = duplo;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public boolean isBoleano() {
        return boleano;
    }

    public void setBoleano(boolean boleano) {
        this.boleano = boleano;
    }
}