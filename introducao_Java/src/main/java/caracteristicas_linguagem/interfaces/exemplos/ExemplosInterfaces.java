package caracteristicas_linguagem.interfaces.exemplos;

import caracteristicas_linguagem.interfaces.HerancaMultipla;
import caracteristicas_linguagem.interfaces.MetodoAbstrato;
import caracteristicas_linguagem.interfaces.MetodoDefault;

public class ExemplosInterfaces {
    public static void main(String[] args) {
        MetodoAbstrato metodoAbstrato = new MetodoAbstrato();
        MetodoDefault metodoDefault = new MetodoDefault();
        HerancaMultipla herancaMultipla = new HerancaMultipla();

        System.out.println(metodoAbstrato.oQueSou());
        System.out.println("");
        metodoDefault.descreverInterface();
        System.out.println("");
        System.out.println(herancaMultipla.oQueSou());
        herancaMultipla.descreverInterface();
        System.out.println("");
        herancaMultipla.metodoComMesmoNome();
    }
}
