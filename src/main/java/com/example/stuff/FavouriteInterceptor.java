package com.example.stuff;

import io.micronaut.aop.ConstructorInterceptor;
import io.micronaut.aop.ConstructorInvocationContext;
import io.micronaut.aop.InterceptorBean;
import io.micronaut.core.annotation.NonNull;
import jakarta.inject.Singleton;

import java.lang.reflect.Field;

@Singleton
@InterceptorBean(FavouriteSetter.class)
public class FavouriteInterceptor implements ConstructorInterceptor<Product> {

    @Override
    public @NonNull Product intercept(@NonNull ConstructorInvocationContext<Product> context) {
        Object target = context.getTarget();
        System.out.println("Product created");
        try {
            Field field = target.getClass().getDeclaredField("favorite");
            field.setAccessible(true);
            field.set(target, false);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return (Product) target;
    }
}
