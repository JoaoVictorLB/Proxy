package main.java.proxy;

import java.util.Arrays;
import java.util.List;

public class Carro implements ICarro {
    private String placa;
    private String modelo;
    private String ano;
    private boolean disponivel;
    private float consumo;

    public Carro(String placa){
        this.placa = placa;
        Carro objeto = BD.getCarro(placa);
        this.modelo = objeto.modelo;
        this.ano = objeto.ano;
        this.disponivel = objeto.disponivel;
        this.consumo = objeto.consumo;
    }

    public Carro(String placa, String modelo, String ano, boolean disponivel, float consumo){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = disponivel;
        this.consumo = consumo;
    }

    public String getPlaca(){ return placa; }

    @Override
    public List<String> obterDadosDoVeiculo(){
        return Arrays.asList(this.modelo, this.ano);
    }

    @Override
    public List<Boolean> obterDisponibilidades(Locadora locadora){
        return Arrays.asList(this.disponivel);
    }
}
