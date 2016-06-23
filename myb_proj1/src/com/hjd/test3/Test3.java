package com.hjd.test3;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.hjd.bean.Order;
import com.hjd.utils.MybatisUtil;

public class Test3 {
/*	@Test
	public void getOrder(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test3.orderMapper.getOrder";
		Order order = session.selectOne(statement, 1);
		//用完session后需要关掉
		session.close();
		System.out.println(order);
	}
*/
	@Test
	public void getOrder2(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test3.orderMapper.getOrder2";
		Order order = session.selectOne(statement, 1);
		//用完session后需要关掉
		session.close();
		System.out.println(order);
	}
}
