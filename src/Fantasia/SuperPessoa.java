package Fantasia;

import Humano.Pessoa;

/**
 * Created by zero on 20/06/17.
 */
public class SuperPessoa extends Pessoa {

    Poder poder;

    public SuperPessoa(String nome, double peso, double velocidade, Poder poder) {
        super(nome, peso - 20, velocidade * 20);
        this.poder = poder;
    }

    public void voar() {
        System.out.println("Voce voa");
    }

    public String getPoder() {
        return poder.poder.toString();
    }

    public void atacar() {
        System.out.println("Voce ataca com: " + getPoder() + " e seu dano seria: " + poder.pegaAtaque());
    }

    public void defender() {
        System.out.println("Voce defende com: " + poder.pegaDefesa());
    }
}
