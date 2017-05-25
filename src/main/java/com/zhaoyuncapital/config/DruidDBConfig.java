package com.zhaoyuncapital.config;

import org.springframework.context.annotation.Configuration;

/**
 * Created by gongtuo on 2017/5/19.
 */
@Configuration
public class DruidDBConfig {

//    private Logger logger= LoggerFactory.getLogger(DruidDBConfig.class);
//
//    @Value("${spring.datasource.url}")
//    private String dbUrl;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Value("${spring.datasource.driver-class-name}")
//    private String driverClassName;
//
//    @Value("${spring.datasource.initialSize}")
//    private int initialSize;
//
//    @Value("${spring.datasource.minIdle}")
//    private int minIdle;
//
//    @Value("${spring.datasource.maxActive}")
//    private int maxActive;
//
//    @Value("${spring.datasource.maxWait}")
//    private int maxWait;
//
//    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
//    private int timeBetweenEvictionRunsMillis;
//
//    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
//    private int minEvictableIdleTimeMillis;
//
//    @Value("${spring.datasource.validationQuery}")
//    private String validationQuery;
//
//    @Value("${spring.datasource.testWhileIdle}")
//    private boolean testWhileIdle;
//
//    @Value("${spring.datasource.testOnBorrow}")
//    private boolean testOnBorrow;
//
//    @Value("${spring.datasource.testOnReturn}")
//    private boolean testOnReturn;
//
//    @Value("${spring.datasource.poolPreparedStatements}")
//    private boolean poolPreparedStatements;
//
//    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
//    private int maxPoolPreparedStatementPerConnectionSize;
//
//    @Value("${spring.datasource.filters}")
//    private String filters;
//
//    @Value("{spring.datasource.connectionProperties}")
//    private String connectionProperties;
//
//    @Bean
//    @Primary
//    public DataSource dataSource(){
//        DruidDataSource datasource=new DruidDataSource();
//
//        datasource.setUrl(this.dbUrl);
//        datasource.setUsername(username);
//        datasource.setPassword(password);
//        datasource.setDriverClassName(driverClassName);
//
//        //configuration
//        datasource.setInitialSize(initialSize);
//        datasource.setMinIdle(minIdle);
//        datasource.setMaxActive(maxActive);
//        datasource.setMaxWait(maxWait);
//        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
//        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
//        datasource.setValidationQuery(validationQuery);
//        datasource.setTestWhileIdle(testWhileIdle);
//        datasource.setTestOnBorrow(testOnBorrow);
//        datasource.setTestOnReturn(testOnReturn);
//        datasource.setPoolPreparedStatements(poolPreparedStatements);
//        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
//        try {
//            datasource.setFilters(filters);
//        } catch (SQLException e) {
//            logger.error("druid configuration initialization filter", e);
//        }
//        datasource.setConnectionProperties(connectionProperties);
//
//        return datasource;
//
//
//    }

//    @Bean(name="writeDataSource", destroyMethod = "close", initMethod="init")
//    @Primary
//    public DataSource writeDataSource() {
//        logger.debug("Configruing Write DataSource");
//
//        DruidDataSource datasource = new DruidDataSource();
//        datasource.setUrl(this.dbUrl);
//        datasource.setDriverClassName(driverClassName);
//        datasource.setUsername(username);
//        datasource.setPassword(password);
//
//        return datasource;
//    }
//
//    @Bean(name="readOneDataSource", destroyMethod = "close", initMethod="init")
//    public DataSource readOneDataSource() {
//        logger.debug("Configruing Read One DataSource");
//        DruidDataSource datasource = new DruidDataSource();
//        datasource.setUrl(this.dbUrl);
//        datasource.setDriverClassName(driverClassName);
//        datasource.setUsername(username);
//        datasource.setPassword(password);
//
//        return datasource;
//    }
//
//    @Bean(name="readTowDataSource", destroyMethod = "close", initMethod="init")
//    public DataSource readTowDataSource() {
//        logger.debug("Configruing Read Two DataSource");
//
//        DruidDataSource datasource = new DruidDataSource();
//        datasource.setUrl(this.dbUrl);
//        datasource.setDriverClassName(driverClassName);
//        datasource.setUsername(username);
//        datasource.setPassword(password);
//
//        return datasource;
//    }
//
//
//    @Bean(name="readDataSources")
//    public List<DataSource> readDataSources(){
//        List<DataSource> dataSources = new ArrayList<DataSource>();
//        dataSources.add(readOneDataSource());
//        dataSources.add(readTowDataSource());
//        return dataSources;
//    }
}
