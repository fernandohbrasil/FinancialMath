package model;

public class Usuario {

    private int usuarioid;
    private String nome;
    private int login;
    private int senha;
    private String email;
    private static Usuario uniqueInstance;

    private Usuario() {

    }

    public static Usuario getInstance() {
        if (uniqueInstance == null) {
            synchronized (Usuario.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Usuario();
                }
            }
        }
        return uniqueInstance;
    }

    @Override
    public String toString() {
        return nome;
    }

    
    
    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
