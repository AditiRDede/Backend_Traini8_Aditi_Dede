package com.Traini8.TrainingCenterManagement.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Address
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String detailedAddress;
    private String city;
    private int pincode;

}
