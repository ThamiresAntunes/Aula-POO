package model;

import java.util.Objects;

public abstract class Funcionario2 {

    private String cpf;
    private String nome;

    public Funcionario2(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract float calcularPagamento();

    @Override
    public String toString() {
        return "Funcionario{" +
                "CPF= " + cpf +
                ", Nome= " + nome +
                "}";
    }

    @Override
    public boolean equals(Object objeto){
        if(this == objeto) return true;
        if(objeto == null || getClass() != objeto.getClass()) return false;
        Funcionario2 func = (Funcionario2) objeto;
        return Objects.equals(cpf, func.cpf) && Objects.equals(nome, func.nome);
    }

    @Override
    public int hashCode(){
        return Objects.hash(cpf, nome);
    }

}
