package com.example.demo.ServiceImpl;

import com.example.demo.entity.Restaurant;
import com.example.demo.Repository.RestaurantRepository;
import com.example.demo.Service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {

        restaurant.setCreatedAt(LocalDateTime.now());

        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public List<Restaurant> getOpenRestaurants() {
        return restaurantRepository.findByIsOpenTrue();
    }

    @Override
    public List<Restaurant> getRestaurantsByOwner(Long ownerId) {
        return restaurantRepository.findByOwnerId(ownerId);
    }
}