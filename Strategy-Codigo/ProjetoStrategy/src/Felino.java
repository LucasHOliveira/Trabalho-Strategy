abstract public class Felino {

    protected CorrerStrategy correrStrategy;
    
    abstract public void display();
    abstract public void rugir();

    public void setCorrerStrategy( CorrerStrategy correrStrategy ){

        this.correrStrategy = correrStrategy;
    }
    
    public void performarCorrer(){

        correrStrategy.correr();
    }
    
    public static void main( String args[] ){

        Felino leao = new Leao();
        Felino leopardo = new Leopardo();
        Felino tigreToy = new TigreToy();

        leao.performarCorrer(); /* Correr curta distância, porém com o objetivo bem próximo. */
        leopardo.performarCorrer(); /* Correr longa distância, caso necessário. */
        tigreToy.performarCorrer(); /* Sou um brinquedo, não corro. */

        /* LEOPARDO DE BARRIGA CHEIA, CORRENDO COMO LEÃO PARA PEGAR A JANTA! */
        leopardo.setCorrerStrategy( new CorrerCurtaDist() );
        leopardo.performarCorrer(); /* Correr curta distância, porém com o objetivo bem próximo. */
    }
}