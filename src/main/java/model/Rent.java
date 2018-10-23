package model;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;
import java.sql.Timestamp;

public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private Timestamp startDate;
    private Timestamp endDate;
    private double price;

    @Enumerated(EnumType.STRING)
    private City city;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "bike_id", nullable = false)
    private Bike bike;

    public Rent(Timestamp startDate, Timestamp endDate, double price, City city, Bike bike) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.city = city;
        this.bike = bike;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }
}






