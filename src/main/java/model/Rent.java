package model;

import javax.persistence.*;
import java.sql.Timestamp;

public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Timestamp startDate;
    private Timestamp endDate;
    private double price;

    public Rent(Timestamp startDate, Timestamp endDate, double price) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
