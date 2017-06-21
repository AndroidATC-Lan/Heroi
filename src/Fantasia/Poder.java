package Fantasia;

/**
 * Created by zero on 20/06/17.
 */
public class Poder {
    Enum poder;
    int forca;

    public Poder(Enum poder, int forca) {
        this.poder = poder;
        this.forca = forca;
    }

    public double pegaAtaque() {
       return calculaAtaque();
    }

    public double pegaDefesa() {
        return calculaDefesa();
    }

    private double calculaAtaque() {
        return forca * 4;
    }

    private double calculaDefesa() {
        return forca * 3.5;
    }
}
