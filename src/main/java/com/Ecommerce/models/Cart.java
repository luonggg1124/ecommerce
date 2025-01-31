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
public class Cart implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Variant variant;

    @OneToOne
    private User user;
    private int quantity;


}
