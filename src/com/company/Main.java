package com.company;

public class Main {

    public static void main(String[] args) {

        Empresa emp = new Empresa();

        Funcionario f1 = new Funcionario("João", 1);
        Funcionario f2 = new Funcionario("Pedro", 2);
        Funcionario f3 = new Funcionario("Marco", 3);

        // Quebra do encapsulamento!
        //emp.funcionarios.add(f1);
        emp.contrata(f1);
        emp.contrata(f2);
        emp.contrata(f3);

        Tarefa t1 = new Tarefa("Limpar a sala");
        Tarefa t2 = new Tarefa("Arranjar as janelas");

        // Quebra do encapsulamento
        //emp.tarefas.add(t1);

        emp.adicionarTarefa(t1);
        emp.adicionarTarefa(t2);

        // Quebra ...
        //f1.tarefas.add(t1);

        emp.atribuirTarefa(f1, t1);
        emp.atribuirTarefa(f2, t2);

        // Quebra ...
        //t1.mes = "Março";
        //t2.mes = "Fevereiro";

        t1.setMes("Março");
        t2.setMes("Fevereiro");

        t1.setDuracao(1);
        t2.setDuracao(3);

        // Salários Março
        // f1 (João) => 505 + 2 * 1 + 0 = 507
        // f2 (Pedro) => 505 + 2 * 0 + 0 = 505
        // f3 (Marco) => 505 + 2 * 0 + 0 = 505

        // Mostrar os relatórios
        emp.relatorio2("Março");

        // Salários Fevereiro
        // f1 => 505
        // f2 => 505 + 2 * 3 + 0 = 511
        // f3 => 505

        emp.relatorio2("Fevereiro");

    }
}
