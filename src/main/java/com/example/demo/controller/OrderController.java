package com.example.demo.controller;

import com.example.demo.entity.Order;
import com.example.demo.Service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    // PLACE ORDER
    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    // GET USER ORDERS
    @GetMapping("/user/{userId}")
    public List<Order> getUserOrders(@PathVariable Long userId) {
        return orderService.getOrdersByUser(userId);
    }

    // GET RESTAURANT ORDERS
    @GetMapping("/restaurant/{restaurantId}")
    public List<Order> getRestaurantOrders(@PathVariable Long restaurantId) {
        return orderService.getOrdersByRestaurant(restaurantId);
    }

    // UPDATE STATUS
    @PutMapping("/{orderId}/status")
    public Order updateStatus(@PathVariable Long orderId,
                              @RequestParam String status) {
        return orderService.updateStatus(orderId, status);
    }
}
