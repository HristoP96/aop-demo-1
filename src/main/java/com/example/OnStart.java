package com.example;

import com.example.stuff.Product;
import com.example.stuff.ProductService;
import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class OnStart implements ApplicationEventListener<StartupEvent> {
    @Inject
    ProductService productService;

    @Override
    public void onApplicationEvent(StartupEvent event) {
        productService.addProduct(new Product());
        System.out.printf("Is my product favorite %s%n", productService.getProduct(0).getFavorite());
    }
}
