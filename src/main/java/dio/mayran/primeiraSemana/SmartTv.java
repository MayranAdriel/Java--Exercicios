package dio.mayran.primeiraSemana;

public class SmartTv {
    int canal = 1;
    boolean ligada = true;
    int volume = 20;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void escolherCanal(int novoCanal) {
        canal = novoCanal;
    }


}
