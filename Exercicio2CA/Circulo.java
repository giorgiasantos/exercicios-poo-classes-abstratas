package Exercicio2CA;

public class Circulo extends Forma{
    float raio;
    @Override
    public void calcularArea() {
        double pi = Math.PI;
        float area =  (float)pi * (raio * raio);
        System.out.println("A área do círculo é " + area);
    }
    @Override
    public void calcularPerimetro() {
        double pi = Math.PI;
        float perimetro = 2 * (float)pi * raio;
        System.out.println("O perímetro do círculo é: " +perimetro);
    }

    @Override
    public String toString(){
        return "O raio do círculo é " + this.raio;
    }
}
