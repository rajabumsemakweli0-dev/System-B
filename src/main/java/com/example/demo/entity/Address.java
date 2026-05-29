
        package com.example.demo.entity;
import jakarta.persistence.*;
        import lombok.*;
@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Owner of address
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private String addressLine;
    private String city;
    // GPS coordinates (VERY IMPORTANT for Tanzania)
    private Double latitude;
    private Double longitude;
    // Default address
    private Boolean isDefault;
}

