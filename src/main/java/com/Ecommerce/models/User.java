package com.Ecommerce.models;

import com.Ecommerce.common.datetime.TimeStamps;
import com.Ecommerce.enums.models.user.Status;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class User implements TimeStamps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    private Status status;
    private String google_id;
    @OneToOne
    private Image image;




}
