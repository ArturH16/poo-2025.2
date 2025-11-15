package br.com.artur.poo.finaL;
import java.util.Scanner;

public class TesteArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor para a base do retângulo: ");
        double baseRet = scanner.nextDouble();
        System.out.print("Insira um valor para a altura do retângulo: ");
        double alturaRet = scanner.nextDouble();
        System.out.println("A área do retângulo é: " + Area.calcularRetangulo(baseRet, alturaRet));



        System.out.print("Insira um valor para a base do triângulo: ");
        double baseTri = scanner.nextDouble();
        System.out.print("Insira um valor para a altura do triângulo: ");
        double alturaTri = scanner.nextDouble();
        System.out.println("A área do retângulo é: " + Area.calcularTriangulo(baseTri, alturaTri));



        System.out.print("Insira um valor para o raio do círculo: ");
        double raio = scanner.nextDouble();
        System.out.println("A área do círculo é: " + Area.calcularCirculo(raio));
        scanner.close();



    }

    
}
