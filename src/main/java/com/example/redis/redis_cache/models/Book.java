package com.example.redis.redis_cache.models;

import jakarta.persistence.*;

import lombok.Data;
import java.io.Serializable;


@Entity
@Data
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private double price;
    private String genre;
    @Column(length = 1000)
    private String description;
}
