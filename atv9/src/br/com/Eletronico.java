package br.com;

public class Eletronico {
    private double voltagem;
    private int garantiaMeses;


    public void mostrarGarantia() {
        System.out.println("A garantia em meses é " +  this.garantiaMeses);
    }

    public void mostrarGarantia( int ano) {
        int garantiaAno = garantiaMeses / ano;
        System.out.println("A garantia em anos corresponde a " + garantiaAno);
    }

    public void mostrarGarantia(int dias) {
        int garantiaDias = garantiaMeses * dias;
        System.out.println("A garantia em dias corresponde a " + garantiaDias);
    }


    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getVoltagem() {
        return this.voltagem;
    }

     public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return this.garantiaMeses;
    }
    
}
