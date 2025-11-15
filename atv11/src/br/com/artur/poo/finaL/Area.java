package br.com.artur.poo.finaL;

public  final class  Area {
    public static final double pi = Math.PI;

    public  static final double calcularRetangulo( double base, double altura) {

            return base * altura;

    }


    public static final double calcularTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static final double calcularCirculo(double raio) {
        return pi * Math.pow(raio,2);
    }
    
}
