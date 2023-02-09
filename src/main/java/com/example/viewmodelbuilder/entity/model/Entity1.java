package com.example.viewmodelbuilder.entity.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Section1")
public class Entity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String string1;
    @Column(nullable = false)
    private int int1;
    @Column(nullable = false)
    private double double1;
    @Column(nullable = false)
    private float float1;
    @Column(nullable = false)
    private char char1;


}
