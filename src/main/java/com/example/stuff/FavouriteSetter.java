package com.example.stuff;

import io.micronaut.aop.AroundConstruct;
import io.micronaut.aop.InterceptorBinding;
import io.micronaut.aop.InterceptorKind;
import io.micronaut.context.annotation.Prototype;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@AroundConstruct // (1)
@InterceptorBinding(kind = InterceptorKind.POST_CONSTRUCT) // (2)
@Prototype //
public @interface FavouriteSetter {
}
