package br.com.senac.defesa.model;

import java.util.List;

public abstract class RegraDeAlvo {

    public abstract String getNome();

    public abstract Inimigo escolher(Ponto posicaoDaTorre, List<Inimigo> candidatos);
}
