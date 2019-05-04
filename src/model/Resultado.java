package model;

public class Resultado {

    private Lancamento oLancamento;
    private int numDias;
    private Double saldo;
    private Double valorDiario;
    private Double juro;
    private Double juroXDias;

    public Resultado() {
        oLancamento = null;
        numDias = 0;
        saldo = 0.0;
        valorDiario = 0.0;
        juro = 0.0;
        juroXDias = 0.0;

    }

    public Double getJuroXDias() {
        return juroXDias;
    }

    public void setJuroXDias(Double juroXDias) {
        this.juroXDias = juroXDias;
    }

    public Lancamento getoLancamento() {
        return oLancamento;
    }

    public void setoLancamento(Lancamento oLancamento) {
        this.oLancamento = oLancamento;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getJuro() {
        return juro;
    }

    public void setJuro(Double juro) {
        this.juro = juro;
    }

    public Double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(Double valorDiario) {
        this.valorDiario = valorDiario;
    }

    @Override
    public String toString() {
        return "Resultado{" + "oLancamento=" + oLancamento + ", numDias=" + numDias + ", saldo=" + saldo + ", valorDiario=" + valorDiario + ", juro=" + juro + ", juroXDias=" + juroXDias + '}';
    }

}
