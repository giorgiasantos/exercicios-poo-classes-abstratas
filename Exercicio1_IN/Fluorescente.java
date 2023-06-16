package Exercicio1_IN;

public class Fluorescente extends FabricaDeLampada implements Lampada{
    public void ligar() {
        System.out.println("A LÂMPADA ESTÁ LIGADA.");
    }

    public void desligar() {
        System.out.println("A LÂMPADA ESTÁ DESLIGADA.");
    }

    public void construir(String tipoDeLampada) {
        System.out.println("Uma lâmpada nova foi criada: " +tipoDeLampada);
    }

}
