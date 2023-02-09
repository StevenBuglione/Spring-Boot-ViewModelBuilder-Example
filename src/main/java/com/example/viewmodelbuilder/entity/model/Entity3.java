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
@Table(name = "Section3")
public class Entity3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String string3;
    @Column(nullable = false)
    private int int3;
    @Column(nullable = false)
    private double double3;
    @Column(nullable = false)
    private float float3;
    @Column(nullable = false)
    private char char3;


}