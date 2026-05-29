package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime; // Required import

@Entity
@Table(name = "restaurants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;

    // 1. ADDED TO FIX: method setCreatedAt(java.time.LocalDateTime)
    private LocalDateTime createdAt;

    // 2. ADDED TO FIX: method setIsOpen(boolean)
    private boolean isOpen;

    // 3. BONUS: Added to prevent errors with getRestaurantsByOwner(ownerId)
    private Long ownerId;
}
