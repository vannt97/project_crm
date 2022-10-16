package com.demobuoi13.crm.model;

public class Role {
    private int id;
    private String name_role;
    private String description;

    public Role(int id, String name_role, String description) {
        this.id = id;
        this.name_role = name_role;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_role() {
        return name_role;
    }

    public void setName_role(String name_role) {
        this.name_role = name_role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
