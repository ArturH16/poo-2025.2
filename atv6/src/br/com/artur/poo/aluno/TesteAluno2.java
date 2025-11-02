package br.com.artur.poo.aluno;

public class TesteAluno2 {
    public static void main(String[] args) {
        //Instaciando o primeiro objeto com um construtor de valor pré-definido
        Aluno2 BoraRacha = new Aluno2();
        System.out.println(BoraRacha.curso);
        //Instaciando outro objeto com um construtor com lógica de atribuição
        Aluno2 Neymar = new Aluno2("neymar","202420110695",17,"Informática");
    System.out.print("Nome do Aluno: " + Neymar.nome + "\nMatrícula: " + Neymar.matricula + "\nIdade do Aluno: " + Neymar.idade + "\nCurso: " + Neymar.curso + "\n");
        //Instanciando último objeto com um construtor que recebe um valor para o atributo idade
        Aluno2 AllanKelvin = new Aluno2(43);
        System.out.print(AllanKelvin.idade);
    }
}