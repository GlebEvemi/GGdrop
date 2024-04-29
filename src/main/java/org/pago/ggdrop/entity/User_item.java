package org.pago.ggdrop.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_items")
public class User_item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user_id;

    @JoinColumn(name = "item_id")
    @ManyToOne
    private Item item_id;

    public User_item(User user_id, Item item_id) {
        this.user_id = user_id;
        this.item_id = item_id;
    }
    public Item getItem_id() {
        return item_id;
    }

    public Long getId() {
        return id;
    }

    public User getUser_id() {
        return user_id;
    }
}
