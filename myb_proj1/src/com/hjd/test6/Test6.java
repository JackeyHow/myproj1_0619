package com.hjd.test6;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.hjd.bean.Classes;
import com.hjd.bean.ConditionUser;
import com.hjd.bean.User;
import com.hjd.utils.MybatisUtil;

public class Test6 {

	@Test
	public void getTest1() {
		// TODO Auto-generated method stub
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test6.userMapper.getUser";
		
		String name = "o";
		name = null;
		ConditionUser parameter = new ConditionUser("%"+name+"%", 13, 18);
		List<User> list = session.selectList(statement, parameter);
		//用完session后需要关掉
		System.out.println(list);
		session.close();
	}
/*
	@Test
	public void getTest2(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test5.classMapper.getClass2";
		Classes c = session.selectOne(statement, 1);
		//用完session后需要关掉
		System.out.println(c);
		session.close();
	}

*/
}
