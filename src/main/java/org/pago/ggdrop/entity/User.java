package org.pago.ggdrop.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Getter
    @Column(nullable = false, length = 355)
    private String password;

    @Getter
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Getter
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

    @Getter
    @Column(name = "balance", nullable = false)
    private double balance;

    @OneToMany(mappedBy = "from_id")
    private List<Trade> outgoingTrades;

    @OneToMany(mappedBy = "to_id")
    private List<Trade> ingoingTrades;

    public void setItems(List<User_item> items) {
        this.items = items;
    }

    @OneToMany(mappedBy = "user_id", fetch = FetchType.EAGER)
    private List<User_item> items;

    public User(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }
    public List<User_item> getItems() {
        return items;
    }
    public void addItem(User_item user_item){
        items.add(user_item);
    }
}
