package ContaBancaria;

import java.util.*;

/**
 *
 */
public abstract class Conta {

    private String nomeCliente, cpfCliente;
    private Double saldo;
    private static Integer contador = 0, numAgencia, numConta;

    /**
     * @return
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param value
     */
    public void setNomeCliente(String value) {
        this.nomeCliente = value;
    }

    /**
     * @return
     */
    public String getCpfCliente() {
        return this.cpfCliente;
    }

    /**
     * @param value
     */
    public void setCpfCliente(String value) {
        this.cpfCliente = value;
    }

    /**
     * @return
     */
    public Double getSaldo() {
        return this.saldo;
    }

    /**
     * @param value
     */
    public void setSaldo(Double value) {
        this.saldo = value;
    }

    /**
     * @return
     */
    public Integer getNumConta() {
        return Conta.numConta;
    }

    /**
     */
    public void setNumConta() {
        Conta.numConta = getContador();
    }

    /**
     * @return
     */
    public Integer getNumAgencia() {
        return Conta.numAgencia;
    }

    /**
     * @param value
     */
    public void setNumAgencia(Integer value) {
        Conta.numAgencia = value;
    }

    /**
     * @return
     */
    public Integer getContador() {
        return Conta.contador;
    }

    /**
     * @param value
     */
    public void setContador(Integer value) {
        contador++;
    }

    /**
     *
     * @param conta
     * @param valor
     */
    public static void transferir(Conta conta, Double valor) {
    }

    /**
     *
     * @param valor
     * @return
     */
    public boolean temSaldo(Double valor) {
        return getSaldo() >= valor;
    }

    /**
     *
     * @param valor
     */
    public static void sacar(Double valor) {
    }

}
