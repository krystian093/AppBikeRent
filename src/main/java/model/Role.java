package model;

import javax.persistence.*;

public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String role;

    public Role(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
