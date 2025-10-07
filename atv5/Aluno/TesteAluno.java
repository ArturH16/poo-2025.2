public class TesteAluno {
    public static void main(String[] args) {
        Aluno mateus = new Aluno();
    mateus.nome = "Mateus";
    mateus.idade = 20;
    mateus.escola = "IFCE";
        System.out.println(mateus.ver_nota());
        System.out.println(mateus.aprovado());
        System.out.println(mateus.faltas());
    }

}
