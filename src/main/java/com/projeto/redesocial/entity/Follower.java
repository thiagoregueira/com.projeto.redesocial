package com.projeto.redesocial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "followers", schema = "redesocial")
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "followers_sq")
    @SequenceGenerator(schema = "redesocial", name = "followers_sq", sequenceName = "followers_sq", initialValue = 1, allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "followers_id")
    private User follower;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}