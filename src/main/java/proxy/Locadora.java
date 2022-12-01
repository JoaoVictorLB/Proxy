package main.java.proxy;

public class Locadora {
    private String nome;
    private boolean aberta;

    public Locadora(String nome, boolean aberta){
        this.nome = nome;
        this.aberta = aberta;
    }

    public String getNome(){ return this.nome; }

    public void setNome(String nome){ this.nome = nome; }

    public boolean isOpen(){ return aberta; }

    public void setAberta(boolean aberta){ this.aberta = aberta; }
}
