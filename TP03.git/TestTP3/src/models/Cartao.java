package models;
/**
 * Recebe os dados do cartão, além de editar esses dados.
 * @author Maria Abritta e Thyago Moura 
 * @version 1.0 (Abril 2022)
 */
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
