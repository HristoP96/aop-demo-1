package com.example.stuff;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class ProductService {

    private final List<Product> bucket = new ArrayList<>();

    public void addProduct(Product product) {
        bucket.add(product);
    }

    public Product getProduct(int index) {
        return bucket.get(index);
    }
}
