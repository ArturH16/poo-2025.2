public class TesteCarro {
    public static void main(String[] args) {
        Carro lamborguini = new Carro();
        lamborguini.cor = "Azul";
        lamborguini.ano = 2050;
        lamborguini.marcha = 5;
        lamborguini.parado = true;
        lamborguini.placa = "ABCD34983";
        lamborguini.acelerar();
        lamborguini.passar_marcha(5);
        lamborguini.frear();
        System.out.println(lamborguini.cor);

    }
}
