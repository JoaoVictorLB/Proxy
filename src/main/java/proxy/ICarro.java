package main.java.proxy;

import java.util.List;

public interface ICarro {
    List<String> obterDadosDoVeiculo();
    List<Boolean> obterDisponibilidades(Locadora locadora);
}
