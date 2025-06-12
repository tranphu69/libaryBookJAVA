package com.example.libaryBook.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "permissions")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "action")
    private Boolean action;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAction() {
        return action;
    }

    public void setAction(Boolean action) {
        this.action = action;
    }
}
