package br.com.dio.behavioral.strategy.models;

import br.com.dio.behavioral.strategy.interfaces.IMovimentacaoStrategy;

// contexto
public class Agente {

    private IMovimentacaoStrategy movimentacao;

    public void setMovimentacao(IMovimentacaoStrategy movimentacao) {
        this.movimentacao = movimentacao;
    }

    public void mover(){
             movimentacao.mover();
    }

}
