package view;

import model.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Aluno("111.11.1", "Joao", LocalDate.now(), 123, "ADS");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.toString());

    }
}