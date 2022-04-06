package models;

import java.util.ArrayList;

public class Dados {
    public static final ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    public static final ArrayList<Bicicletario> bicicletarios = new ArrayList<>();
    public static final ArrayList<Usuario> usuarios = new ArrayList<>();
    public static final ArrayList<Pagamento> pagamentos = new ArrayList<>();
    public static final ArrayList<Viagem> viagens = new ArrayList<>();

    private Dados() {

    }

    public static ArrayList<Viagem> getViagens() {
        return viagens;
    }

    public static ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public static ArrayList<Bicicletario> getBicicletarios() {
        return bicicletarios;
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

}
