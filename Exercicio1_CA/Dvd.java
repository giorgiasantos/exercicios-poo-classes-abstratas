package Exercicio1_CA;

public class Dvd extends Produto{
    int duracao;
    public Dvd(String nome, double preco, Integer codigoDeBarras) {
        super(nome, preco, codigoDeBarras);
    }

    public Integer getCodigoDeBarras(){
        return codigoDeBarras;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Produto) {
            Produto busca = (Produto) obj;
            return this.codigoDeBarras.equals(busca.getCodigoDeBarras());
        }else{
            return false;
        }
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("DETALHES DO ITEM: ");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Código de barras: " + codigoDeBarras);
        System.out.println("------------------------------");

    }



}
