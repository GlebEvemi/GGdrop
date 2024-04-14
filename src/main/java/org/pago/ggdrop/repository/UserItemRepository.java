package org.pago.ggdrop.repository;

import org.pago.ggdrop.entity.Trade;
import org.pago.ggdrop.entity.User_item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserItemRepository extends JpaRepository<User_item, Long> {
}
