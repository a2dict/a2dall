package com.a2dict.a2dall.conf;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.ServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by a2dict on 2019/10/22
 */
@Configuration
public class EBeanConfig {
    @Bean
    public EbeanServer configEbean(DataSource dataSource) {
        ServerConfig config = new ServerConfig();
        config.setName("db");
        config.setDefaultServer(true);
        config.setDataSource(dataSource);
        return EbeanServerFactory.create(config);
    }
}
