package Exercicio2_IN;

public class Banco {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("Maria da Silva", 192, 500.0);
        poupanca.exibirDadosCliente();
        poupanca.calcularTributos();

        ContaCorrente corrente = new ContaCorrente("João Pereira", 197, 450.0);
        corrente.exibirDadosCliente();
        corrente.calcularTributos();

        SeguroVida seguro = new SeguroVida("Ana Julia Melo",true);
        seguro.exibirDadosCliente();
        seguro.calcularTributos();

    }
}
