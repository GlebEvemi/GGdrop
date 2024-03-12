package org.pago.ggdrop.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 30)
    private String name;

    private long price;

    @OneToMany(mappedBy = "item_id")
    private List<Trade_item> trades;

    @OneToMany(mappedBy = "item_id")
    private List<User_item> users;

    @OneToMany(mappedBy = "item_id")
    private List<Case_item> cases;
}
