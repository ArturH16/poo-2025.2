public class Carro {
    String cor;
    int ano;
    String placa;
    int marcha;
    boolean parado;

    public boolean acelerar() {
        System.out.println("ACELERADO VRUM VRUM");
        return true;
    }

    public boolean frear() {
        System.out.println("FREANDO!");
        return true;
    }

    public void passar_marcha( int proxMarcha) {
        System.out.println("Marcha trocado\nNova marcha é igual a" + proxMarcha);
    }
}
