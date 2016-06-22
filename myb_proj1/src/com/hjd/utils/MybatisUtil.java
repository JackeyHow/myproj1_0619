package com.hjd.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hjd.test.Test;

public class MybatisUtil {
	public static SqlSessionFactory getFactory(){
		String resource = "conf.xml";
		InputStream input = Test.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
		return factory;
	}
}
