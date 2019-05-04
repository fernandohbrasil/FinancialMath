package config;

public class DadosArquivo {

    private int fonteDados;
    private String usuario;
    private String senha;
    private String driver;
    private String url;

    public DadosArquivo() {

    }

    public int getFonteDados() {
        return fonteDados;
    }

    public void setFonteDados(int fonteDados) {
        this.fonteDados = fonteDados;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
