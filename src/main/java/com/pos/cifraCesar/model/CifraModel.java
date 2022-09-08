package com.pos.cifraCesar.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "db_cofre")
@Data
public class CifraModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String password;

}
