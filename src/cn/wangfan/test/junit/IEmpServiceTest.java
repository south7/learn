package cn.wangfan.test.junit;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import cn.wangfan.factory.ServiceFactory;
import cn.wangfan.vo.Emp;
import junit.framework.TestCase;

public class IEmpServiceTest {

	@Test
	public void testInsert() {
		Emp vo=new Emp();
		vo.setEmpno(33);
		vo.setEname("小明");
		vo.setJob("工程师");
		vo.setHiredate(new Date());
		vo.setSal(10000.0);
		vo.setComm(2000.0);
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().insert(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdate() {
		Emp vo=new Emp();
		vo.setEmpno(33);
		vo.setEname("小王");
		vo.setJob("工程师");
		vo.setHiredate(new Date());
		vo.setSal(10000.0);
		vo.setComm(2000.0);
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().update(vo));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDelete() {
		Set<Integer> ids=new HashSet<Integer>();
		ids.add(33);
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().delete(ids));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGet() {
		try {
			TestCase.assertNotNull(ServiceFactory.getIEmpServiceInstance().get(33));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testList() {
		try {
			TestCase.assertTrue(ServiceFactory.getIEmpServiceInstance().list().size()>0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testListIntIntStringString() {
		try {
			Map<String, Object> map = ServiceFactory.getIEmpServiceInstance().list(1, 10, "ename", "小");
			int count = (Integer)map.get("empCount");
			List<Emp> all=(List<Emp>)map.get("allEmps");
			TestCase.assertTrue(count>0&&all.size()>0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
