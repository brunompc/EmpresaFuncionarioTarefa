package com.company;

public class Tarefa {

    int duracao;
    String descricao;
    String mes;

    Tarefa(String descricao) {
        this.descricao = descricao;
    }

    String getMes() {
        return mes;
    }

    int getDuracao() {
        return duracao;
    }

    void setMes(String mes) {
        this.mes = mes;
    }

    void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
