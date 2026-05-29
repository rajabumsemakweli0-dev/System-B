package com.example.demo.Repository;

import com.example.demo.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    // Must match the "isOpen" field exactly
    List<Restaurant> findByIsOpenTrue();

    // Must match the "ownerId" field exactly
    List<Restaurant> findByOwnerId(Long ownerId);
}
