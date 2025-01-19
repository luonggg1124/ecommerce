package com.Ecommerce.models;

import com.Ecommerce.common.datetime.TimeStamps;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Product implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String slug;
    @Column(unique = true)
    private String name;
    private String description;
    @OneToMany
    private List<Image> images;
    @OneToMany
    private List<Variant> variants;

    @JsonIgnore
    @OneToMany
    private List<Category> categories;
}
