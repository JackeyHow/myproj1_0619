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
		//����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
		InputStream input = Test.class.getClassLoader().getResourceAsStream(resource);
		//����sqlSession�Ĺ���
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input);
		//������ִ��ӳ���ļ���sql��sqlSession
		SqlSession session = factory.openSession();
		//ӳ��sql�ı�ʶ�ַ���
		String statement = "com.hjd.test.userMapper.getUser";
		User user = session.selectOne(statement, 1);
		System.out.println(user);
	}

}
