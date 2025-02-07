import java.io.IOException;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println( "Tv Ligada ? " + smartTv.ligada);
        System.out.println( "Canal Aual: " + smartTv.canal);
        System.out.println( "Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(41);
        System.out.println( "Canal Aual: " + smartTv.canal);

        smartTv.ligar ();
        System.out.println( "Novo Status --> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println( "Novo Status --> Tv Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume ();
        System.out.println( "Novo status --> Volume Atual: " + smartTv.volume);


    }
}