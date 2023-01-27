package com.Order_Service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ORDER_TB")
public class Order {


    public static int getPrice;
    @Id
    private int id;
    private String name;
    private int qty;
    private double price;
}
