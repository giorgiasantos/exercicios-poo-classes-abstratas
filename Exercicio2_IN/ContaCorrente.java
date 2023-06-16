package Exercicio2_IN;

public class ContaCorrente implements ProdutoBanco{
    String nomeCliente;
    int numeroConta;
    Double saldoTotal;

    public void calcularTributos(){
        double totalTributos = saldoTotal * 0.01;
        System.out.println("O SEU VALOR TRIBUTÁVEL É DE R$ " +totalTributos);
        System.out.println("CONTA-CORRENTE PAGA 1% DE TRIBUTOS.");
        System.out.println("----------------------------");
    }
    public void exibirDadosCliente(){
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldoTotal);
        System.out.println("----------------------------");
    }

    public ContaCorrente(String nomeCliente, int numeroConta, Double saldoTotal) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldoTotal = saldoTotal;
    }
}
