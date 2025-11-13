package br.com.artur.poo.polimorfismo;

public class Eletronico extends Produto {
    private double voltagem;
    private int garantiaMeses;

    Eletronico(double voltagem,int garantiaMeses,String codigo, String nome, double preco, int quantidadeEstoque) {
        super(codigo,nome,preco,quantidadeEstoque);
        setVoltagem(voltagem);
        setGarantiaMeses(garantiaMeses);

    }


    @Override 
    public void mostrarInformacoes() {
        System.out.println("O nome do eletrônico é " + super.getNome() + "\nO código do eletrônico é " + super.getCodigo() + "\nO preço do eletrônico é " + super.getPreco() + "\nA quantidade em estoque é " + super.getQuantidadeEstoquetCodigo() + "\nA voltagem do eletrônico é " + this.voltagem + "\nA garantia em meses do produto é " + this.garantiaMeses );
    }


    public void mostrarGarantia() {
        System.out.println("A garantia em meses é " +  this.garantiaMeses);
    }

    public void mostrarGarantia( int ano) {
        System.out.println("A garantia em meses corresponde a " + this.garantiaMeses + " meses para o ano de " + ano);
    }

    public void mostrarGarantia(int dias, String nomeConsumidor) {
        int garantiaDias = garantiaMeses * dias;
        System.out.println("A garantia em dias corresponde a " + garantiaDias + " dias, " + nomeConsumidor);
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
