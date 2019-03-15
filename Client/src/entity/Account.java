package entity;
import java.io.Serializable;

public class Account {

    private int id;
    private String name;
    private int bill;

    public Account(int id, String name, int bill) {
        this.id = id;
        this.name = name;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
}
