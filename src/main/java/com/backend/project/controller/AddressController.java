package com.backend.project.controller;

import com.backend.project.model.Address;
import com.backend.project.model.UserResponseModel;
import com.backend.project.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/create")
    public Address createAddress(@RequestBody Address address){
        return addressService.saveAddress(address);
    }

    @GetMapping("/fetch")
    public List<Address> fetchAllAddress(){
        return addressService.fetchAllAddress();
    }

    @GetMapping("/fetch/user/{userId}")
    public UserResponseModel fetchByUserId(@PathVariable("userId") int userId){
        return addressService.findByUserId(userId);
    }


}
