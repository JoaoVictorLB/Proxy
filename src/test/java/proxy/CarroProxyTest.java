package test.java.proxy;

import main.java.proxy.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CarroProxyTest {
    @BeforeEach
    void setUp(){
        BD.addCarro(new Carro("KWU-5034", "Onix", "2019", true, 18.0f));
        BD.addCarro(new Carro("QXH-1804", "Gol", "2020", true, 14.0f));
    }

    @Test
    void deveRetornarDadosDoVeiculo(){
        CarroProxy carro = new CarroProxy("KWU-5034");
        assertEquals(Arrays.asList("Onix", "2019"), carro.obterDadosDoVeiculo());
    }

    @Test
    void deveRetornarDisponibilidadeDoVeiculo(){
        Locadora locadora = new Locadora("Localiza", true);
        CarroProxy carro = new CarroProxy("QXH-1804");
        assertEquals(Arrays.asList(true), carro.obterDisponibilidades(locadora));
    }

    @Test
    void deveRetornarLocadoraIndisponivel(){
        try{
            Locadora locadora = new Locadora("Localiza", false);
            CarroProxy carro = new CarroProxy("QXH-1804");
            carro.obterDisponibilidades(locadora);
            fail();
        } catch(IllegalArgumentException e){
            assertEquals("Locadora fechada", e.getMessage());
        }
    }
}
