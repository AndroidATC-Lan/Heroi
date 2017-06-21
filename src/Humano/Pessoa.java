package Humano;

/**
 * Created by zero on 20/06/17.
 */
public class Pessoa implements IPessoa {
    String nome;
    double peso;
    double velocidade;

    public Pessoa(String nome, double peso, double velocidade) {
        this.nome = nome;
        this.peso = peso;
        this.velocidade = velocidade;
    }

    private double calculaPassos(double peso, double velocidade) {
        return (peso * velocidade) / 100;
    }

    @Override
    public void andar() {
        System.out.println("Voce anda " + calculaPassos(peso, velocidade) * 5 + " Unidades");
    }

    @Override
    public void pular() {
        System.out.println("Voce pula " + calculaPassos(peso, velocidade) * 2 + " Unidades");
    }

    @Override
    public void correr() {
        System.out.println("Voce corre " + calculaPassos(peso, velocidade) * 10 + " Unidades");
    }

    @Override
    public void ver() {
        System.out.println("Voce ve poucas coisas");
    }

    @Override
    public void apertoDeMao() {
        System.out.println("Aperto de mao tranquilo");
    }
}
