package dio.mayran.primeiraSemana;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.escolherCanal(34);

        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.desligar();

        System.out.println("A TV está ligada? " + smartTv.ligada);
    }
}
