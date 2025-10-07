public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.tipoLampada = "LED";
        lampada.ano = 1945;
        lampada.ligada = false;
        lampada.ligar();
        System.out.println(lampada.ligada);
        lampada.desligar();
        System.out.println(lampada.ligada);
    }
}
