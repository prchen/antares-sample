package com.github.prchen.antares.sample.framework;

import com.github.prchen.antares.starter.AntaresManifestAdvice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@AntaresManifestAdvice(factoryClass = SampleDataSourceFactoryBean.class)
public @interface SampleDataSource {
    String jdbcUrl();
    String username() default "";
    String password() default "";
}
