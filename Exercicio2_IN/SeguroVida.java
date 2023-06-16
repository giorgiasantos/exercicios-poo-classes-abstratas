package Exercicio2_IN;

public class SeguroVida implements ProdutoBanco{
    String nomeCliente;
    Boolean seguroDeVida;

    public void calcularTributos(){
        double totalTributos = 42.00;
        System.out.println("O SEU VALOR TRIBUTÁVEL É DE R$ " +totalTributos);
        System.out.println("CLIENTES DO SEGURO DE VIDA PAGAM TAXA FIXA DE TRIBUTOS.");
        System.out.println("----------------------------");
    }
    public void exibirDadosCliente(){
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Seguro de vida ativo: " + seguroDeVida);
        System.out.println("----------------------------");
    }
    public SeguroVida(String nomeCliente, Boolean seguroDeVida) {
        this.nomeCliente = nomeCliente;
        this.seguroDeVida = seguroDeVida;
    }
}
