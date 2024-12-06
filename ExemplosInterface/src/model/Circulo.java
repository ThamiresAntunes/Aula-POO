package model;

//a classe com final não pode ser herdada
public final class Circulo implements AreaCalculavel{
    private double raio;
    private String forma = "Circulo";

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio,2);
    }

    //com o final o metodo não pode ser sobrescrito
    public final double getRaio(){
        return raio;
    }

    public final String getForma(){
        return forma;
    }
}
