package com.company;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    List<Tarefa> tarefas;
    String nome;
    int id;

    Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        tarefas = new ArrayList<>();
    }

    void atribuirTarefa(Tarefa t) {
        tarefas.add(t);
    }

    double calcularSalario(String mes) {

        int nrHorasTrab = 0;
        int nrTarefas = 0;

        for(Tarefa t : tarefas) {
            String mesTarefa = t.getMes();
            if(mesTarefa.equals(mes)) {
                nrHorasTrab = nrHorasTrab + t.getDuracao();
                nrTarefas++;
            }
        }

        double bonus = 0;

        if(nrTarefas > 10 && nrHorasTrab < 50) {
            bonus = (nrTarefas - 5) * 0.25;
        }

        return 505 + 2 * nrHorasTrab + bonus;
    }

    String getNome() {
        return nome;
    }

}
