package org.pago.ggdrop.repository;

import org.pago.ggdrop.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TradeRepository extends JpaRepository<Trade, Long>{

}
