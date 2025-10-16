public class TesteAluno {
    public static void main(String[] args) {
        //Instaciando o primeiro objeto com um construtor de valor pré-definido
        Aluno BoraRacha = new Aluno();
        System.out.println(BoraRacha.curso);
        //Instaciando outro objeto com um construtor com lógica de atribuição
        Aluno Neymar = new Aluno("neymar","202420110695",17,"Informática");
    System.out.print("Nome do Aluno: " + Neymar.nome + "\nMatrícula: " + Neymar.matricula + "\nIdade do Aluno: " + Neymar.idade + "\nCurso: " + Neymar.curso + "\n");
        //Instanciando último objeto com um construtor que recebe um valor para o atributo idade
        Aluno AllanKelvin = new Aluno(43);
        System.out.print(AllanKelvin.idade);
    }
}