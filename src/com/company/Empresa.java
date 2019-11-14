package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    String nome;
    List<Funcionario> funcionarios = new ArrayList<>();
    List<Tarefa> tarefas = new ArrayList<>();

    void contrata(Funcionario f) {
        funcionarios.add(f);
    }

    void adicionarTarefa(Tarefa t) {
        tarefas.add(t);
    }

    void atribuirTarefa(Funcionario f, Tarefa t) {
        // Quebra ...
        // f.tarefas.add(t);
        f.atribuirTarefa(t);
    }

    void relatorio1(String mes) {

    }

    // Relatório com a lista de funcionários e o respectivo salário, num determinado mês de
    //calendário;
    void relatorio2(String mes) {
        System.out.println("Salários do mês de " + mes);
        for(Funcionario f : funcionarios) {
            String nome = f.getNome();
            double salario = f.calcularSalario(mes);
            System.out.println("Nome: " + nome + "| Salário: " + salario);
        }
    }

}
