package caracteristicas_linguagem.modificadores_acesso.exemplos;

public class ClasseEstatica {

    public String naoEstatico = "Não sou estatico";
    public static String estatico = "Sou estatico";

    public String getNaoEstatico() {
        return naoEstatico;
    }

    public void setNaoEstatico(String naoEstatico) {
        this.naoEstatico = naoEstatico;
    }

    public String getEstatico() {
        return estatico;
    }

    public void setEstatico(String estatico) {
        ClasseEstatica.estatico = estatico;
    }

    public static String metodoEstatico() {
        return "Sou um método Static! Não preciso ser instanciado.";
    }
}
