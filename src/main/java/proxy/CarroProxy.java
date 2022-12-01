package main.java.proxy;

import java.util.List;

public class CarroProxy implements ICarro{
    private Carro carro;
    private String placa;

    public CarroProxy(String placa){ this.placa = placa; }

    @Override
    public List<String> obterDadosDoVeiculo(){
        if(this.carro == null){
            this.carro = new Carro(this.placa);
        }
        return this.carro.obterDadosDoVeiculo();
    }

    @Override
    public List<Boolean> obterDisponibilidades(Locadora locadora){
        if(!locadora.isOpen()){
            throw new IllegalArgumentException("Locadora fechada");
        }
        if(this.carro == null){
            this.carro = new Carro(this.placa);
        }
        return this.carro.obterDisponibilidades(locadora);
    }
}
