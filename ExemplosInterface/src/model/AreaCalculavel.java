package model;

public interface AreaCalculavel {

    double calcularArea();

    default void imprimirArea(){
        System.out.println("A área é " + calcularArea());
    }


}
