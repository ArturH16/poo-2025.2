public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.ligada = true;
        calculadora.marca = "BMW";
        calculadora.tipo = "Científica";
          double soma =calculadora.somar(5,4);
          double subtracao = calculadora.subtrair(4,1);
        double  multiplicacao = calculadora.multiplicar(4,1);
        double divisao = calculadora.dividir(4,1);
        double exponenciacao = calculadora.exponenciar(4,1);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(exponenciacao);

    }

}
