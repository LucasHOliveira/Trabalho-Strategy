public class Leao extends Felino {

    @Override
    public void display(){

        System.out.println( "Le�o a vista" );
    }

    @Override
    public void rugir(){

        System.out.println( "Urghhhhh!" );
    }
    
    public Leao(){

        correrStrategy = new CorrerCurtaDist();
    }
}