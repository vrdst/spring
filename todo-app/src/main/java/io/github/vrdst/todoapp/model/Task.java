package io.github.vrdst.todoapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    private int id;
    private String description;
    private boolean done;

    public void setId(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
