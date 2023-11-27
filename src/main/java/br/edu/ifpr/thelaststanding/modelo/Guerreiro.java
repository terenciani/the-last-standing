package br.edu.ifpr.thelaststanding.modelo;

public class Guerreiro extends Personagem {

    private int forca;
    private int velocidade;

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Guerreiro{" + "nome=" + nome + ", pontosVida=" + pontosVida + ", pontosAtaque=" + pontosAtaque + ", pontosDefesa=" + pontosDefesa + ", forca=" + forca + ", velocidade=" + velocidade + '}';
    }

}
