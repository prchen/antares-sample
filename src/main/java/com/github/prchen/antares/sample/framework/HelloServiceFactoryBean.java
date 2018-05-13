package com.github.prchen.antares.sample.framework;

import com.github.prchen.antares.starter.AntaresFactoryBean;
import org.springframework.lang.Nullable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class HelloServiceFactoryBean extends AntaresFactoryBean {

    @Nullable
    @Override
    public Object getObject() throws Exception {
        ClassLoader classLoader = getObjectType().getClassLoader();
        Class<?>[] interfaces = new Class[] {getObjectType()};
        InvocationHandler handler = new HelloServiceHandler();
        return Proxy.newProxyInstance(classLoader, interfaces, handler);
    }

}
