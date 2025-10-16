public class Carro2 {
    String marca;
    String modelo;
    int ano;
    String placa; 
    double consumoPorKm;
    public Carro2() {
        this.marca = "Lamborguini";
    }
    public Carro2(String marca, String modelo, int ano, String placa, double consumoPorKm) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.consumoPorKm = consumoPorKm;
    }

    public Carro2(int ano) {
        this.ano = ano;
    }
    
}
