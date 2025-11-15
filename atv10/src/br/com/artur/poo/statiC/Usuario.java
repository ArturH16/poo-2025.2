package br.com.artur.poo.statiC;
public class Usuario {
    public String nome;
    public int idade;
    public String email;
    public static int numUsuarios;

    Usuario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        numUsuarios ++;
        
    }

    public static int getContador() {
        return numUsuarios;
    }
    
}
