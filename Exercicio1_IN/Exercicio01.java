package Exercicio1_IN;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("BEM-VINDE À FABRICA DE LÂMPADAS FLOURESCENTES E INCANDESCENTES! ");
        System.out.println("QUAL TIPO DE LÂMPADA DESEJA CONSTRUIR? DIGITE 'F' OU 'I': ");
        String tipoLampada = entrada.next();

        if(tipoLampada.equalsIgnoreCase("I")) {
            Incandescente novaLampada = new Incandescente();
            novaLampada.construir("Incandescente");
            novaLampada.ligar();
            novaLampada.desligar();

        } else if (tipoLampada.equalsIgnoreCase("F")) {
            Fluorescente novaLampada = new Fluorescente();
            novaLampada.construir("Flourescente");
            novaLampada.ligar();
            novaLampada.desligar();
        } else {
            System.out.println("Comando inválido.");
        }

    }
}
