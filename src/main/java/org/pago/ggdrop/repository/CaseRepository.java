package org.pago.ggdrop.repository;

import org.pago.ggdrop.entity.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CaseRepository extends JpaRepository<Case, Long>{


}
