package com.raven.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.raven.dao.PayMapper;

//@Configuration
/*public class WebConfig {
	@Bean
	public PayMapper getPayMapper() throws Exception {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		PayMapper mapper = openSession.getMapper(PayMapper.class);
		return mapper;
	}
	public SqlSessionFactory  getSqlSessionFactory() throws Exception {
		InputStream resourceAsStream = Resources.getResourceAsStream("config/mybatis-config.xml");
		return new SqlSessionFactoryBuilder().build(resourceAsStream);
		
	}
}*/
