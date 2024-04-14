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
@Table(name = "cases")
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 30)
    private String name;


    @Column(nullable = false, length = 30)
    private String image_url;

    private int price;

    public Case() {

    }

    public Case(String name, String image_url, int price) {
        this.name = name;
        this.image_url = image_url;
        this.price = price;
    }
    //@OneToMany(mappedBy = "case_id")
    //private List<Case_item> items;

}
