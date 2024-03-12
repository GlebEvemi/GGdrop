package org.pago.ggdrop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
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

    private long price;

    //@OneToMany(mappedBy = "case_id")
    //private List<Case_item> items;

}
