package model;

public class Conta {

    private int contaId;
    private String descricao;
    private String tipo;
    private Usuario oUsuario;

    public Conta() {

    }

    public int getContaId() {
        return contaId;
    }

    public void setContaId(int contaId) {
        this.contaId = contaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuario getoUsuario() {
        return oUsuario;
    }

    public void setoUsuario(Usuario oUsuario) {
        this.oUsuario = oUsuario;
    }

    @Override
    public String toString() {
        if("d".equals(tipo)){
            return descricao + " - Débito";
        }else {
            return descricao + " - Crédito";
        }        
    }

}
