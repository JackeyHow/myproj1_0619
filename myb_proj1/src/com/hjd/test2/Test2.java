package com.hjd.test2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.hjd.bean.User;
import com.hjd.utils.MybatisUtil;

public class Test2 {
/*
	@Test
	public void testAdd(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession();
		
		String statement = "com.hjd.test2.userMapper.addUser";
		int result = session.insert(statement, new User(-1, "Jason", 23));
		//手动提交
		//session.commit();
		 * //用完session后需要关掉
		session.close();
		System.out.println(result);
	}
	
	@Test
	public void updateTest(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		//自动提交
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test2.userMapper.updateUser";
		int result = session.update(statement, new User(4, "Jackson", 23));
		//用完session后需要关掉
		session.close();
		System.out.println(result);
	}

	@Test
	public void deleteTest(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test2.userMapper.deleteUser";
		int result = session.delete(statement, 6);
		//用完session后需要关掉
		session.close();
		System.out.println(result);
	}

	@Test
	public void getUserTest(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test2.userMapper.getUser1";
		User user = session.selectOne(statement, 1);
		//用完session后需要关掉
		session.close();
		System.out.println(user);
	}
*/
	@Test
	public void getAllTest(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		String statement = "com.hjd.test2.userMapper.getAllUser";
		List<User> all = session.selectList(statement);
		//用完session后需要关掉
		session.close();
		System.out.println(all);
	}

/*
	@Test
	public void testAdd2(){
		SqlSessionFactory factory = MybatisUtil.getFactory();
		SqlSession session = factory.openSession(true);
		
		UserMapperIn mapper = session.getMapper(UserMapperIn.class);
		int result = mapper.add(new User(-1,"Louis", 27));
		session.close();
		System.out.println(result);
	}
*/
}
