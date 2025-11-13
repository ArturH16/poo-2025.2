package br.com.artur.poo.polimorfismo;

public class TesteProduto {
    public static void main(String[] args) {
        Eletronico lavaRoupas = new Eletronico(120, 5, "5403658954", "lava roupas brastemp", 101, 40);
        lavaRoupas.mostrarGarantia();
        lavaRoupas.mostrarGarantia(2025);
        lavaRoupas.mostrarGarantia(50, "Antonio");
        lavaRoupas.mostrarInformacoes();
        Roupa blusaCeara = new Roupa("blusa tamanho G Ceará", true, "49032", "blusa principal temporada 2025 Ceará", 230, 0);
        System.out.println(blusaCeara.verDisponibilidade());
        blusaCeara.verDisponibilidade("13/11/2025");
        blusaCeara.verDisponibilidade(11);
        blusaCeara.mostrarInformacoes();      
    }
    
}
