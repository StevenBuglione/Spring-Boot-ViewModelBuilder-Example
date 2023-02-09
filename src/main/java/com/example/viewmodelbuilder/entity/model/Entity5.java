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
@Table(name = "Section5")
public class Entity5 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String string5;
    @Column(nullable = false)
    private int int5;
    @Column(nullable = false)
    private double double5;
    @Column(nullable = false)
    private float float5;
    @Column(nullable = false)
    private char char5;


}