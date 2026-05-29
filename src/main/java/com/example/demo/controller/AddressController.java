package com.example.demo.controller;

import com.example.demo.entity.Address;
import com.example.demo.Service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
        import java.util.List;

@RestController
@RequestMapping("/api/addresses")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    // ADD ADDRESS
    @PostMapping
    public Address add(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    // GET USER ADDRESSES
    @GetMapping("/user/{userId}")
    public List<Address> getUserAddresses(@PathVariable Long userId) {
        return addressService.getUserAddresses(userId);
    }

    // GET DEFAULT ADDRESS
    @GetMapping("/user/{userId}/default")
    public Address getDefault(@PathVariable Long userId) {
        return addressService.getDefaultAddress(userId);
    }
}
