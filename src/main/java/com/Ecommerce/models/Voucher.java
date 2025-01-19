package com.Ecommerce.models;


import com.Ecommerce.enums.models.voucher.Status;
import com.Ecommerce.common.datetime.TimeStamps;
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
    private Long id;
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
