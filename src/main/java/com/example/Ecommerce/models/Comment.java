package com.example.Ecommerce.models;

import com.example.Ecommerce.common.datetime.TimeStamps;
import com.example.Ecommerce.enums.models.comment.Type;
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
public class Comment implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Comment parent;

    @Column(nullable = false)
    private Long commentableId;

    @Column(nullable = false)
    private Type commentableType;




}
