package com.pos.cifraCesar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CifraRepository extends JpaRepository<com.pos.cifraCesar.model.CifraModel, Long> {

}
