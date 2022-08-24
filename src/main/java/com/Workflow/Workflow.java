package com.Workflow;

import java.util.LinkedList;
import java.util.List;

public class Workflow {

    String id;
    State state = State.INITIAL;
    Definition definition;
    List<Task> tasksHistory = null;

    public Workflow() {
        tasksHistory = new LinkedList<Task>();
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Workflow [state=" + state + "]";
    }

    public void addTask(Task task) {
        this.tasksHistory.add(task);
    }

    public List<Task> getTasks() {
        return this.tasksHistory;
    }

}