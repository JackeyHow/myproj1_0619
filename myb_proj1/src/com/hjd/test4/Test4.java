package com.hjd.test4;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.hjd.bean.Classes;
import com.hjd.utils.MybatisUtil;

public class Test4 {

/*	@Test
	public void getTest1() {
		// TODO Auto-generated method stub
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test4.classMapper.getClass";
		Classes c = session.selectOne(statement, 1);
		//����session����Ҫ�ص�
		System.out.println(c);
		session.close();
	}
*/
	@Test
	public void getTest2(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test4.classMapper.getClass2";
		Classes c = session.selectOne(statement, 1);
		//����session����Ҫ�ص�
		System.out.println(c);
		session.close();
	}

}
