package model;

import java.util.Date;

public class Lancamento {

    private int lancamentoId;
    private double valor;
    private Conta oConta;
    private Date dataLancamento;
    private Usuario oUsuario;
    
    public Lancamento() {
        
    }

    public int getLancamentoId() {
        return lancamentoId;
    }

    public void setLancamentoId(int lancamentoId) {
        this.lancamentoId = lancamentoId;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Conta getoConta() {
        return oConta;
    }

    public void setoConta(Conta oConta) {
        this.oConta = oConta;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Usuario getoUsuario() {
        return oUsuario;
    }

    public void setoUsuario(Usuario oUsuario) {
        this.oUsuario = oUsuario;
    }

    @Override
    public String toString() {
        return "Lancamento{" + "lancamentoId=" + lancamentoId + ", valor=" + valor + ", oConta=" + oConta + ", dataLancamento=" + dataLancamento + ", oUsuario=" + oUsuario + '}';
    }    
}
