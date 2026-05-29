package com.example.demo.Service;


import com.example.demo.entity.MenuItem;
import java.util.List;

public interface MenuItemService {

    MenuItem createMenuItem(MenuItem menuItem);

    List<MenuItem> getAllMenuItems();

    List<MenuItem> getByRestaurant(Long restaurantId);

    List<MenuItem> getAvailableItems();
}

