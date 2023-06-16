package Exercicio1_CA;

public abstract class Produto {
    String nome;
    double preco;
    Integer codigoDeBarras;

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
    public abstract void mostrarDetalhesDoItem();
    public Produto(String nome, double preco, Integer codigoDeBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoDeBarras = codigoDeBarras;
    }
}
