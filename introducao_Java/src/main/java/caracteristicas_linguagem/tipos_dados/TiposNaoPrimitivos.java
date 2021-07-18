package caracteristicas_linguagem.tipos_dados;

public class TiposNaoPrimitivos {

    private String textos;
    // Sequencia de caracteres
    // default null

    private Number numeros;
    // numericos

    private Object objetos;
    // Objeto principal do Java, sendo a classe que todos os outros objetos se extendem. Todos os objetos vêm de Object.

    private Void v;
    // Classe vazia

    // através das classes podemos utilizar os metodos para a manipulação dos dados.


    public TiposNaoPrimitivos() {
    }

    public String getTextos() {
        return textos;
    }

    public void setTextos(String textos) {
        this.textos = textos;
    }

    public Number getNumeros() {
        return numeros;
    }

    public void setNumeros(Number numeros) {
        this.numeros = numeros;
    }

    public Object getObjetos() {
        return objetos;
    }

    public void setObjetos(Object objetos) {
        this.objetos = objetos;
    }

    public Void getV() {
        return v;
    }

    public void setV(Void v) {
        this.v = v;
    }
}