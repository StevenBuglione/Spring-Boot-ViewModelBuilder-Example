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
@Table(name = "Section4")
public class Entity4 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String string4;
    @Column(nullable = false)
    private int int_4;
    @Column(nullable = false)
    private double double4;
    @Column(nullable = false)
    private float float_4;
    @Column(nullable = false)
    private char char4;


}
