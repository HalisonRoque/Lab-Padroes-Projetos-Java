package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Strategy.*;

public class teste {
    //Singleton
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        //Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();


        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
