package com.dbs.test;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.dbs.demo.bean.Order;

public class Testmybatis {
	//psvm
	//fori
	//sout
	@Test
	public void test01() throws IOException {

		SqlSession session = MybatisUtils.getFactory().openSession();
		String statement = "com.dbs.test.orderMapper.getOrder";
		Order order = new Order();
		order = session.selectOne(statement,1);
		session.commit();
		System.out.println(order);	
	}
	
	@Test
	public void test02() throws IOException {
		
		SqlSession session = MybatisUtils.getFactory().openSession();
		String statement = "com.dbs.test.orderMapper.getOrderResultMap";
		Order order = new Order();
		order = session.selectOne(statement,1);
		session.commit();
		System.out.println(order);	
	}
}
