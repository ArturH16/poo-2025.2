package br.com.artur.poo.lampada;

public  class TesteLampada2 {
    public static void main(String[] args) {
        //Instaciando primeiro objeto com um construtor com lógica de atribuição
        Lampada2 Led = new Lampada2("led",2015,true);
        System.out.print("Tipo da Lâmpada: " + Led.tipo +  "\n" + "Ano da Lâmpada: " + Led.ano + "\n" + "Estado da Lâmpada: " + Led.isLigada + "\n");
         //Instaciando outro objeto com um construtor de valor pré-definido
        Lampada2 LedDesligada = new Lampada2();
        System.out.println(LedDesligada.isLigada);
        LedDesligada.ligarLampada();
        System.out.println(LedDesligada.isLigada);
        //Instanciando último objeto com um construtor com lógica de atribuição apenas para o tipo da lâmpada
        Lampada2 Incandescente = new Lampada2("incandescente");
        System.out.println(Incandescente.tipo);





    }
}