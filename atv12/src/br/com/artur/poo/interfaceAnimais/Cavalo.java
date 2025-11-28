package br.com.artur.poo.interfaceAnimais;

public class Cavalo extends Mamifero implements AnimalDomesticado {
    public String amamentar() {
        return "O little Horse está amamentando";
    }

    public String emitirSom() {
        return "Pocoto pocoto pocoto";
    }

    public void alimentar() {
        System.out.println("O cavalo está comendo esterco");
    }

    public void levarVeterinario() {
        System.out.println("O cavalo está sendo levado para o veterinário");
    }

    public void chamarVeterinario() {
        System.out.println("O veterinário foi chamado!");
    }

    


    
}
