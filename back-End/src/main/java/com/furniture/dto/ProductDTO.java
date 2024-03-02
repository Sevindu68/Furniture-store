package com.furniture.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private int productId;

    private String name;

    private  int price;

    private int quantity;

    private  String imageName;

    private String productDescription;

    private String category;

}