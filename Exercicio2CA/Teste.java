package Exercicio2CA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 10;
        retangulo.lado = 5;
        retangulo.calcularPerimetro();
        retangulo.calcularArea();

        Retangulo retangulo1 = new Retangulo();
        retangulo1.lado = 8;
        retangulo1.altura = 15;

        Circulo circulo = new Circulo();
        circulo.raio = 5;
        circulo.calcularArea();
        circulo.calcularPerimetro();

        Circulo circulo1 = new Circulo();
        circulo1.raio = 20;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;
        System.out.println("O lado do quadrado é: " + quadrado.lado);

        System.out.println("----------------------------------");

        List<Object> lista = new ArrayList<>();
        lista.add(quadrado);
        lista.add(circulo);
        lista.add(retangulo);
        lista.add(retangulo1);
        lista.add(circulo1);

        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }
}
