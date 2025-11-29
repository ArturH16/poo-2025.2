package br.com.artur.poo.interfaceAnimais;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    private String tamanho;
    private String raca;

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String amamentar() {
        return "O cachorro está usufruindo do leite materno da mama dog";
    }

    public String emitirSom() {
        return "AUUUUUUUUUUUUUUUUUUUUUUU";
    }

    public void alimentar() {
        System.out.println("O cachorro está comendo sua ração premium");
    }

    public void levarVeterinario() {
        System.out.println("O cachorro está sendo levado para tomar a vacina antirrábica");
    }

    public void chamarVeterinario() {
        System.out.println("Venha buscar o cachorro Doctor!");
    }

    public void brincar() {
        System.out.println("O cachorro está brincando de destroçar seu urso de pelúcia");
    }

    public void levarPassear() {
        System.out.println("O cachorro está passeando com seu dono");
    }
}
