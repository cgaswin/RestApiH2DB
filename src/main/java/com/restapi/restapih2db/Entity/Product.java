package com.restapi.restapih2db.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long productId;


    private String productName;
    private Integer productPrice;
}
