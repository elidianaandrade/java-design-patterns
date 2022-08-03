package br.com.dio.behavioral.strategy;

import br.com.dio.behavioral.strategy.interfaces.IMovimentacaoStrategy;
import br.com.dio.behavioral.strategy.models.Agente;
import br.com.dio.behavioral.strategy.models.MovimentacaoBhopping;
import br.com.dio.behavioral.strategy.models.MovimentacaoPadrao;
import br.com.dio.behavioral.strategy.models.MovimentacaoStrafe;

public class Main {

    public static void main(String[] args) {

        IMovimentacaoStrategy padrao = new MovimentacaoPadrao();
        IMovimentacaoStrategy strafe = new MovimentacaoStrafe();
        IMovimentacaoStrategy bhopping = new MovimentacaoBhopping();

        Agente agente = new Agente();
        agente.setMovimentacao(padrao);
        agente.mover();
        agente.mover();
        agente.setMovimentacao(strafe);
        agente.mover();
        agente.setMovimentacao(padrao);
        agente.mover();
        agente.setMovimentacao(bhopping);
        agente.mover();

    }

}
