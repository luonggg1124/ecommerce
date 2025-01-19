package com.example.Ecommerce.models;

import com.example.Ecommerce.common.datetime.TimeStamps;
import com.example.Ecommerce.enums.models.order.PaymentMethod;
import com.example.Ecommerce.enums.models.order.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Order implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private User user;
    @Column(nullable = false)
    private double total_amount;
    @Column(nullable = false)
    private double sub_total_amount;
    private double tax_amount;
    @Column(nullable = false)
    private PaymentStatus payment_status;
    @Column(nullable = false)
    private PaymentMethod payment_method;
    @Column(nullable = false)
    private String shipping_method;
    private double shipping_amount;
    @Column(nullable = false)
    private double amount_collected;
    private String receiver_name;
    private String receiver_phone;
    private String receiver_email;
    private String receiver_full_address;
    private String receiver_city;
    private String receiver_district;
    private String receiver_commune;
    @ManyToOne
    private Voucher voucher;

    @OneToMany
    private List<OrderItem> items;
    private String note;


}
