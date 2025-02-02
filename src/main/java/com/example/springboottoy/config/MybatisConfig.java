package com.example.springboottoy.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * fileName     : MybatisConfig
 * author       : HyunSeo Na
 * date         : 2025-02-02
 * description  : Mybatis 설정
 */
@Configuration
@MapperScan(basePackages = "com.example.springboottoy.mappers", sqlSessionFactoryRef = "devSqlSessionFactory")
public class MybatisConfig {
    final ApplicationContext applicationContext;

    public MybatisConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /* Hikari 적용 */
    @Bean(name="devHikariConfig")
    @ConfigurationProperties(prefix = "spring.datasource.dev.hikari")
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }

    @Primary
    @Bean(name="devDataSource")
    public HikariDataSource devDataSource(@Autowired @Qualifier("devHikariConfig") HikariConfig hikariConfig) {
        HikariDataSource dataSource = new HikariDataSource(hikariConfig());
        return dataSource;
    }

    @Primary
    @Bean
    public SqlSessionFactory devSqlSessionFactory(@Qualifier("devDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:/config/mybatis-config.xml"));
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mappers/*-mapper.xml"));
        return sqlSessionFactoryBean.getObject();
    }
}