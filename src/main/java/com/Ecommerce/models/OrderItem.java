package com.Ecommerce.models;

import com.Ecommerce.common.datetime.TimeStamps;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class OrderItem implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Variant product;

    private double price;
    private int quantity;
    private double total_amount;
}
