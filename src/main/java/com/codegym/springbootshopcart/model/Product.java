package com.codegym.springbootshopcart.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String photo;
    private int price;
    private String url;
    private int quantity;

    @ManyToMany(mappedBy = "products")
    private Set<Order> oders = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<Quantity> quantities = new HashSet<>();

    public Product () {}
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<Order> getOders() {
        return oders;
    }

    public void setOders(Set<Order> oders) {
        this.oders = oders;
    }

    public Set<Quantity> getQuantities() {
        return quantities;
    }

    public void setQuantities(Set<Quantity> quantities) {
        this.quantities = quantities;
    }
}
