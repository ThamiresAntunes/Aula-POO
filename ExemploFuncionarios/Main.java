import model.Comissionado;
import model.Funcionario2;
import model.Horista;

public class Main {
    public static void main(String[] args) {
        Funcionario2 funcHorista = new Horista("11.11.11-1", "José", 30, 40);
        Funcionario2 funcComissario = new Comissionado("11.11.11-1", "Maria", 25, 50);
        Funcionario2 funcComissario2 = new Comissionado("11.11.11-1", "Maria", 25, 50);


        System.out.println(funcHorista.toString());
        System.out.println("São iguais: " + funcComissario.equals(funcComissario2));


    }
}