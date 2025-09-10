package Lampada;

public class Lampada {

    private boolean ligada;
    private int brilho = 0;
    private String cor = "";

    public Lampada() {
        this.ligada = false;
        this.brilho = 0;
        this.cor = "branca";


    }

    public Lampada(boolean ligada, int brilho, String cor) {
        this.ligada = ligada;
        this.brilho = brilho;
        this.cor = cor;
    }

    public boolean getligar() {
        return !this.ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public boolean getdesligar() {
        return this.ligada;
    }

    public int getBrilho() {
        return this.brilho;
    }

    public String getcor() {
        return this.cor;
    }
    public void setBrilho(int brilho) {
        this.brilho=brilho;
    }

}

