package Exercicio1_IN;

public interface Lampada {

    public default void ligar() {
        System.out.println("A LÂMPADA ESTÁ LIGADA.");
    }

    public default void desligar() {
        System.out.println("A LÂMPADA ESTÁ DESLIGADA.");
    }

}
