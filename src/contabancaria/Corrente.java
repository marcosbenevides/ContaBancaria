package ContaBancaria;

/**
 *
 */
public class Corrente extends Conta {

    /**
     * Default constructor
     * @param titular
     * @param cpf
     */
    public Corrente(String titular, String cpf) {
        setNomeCliente(titular);
        setCpfCliente(cpf);
        setNumConta();
        
        
    }

    private Double taxaTransf, taxaSaque, limiteConta;
    private Integer contSaque;
    private Boolean contaPluss;

    /**
     * @return
     */
    public Double getTaxaTransf() {
        return taxaTransf;
    }

    /**
     */
    public void setTaxaTransf() {
        if (getContaPluss()) {
            this.taxaTransf = 0.06;
        } else {
            this.taxaTransf = 0.07;
        }
    }

    /**
     * @return
     */
    public Double getTaxaSaque() {
        return taxaSaque;
    }

    /**
     * @param value
     */
    public void setTaxaSaque(Double value) {
        if (getContSaque() >= 5) {
            if (getContaPluss()) {
                this.taxaSaque = 0.03;
            } else {
                this.taxaSaque = 0.04;
            }
        }else{
            this.taxaSaque = 0.0;
        }
    }

    /**
     * @return
     */
    public Integer getContSaque() {
        return contSaque;
    }

    /**
     * @param value
     */
    public void setContSaque(Integer value) {
        this.contSaque++;
    }

    /**
     * @return
     */
    public Boolean getContaPluss() {
        return contaPluss;
    }

    /**
     * @param value
     */
    public void setContaPluss(Boolean value) {
        this.contaPluss = value;
    }

    /**
     * @return
     */
    public Double getLimiteConta() {
        return limiteConta;
    }

    /**
     * @param value
     */
    public void setLimiteConta(Double value) {
        if (getContaPluss()) {
            this.limiteConta = (getSaldo() * 0.7) * -1;
        } else {
            this.limiteConta = (getSaldo() * 0.3) * -1;
        }
    }

}
