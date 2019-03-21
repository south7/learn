package cn.wangfan.test.junit;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import cn.wangfan.factory.ServiceFactory;
import cn.wangfan.vo.Dept;
import junit.framework.TestCase;

public class IDeptServiceTest {

	@Test
	public void testInsert() {
		Dept vo=new Dept();
		vo.setDeptno(22);
		vo.setDname("交通");
		vo.setLoc("深圳");
		try {
			TestCase.assertTrue(ServiceFactory.getIDeptServiceInstance().insert(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		Dept vo=new Dept();
		vo.setDeptno(22);
		vo.setDname("工商");
		vo.setLoc("深圳");
		try {
			TestCase.assertTrue(ServiceFactory.getIDeptServiceInstance().update(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Test
	public void testDelete() {
		Set<Integer> ids =new HashSet<Integer>();
		ids.add(22);
		try {
			TestCase.assertTrue(ServiceFactory.getIDeptServiceInstance().delete(ids));
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Test
	public void testList() {
		try {
			TestCase.assertTrue(ServiceFactory.getIDeptServiceInstance().list().size()>0);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Test
	public void testGet() {
		try {
			TestCase.assertNotNull(ServiceFactory.getIDeptServiceInstance().get(22));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
