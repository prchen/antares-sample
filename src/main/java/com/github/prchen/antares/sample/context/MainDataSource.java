package com.github.prchen.antares.sample.context;

import com.github.prchen.antares.sample.framework.SampleDataSource;
import com.zaxxer.hikari.HikariDataSource;

@SampleDataSource(jdbcUrl = "jdbc:h2:mem:sampleDatabase")
public class MainDataSource extends HikariDataSource {
}
