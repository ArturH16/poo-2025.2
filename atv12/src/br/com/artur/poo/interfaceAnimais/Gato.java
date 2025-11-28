package br.com.artur.poo.interfaceAnimais;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    private String raca;

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public String amamentar() {
        return "O gato está amamentando";
    }

    public String emitirSom() {
        return "MIAUUUUUUUUUUUUUUUUUUU";
    }

    public void alimentar() {
        System.out.println( "O gato está comendo um peixe");
    }

    public void levarVeterinario() {
        System.out.println("O gato está sendo levado ao veterinário para ser castrado");
    }

    public void chamarVeterinario() {
        System.out.println("Corre veterinário que o gato tá no cio");
    }

    public void brincar() {
        System.out.println("O gato tá brincando com sua bolinha de lã");
    }

    public void levarPassear() {
        System.out.println("O gatinho está passeando com a sua gangue");
    }

    
}
