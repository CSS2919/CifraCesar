package com.pos.cifraCesar.repository;

import com.pos.cifraCesar.model.CifraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CifraRepository extends JpaRepository<CifraModel, Long> {
}
