package cn.wangfan.factory;

import cn.wangfan.service.IDeptService;
import cn.wangfan.service.IEmpService;
import cn.wangfan.service.impl.DeptServiceImpl;
import cn.wangfan.service.impl.EmpServiceImpl;
/**
 * 业务层工厂类
 * 这里不区分前后台业务工厂
 * @author wangfan
 *
 */
public class ServiceFactory {
	public static IEmpService getIEmpServiceInstance(){
		return new EmpServiceImpl();
	}
	public static IDeptService getIDeptServiceInstance(){
		return new DeptServiceImpl();
	}
}
