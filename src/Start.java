import Fantasia.Poder;
import Fantasia.Poderes;
import Fantasia.SuperPessoa;
import Humano.Pessoa;

/**
 * Created by zero on 20/06/17.
 */
public class Start {
    public static void main(String[] args) {
        System.out.println("Iniciando Programa java");

        Pessoa diego = new Pessoa("Diego", 75, 10);
        diego.andar();
        diego.pular();
        diego.ver();

        SuperPessoa sDiego = new SuperPessoa("Diego", 75, 10, new Poder(Poderes.FOGO, 50));
        sDiego.andar();
        sDiego.pular();
        sDiego.voar();
        sDiego.atacar();
        sDiego.defender();

    }
}
