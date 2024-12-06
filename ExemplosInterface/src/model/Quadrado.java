package model;

public class Quadrado implements AreaCalculavel{
    private double lado;
    private String forma = "Quadrado";

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
     public double calcularArea(){
        return Math.pow(lado,2);
    }

    public double getLado(){
        return lado;
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public final String getForma(){
        return forma;
    }

}
