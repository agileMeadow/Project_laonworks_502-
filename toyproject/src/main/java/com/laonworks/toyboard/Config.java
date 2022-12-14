package com.laonworks.toyboard;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan
@ConfigurationProperties(prefix = "spring.datasource") 
public class Config {
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
		
		factoryBean.setDataSource(dataSource);
		factoryBean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("static/mapper/*.xml")
				);
		
		/* Alias 설정 */
		factoryBean.setTypeAliasesPackage("com.laonworks.toyboard.model");
		return factoryBean.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
