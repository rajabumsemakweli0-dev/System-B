package com.example.demo.Service;


import com.example.demo.entity.Address;
import java.util.List;

public interface AddressService {

    Address addAddress(Address address);

    List<Address> getUserAddresses(Long userId);

    Address getDefaultAddress(Long userId);
}
