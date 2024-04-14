package org.pago.ggdrop.repository;

import org.pago.ggdrop.entity.Case;
import org.pago.ggdrop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CaseRepository extends JpaRepository<Case, Long>{

    Case findByName(String name);

}
