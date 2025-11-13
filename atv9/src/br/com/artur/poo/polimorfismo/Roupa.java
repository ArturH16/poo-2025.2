package br.com.artur.poo.polimorfismo;

public class Roupa extends Produto {
    private String tipo;
    private boolean isEstoque;

    Roupa(String tipo, boolean isEstoque,String codigo, String nome, double preco, int quantidadeEstoque) {
        super(codigo, nome, preco, quantidadeEstoque);
        setTipo(tipo);
        setIsEstoque(isEstoque);
    }


    @Override
    public void mostrarInformacoes() {
        System.out.println("O tipo da roupa é " + this.tipo);
        if (this.isEstoque) {
            System.out.println("O produto está em estoque");

        } else {
            System.out.println("O produto está em falta");
        }
    }

    public 

    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo( String tipo) {
        this.tipo = tipo;
    }

    public boolean getIsEstoque() {
        return this.isEstoque;
    }

    public void setIsEstoque(boolean isEstoque) {
        this.isEstoque = isEstoque;
    }
}
