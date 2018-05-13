package com.github.prchen.antares.sample.framework;

import com.github.prchen.antares.starter.AntaresFactoryBean;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.lang.Nullable;

public class SampleDataSourceFactoryBean extends AntaresFactoryBean {

    @Nullable
    @Override
    public Object getObject() throws Exception {
        SampleDataSource meta = getObjectType().getAnnotation(SampleDataSource.class);
        HikariDataSource dataSource = (HikariDataSource) getObjectType().newInstance();
        dataSource.setJdbcUrl(meta.jdbcUrl());
        dataSource.setUsername(meta.username());
        dataSource.setPassword(meta.password());
        return dataSource;
    }

}
