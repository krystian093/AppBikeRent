package model;

import javax.persistence.*;

public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long Id;
    private double price;
    private String bikeName;

    public Bike( double price, String bikeName) {
        this.price = price;
        this.bikeName = bikeName;
    }

    public Bike() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

}
