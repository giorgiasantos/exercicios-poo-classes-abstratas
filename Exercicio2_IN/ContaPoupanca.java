package Exercicio2_IN;

public class ContaPoupanca implements ProdutoBanco{
    String nomeCliente;
    int numeroConta;
    Double saldoTotal;
    public void calcularTributos(){
        double totalTributos = 0.0;
        System.out.println("O SEU VALOR TRIBUTÁVEL É DE R$ " +totalTributos);
        System.out.println("CONTA POUPANÇA NÃO PAGA TRIBUTOS.");
        System.out.println("----------------------------");
    }

    public void exibirDadosCliente(){
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldoTotal);
        System.out.println("----------------------------");
    }

    public ContaPoupanca(String nomeCliente, int numeroConta, Double saldoTotal) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldoTotal = saldoTotal;
    }
}
