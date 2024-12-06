package model;

public class Gerente extends Funcionario implements Autenticavel{
    private String setor;

    public Gerente(String cpf, String nome, String setor){
        super(cpf, nome);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public boolean autenticar(String login, String senha){
        return false;
    }
}
