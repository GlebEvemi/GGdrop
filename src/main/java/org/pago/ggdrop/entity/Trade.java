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
@Table(name = "trades")
public class Trade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private User from_id;

    @ManyToOne
    private User to_id;

    @OneToMany(mappedBy = "trade_id")
    private List<Trade_item> trade_items;





}
