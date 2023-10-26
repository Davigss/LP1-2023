package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Table
@Entity
public class agenda {
    private List<tarefa> tarefas = new ArrayList<>();
    public void addTarefas(tarefa tarefa) {
        tarefas.add(tarefa);
        //add só funciona com import java.util.List;
    }


}
