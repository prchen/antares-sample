package com.github.prchen.antares.sample.framework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloServiceHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getReturnType() == String.class) {
            return "Hello World!";
        }
        return null;
    }
}
