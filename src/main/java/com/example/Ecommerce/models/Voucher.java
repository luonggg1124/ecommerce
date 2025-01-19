package com.example.Ecommerce.models;


import com.example.Ecommerce.common.datetime.TimeStamps;
import com.example.Ecommerce.enums.models.voucher.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Voucher implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false,unique = true)
    private String code;
    private double value;
    private Date start_date;
    private Date end_date;
    private Status status;
    private double minimum_order_subtotal;
    private double maximum_reduction;
    private int quantity;
}
