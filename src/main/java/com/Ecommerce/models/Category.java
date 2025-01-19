package com.Ecommerce.models;

import com.Ecommerce.common.datetime.TimeStamps;
import com.Ecommerce.enums.models.category.Type;
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
public class Category implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String slug;


    @OneToMany
    private List<Product> products;

    private Type type;

}
