package br.com.artur.poo.polimorfismo;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;


    Produto(String codigo, String nome, double preco, int quantidadeEstoque) {
        setCodigo(codigo);
        setNome(nome);
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);  
    }

    public void mostrarInformacoes() {
        System.out.println("O nome do produto é " + this.nome + "\nO código do produto é " + this.codigo + "\nO preço do produto é " + this.preco + "\nA quantidade em estoque é " + this.quantidadeEstoque);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return this.codigo ;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return this.nome ;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getpreco() {
        return this.preco ;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoquetCodigo() {
        return this.quantidadeEstoque;
    }
    

}
