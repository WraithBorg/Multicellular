package org.ac.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ProductOrder {

    private int id;

    private double amount;

    private int userId;

    private String userName;

    private int productId;
}
