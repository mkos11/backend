package com.backend.project.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponseModel {

    private int userId;
    private String name;
    private Address address;

}
