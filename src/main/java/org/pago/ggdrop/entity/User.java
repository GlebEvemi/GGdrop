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
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    private long balance;

    @OneToMany(mappedBy = "from_id")
    private List<Trade> outgoingTrades;

    @OneToMany(mappedBy = "to_id")
    private List<Trade> ingoingTrades;

    @OneToMany(mappedBy = "user_id")
    private List<User_item> items;


}
