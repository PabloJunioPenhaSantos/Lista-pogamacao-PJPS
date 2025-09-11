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

    public String getLigada() {
       if (this.ligada == true) {
           return "ligada";
       } else  {
           return "desligada";
       }
    }

    public void setLigar(boolean ligada) {
        this.ligada = true;
    }


public void setdesligar(boolean ligada) {
    this.ligada = false;
}


public int getBrilho() {
        return this.brilho;
    }

    public void setReduzirBrilho(int valor) {
        if ((this.brilho - valor  )<0) {
            valor = 0 ;
            this.brilho = valor;
        }else  {
            this.brilho -= valor;
        }

    }

    public void setAumentarilho(int valor) {
        if ((this.brilho + valor  )>100) {
            valor = 100 ;
            this.brilho = valor;
        }else  {
            this.brilho += valor;
        }

    }


    public String getcor() {
        return this.cor;
    }



    public void falar() {
        System.out.println("\n  a lampada esta :"+ getLigada()+ "\n seu brilho e : "+getBrilho()+ "\n sua cor e :"+getcor());

    }
}

