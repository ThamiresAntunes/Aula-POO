import model.Circulo;
import model.Quadrado;
import model.Retangulo;

public class Main {
    public static void main(String[] args) {

        //Classes que implementam a interface AreaCalculavel
        Quadrado quadrado = new Quadrado(10);
        quadrado.imprimirArea();
        Retangulo retangulo = new Retangulo(5, 2.5);
        retangulo.imprimirArea();
        Circulo circulo = new Circulo(3);
        circulo.imprimirArea();


    }
}