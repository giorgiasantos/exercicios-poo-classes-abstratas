package Exercicio2CA;

public class Retangulo extends Forma{
    float lado;
    float altura;
    @Override
    public void calcularArea(){
        float area = lado * altura;
        System.out.println("A área do retângulo é: " + area);
    }
    @Override
    public void calcularPerimetro(){
        float perimetro = 2 * (lado * altura);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }
    @Override
    public String toString(){
        return "A altura do retângulo é " + this.altura + ". O lado é " + this.lado;
    }
}
