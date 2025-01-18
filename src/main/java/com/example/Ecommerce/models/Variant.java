package com.example.Ecommerce.models;

import com.example.Ecommerce.common.datetime.TimeStamps;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Variant implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true)
    private String name;
    @ManyToOne
    private Color color;
    @ManyToOne
    private Size size;

    @OneToMany
    private List<Image> images;

    @JsonIgnore
    @ManyToOne
    private Product product;
    private double price;
    private int quantity;
}
