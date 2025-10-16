public class TesteCarro2 {
    public static void main(String[] args) {
        //Instaciando o primeiro objeto com um construtor de valor pré-definido
        Carro2 Huracan = new Carro2();
        System.out.println(Huracan.marca);
        //Instaciando outro objeto com um construtor com lógica de atribuição
        Carro2 Bmw320 = new Carro2("BMW", "320  MI sport", 2022, "ABCE-3945",12.8);
        System.out.println("MARCA DO CARRO: " + Bmw320.marca + "\nMODELO DO CARRO: " + Bmw320.modelo  +"\nANO DO CARRO: " + Bmw320.ano  + "\nPLACA DO CARRO: "+ Bmw320.placa + "\nCONSUMO POR KM: " + Bmw320.consumoPorKm );
        //Instanciando último objeto com um construtor com lógica de atribuição apenas para o ano do carro
        Carro2 Fusca = new Carro2(1974);
        System.out.println(Fusca.ano);


         
        

    }
    
}
