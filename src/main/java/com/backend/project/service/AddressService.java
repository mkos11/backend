package com.backend.project.service;

import com.backend.project.model.Address;
import com.backend.project.model.User;
import com.backend.project.model.UserResponseModel;
import com.backend.project.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepository addressRepository;

    @Autowired
    UserService userService;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public List<Address> fetchAllAddress() {
        return addressRepository.findAll();
    }

    public UserResponseModel findByUserId(int userId) {
        User user = userService.findByUserId(userId);
        Address address = addressRepository.findByUserId(userId);
        return UserResponseModel.builder()
                .name(user.getName())
                .userId(user.getId())
                .address(address)
                .build();
    }
}
