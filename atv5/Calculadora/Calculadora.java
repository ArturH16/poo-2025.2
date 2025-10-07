public class Calculadora {
    String tipo;
    String marca;
    boolean ligada;
    double res;
    public double somar(double n1, double n2) {
        res = n1 + n2;
        return res;
    }
    public double subtrair(double n1, double n2) {
        res = n1 - n2;
        return res;
    }

    public double multiplicar(double n1, double n2) {
        res = n1 * n2;
        return res;
    }
    public double dividir(double n1, double n2) {
        res = n1 / n2;
        return res;
    }

    public double exponenciar(double n1, double n2) {
        res = Math.pow(n1, n2);
        return res;
    }

}
