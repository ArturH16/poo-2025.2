package br.com.artur.poo.statiC;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario pessoa1 = new Usuario("artur", 17, "holanda.artur62@aluno.ifce.edu.br");

        Usuario pessoa2 = new Usuario("lucas", 17, "lucas23@gmail.com");
        
        Usuario pessoa3 = new Usuario("Pedro", 45, "pedro44@gmail.com");

        Usuario pessoa4 = new Usuario("Allan Kelvin", 38, "allan.kelvin@gmail.com");
        System.out.println("O número de usuários cadastrados até o momento corresponde a " + Usuario.getContador());
        
        
    }
    
}
