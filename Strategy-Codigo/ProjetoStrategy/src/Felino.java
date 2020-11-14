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

        leao.performarCorrer(); /* Correr curta dist�ncia, por�m com o objetivo bem pr�ximo. */
        leopardo.performarCorrer(); /* Correr longa dist�ncia, caso necess�rio. */
        tigreToy.performarCorrer(); /* Sou um brinquedo, n�o corro. */

        /* LEOPARDO DE BARRIGA CHEIA, CORRENDO COMO LE�O PARA PEGAR A JANTA! */
        leopardo.setCorrerStrategy( new CorrerCurtaDist() );
        leopardo.performarCorrer(); /* Correr curta dist�ncia, por�m com o objetivo bem pr�ximo. */
    }
}