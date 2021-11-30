package com.challenge.backendchallenge.model.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "CHARACTERS")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "CHARACTER_ID")
    private long id;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "AGE")
    private int age;

    @Column(name = "HEIGHT")
    private float height;

    @Column(name = "BIOGRAPHY")
    private String biography;

    @Column(name = "DATE_CREATION")
    @CreationTimestamp
    private Timestamp dateCreation;

    @Column(name = "SOFT_DELETE")
    private boolean softDelete;

}
