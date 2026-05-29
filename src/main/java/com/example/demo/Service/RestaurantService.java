package com.example.demo.Service;

import com.example.demo.entity.Restaurant;
import java.util.List;

public interface RestaurantService {

    Restaurant createRestaurant(Restaurant restaurant);

    List<Restaurant> getAllRestaurants();

    List<Restaurant> getOpenRestaurants();

    List<Restaurant> getRestaurantsByOwner(Long ownerId);
}