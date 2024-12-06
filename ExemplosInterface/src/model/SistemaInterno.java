package model;

public class SistemaInterno {

    public boolean autenticar(Autenticavel autenticavel){
        return autenticavel.autenticar("Usuario","123");
    }

}
