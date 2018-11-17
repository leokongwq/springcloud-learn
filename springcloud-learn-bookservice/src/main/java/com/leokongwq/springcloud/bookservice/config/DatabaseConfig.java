package com.leokongwq.springcloud.bookservice.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author jiexiu
 */
@Configuration
@Slf4j
public class DatabaseConfig {

    @Resource
    private DruidProperty druidProperty;

    @Primary
    @Bean
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(druidProperty.getUrl());
        datasource.setUsername(druidProperty.getUsername());
        datasource.setPassword(druidProperty.getPassword());
        datasource.setDriverClassName(druidProperty.getDriverClassName());

        //configuration
        datasource.setInitialSize(druidProperty.getInitialSize());
        datasource.setMinIdle(druidProperty.getMinIdle());
        datasource.setMaxActive(druidProperty.getMaxActive());
        datasource.setMaxWait(druidProperty.getMaxWait());
        datasource.setTimeBetweenEvictionRunsMillis(druidProperty.getTimeBetweenEvictionRunsMillis());
        datasource.setMinEvictableIdleTimeMillis(druidProperty.getMinEvictableIdleTimeMillis());
        datasource.setValidationQuery(druidProperty.getValidationQuery());
        datasource.setTestWhileIdle(druidProperty.isTestWhileIdle());
        datasource.setTestOnBorrow(druidProperty.isTestOnBorrow());
        datasource.setTestOnReturn(druidProperty.isTestOnReturn());
        try {
            datasource.setFilters(druidProperty.getFilters());
        } catch (SQLException e) {
            log.error("error load Druid Filter", e);
        }

        return datasource;
    }

    @Bean(name = "primaryDataSource")
    @ConfigurationProperties(prefix="spring.datasource.primary")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

    @Bean(name = "secondaryDataSource")
    @ConfigurationProperties(prefix="spring.datasource.secondary")
    public DataSource secondaryDataSource() {
        return DataSourceBuilder.create().type(DruidDataSource.class).build();
    }

}