package entity;

import java.io.Serializable;

public class Account {

    private String name;
    private int id;
    private int bill;

    public Account(int id, String name, int bill) {
        this.name = name;
        this.id = id;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
}
