package br.com.dio.behavioral.strategy.models;

import br.com.dio.behavioral.strategy.interfaces.IMovimentacaoStrategy;

// estrategia concreta
public class MovimentacaoBhopping implements IMovimentacaoStrategy {

    @Override
    public void mover() {
        System.out.println("Movendo-se rapidamente com pulos e alternância de direções...");
    }

}
