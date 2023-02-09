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
@Table(name = "Section2")
public class Entity2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String string2;
    @Column(nullable = false)
    private int int_2;
    @Column(nullable = false)
    private double double2;
    @Column(nullable = false)
    private float float2;
    @Column(nullable = false)
    private char char2;


}

