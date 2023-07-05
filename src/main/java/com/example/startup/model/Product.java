package com.example.startup.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
public class Product extends BaseEntity{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int productId;

    private String name;

    private int fees;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private String image;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int id) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public Product() {
    }

    public Product(int productId, String name, String image, int fees) {
        this.productId = productId;
        this.name = name;
        this.image = image;
        this.fees = fees;
    }

}