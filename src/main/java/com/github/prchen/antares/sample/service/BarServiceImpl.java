package com.github.prchen.antares.sample.service;

import com.github.prchen.antares.sample.context.MainDataSource;
import org.springframework.beans.factory.annotation.Autowired;

public class BarServiceImpl implements BarService {

    @Autowired
    private MainDataSource dataSource;

    @Override
    public void doSomething() {
        // do something
    }

}
