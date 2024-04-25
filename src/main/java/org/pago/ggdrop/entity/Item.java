package org.pago.ggdrop.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 30)
    private String name;

    private String image_url;

    private float price;

    @OneToMany(mappedBy = "item_id")
    private List<Trade_item> trades;

    @OneToMany(mappedBy = "item_id")
    private List<User_item> users;

    @OneToMany(mappedBy = "item_id")
    private List<Case_item> cases;

    public Item(String name, String image_url, float price) {
        this.name = name;
        this.image_url = image_url;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
