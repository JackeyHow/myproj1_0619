package com.hjd.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hjd.bean.User;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String resource = "conf.xml"; 
		//加载mybatis的配置文件（它也加载关联的映射文件）
		InputStream input = Test.class.getClassLoader().getResourceAsStream(resource);
		//构建sqlSession的工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
		//创建能执行映射文件中sql的sqlSession
		SqlSession session = factory.openSession();
		//映射sql的标识字符串
		String statement = "com.hjd.test.userMapper.getUser";
		User user = session.selectOne(statement, 1);
		System.out.println(user);
	}

}
