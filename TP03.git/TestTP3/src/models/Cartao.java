package models;

public class Cartao {
    private String numero;
    private String cvv;
    private String nome;

    public Cartao(String numero, String cvv, String nome) {
        this.numero = numero;
        this.cvv = cvv;
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getCvv() {
        return cvv;
    }

    public String getNome() {
        return nome;
    }

}
