package Exercicio1_CA;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // CRIAÇÃO DE OBJETOS
        Livro livro = new Livro("Dias de Abandono", 30.0, 11);
        livro.autor = "Elena Ferrante";
        livro.mostrarDetalhesDoItem();

        Livro livro2 = new Livro("Cem Anos de Solidão", 45.0, 12);
        livro2.autor = "Gabriel Garcia Marquez";
        livro2.mostrarDetalhesDoItem();

        Livro livro3 = new Livro("Memórias Póstumas de Bras Cubas", 50.0, 13);
        livro3.autor = "Machado de Assis";
        livro3.mostrarDetalhesDoItem();

        Cd cd = new Cd("Hounds of Love", 25.0, 22);
        cd.numeroFaixas = 12;
        cd.mostrarDetalhesDoItem();

        // TESTES DE BUSCA DE PRODUTOS COM CODIGO DE BARRA IGUAIS
        Dvd dvd = new Dvd("Rocky Horror Picture Show", 45.3, 33);
        dvd.duracao = 120;
        dvd.mostrarDetalhesDoItem();
        Dvd dvd2 = new Dvd("Rocky Horror Picture Show", 45.3, 331);
        dvd2.duracao = 120;
        Dvd dvd3 = new Dvd("Rocky Horror Picture Show", 45.3, 33);

        // TESTE DE BUSCA DE COMPARAÇÃO DE CÓDIGOS DE BARRA IGUAIS COM MÉTODO EQUALS()
        System.out.println(dvd.codigoDeBarras.equals(dvd3.codigoDeBarras));

        // LISTA DE 5 PRODUTOS
        List<Integer> listaProdutos = new ArrayList<>();
        listaProdutos.add(livro.codigoDeBarras);
        listaProdutos.add(livro2.codigoDeBarras);
        listaProdutos.add(livro3.codigoDeBarras);
        listaProdutos.add(dvd.codigoDeBarras);
        listaProdutos.add(dvd2.codigoDeBarras);
        listaProdutos.add(dvd3.codigoDeBarras);
        listaProdutos.add(cd.codigoDeBarras);

        // BUSCA DE PRODUTOS NA LISTA
        System.out.println("DIGITE O CÓDIGO DE BARRAS DO PRODUTO QUE DESEJA ENCONTRAR NA LISTA: ");
        Integer produtoBusca = entrada.nextInt();

        for (int i = 0; i < listaProdutos.size(); i++) {

            if (produtoBusca.equals(listaProdutos.get(i))){
                System.out.println("O produto foi encontrado. Ele está na posição " + listaProdutos.indexOf(listaProdutos.get(i)));
                break;
            } else {
                System.out.println("Produto não encontrado.");
            }

        }
    }
}