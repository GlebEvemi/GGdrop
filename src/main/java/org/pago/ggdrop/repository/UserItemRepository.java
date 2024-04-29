package org.pago.ggdrop.repository;

import org.pago.ggdrop.entity.Item;
import org.pago.ggdrop.entity.Trade;
import org.pago.ggdrop.entity.User;
import org.pago.ggdrop.entity.User_item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserItemRepository extends JpaRepository<User_item, Long> {


    @Query("select u from User_item u where u.user_id = ?1")
    public List<User_item> findAllByUserId(User user_id);
}
